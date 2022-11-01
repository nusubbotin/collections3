import product.Product;
import product.ProductSet;
import recipe.Recipe;
import recipe.RecipeSet;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;

public class Main {

    static Map<String, Integer> map = new HashMap<>();

    public static void main(String[] args) {

        task1();
        task2();
        task3();
        task4();
    }

    private static void task4() {
        System.out.println("\n Часть2. Задание 1:");

        Map<String, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < 5; i++) {
            map.put("strint"+(i+1), new ArrayList<>(List.of(ThreadLocalRandom.current().nextInt(0, 1000), ThreadLocalRandom.current().nextInt(0, 1000), ThreadLocalRandom.current().nextInt(0, 1000))));
        }


        StringBuilder builder = new StringBuilder();
        for (Map.Entry<String, List<Integer>> entry : map.entrySet()) {
            builder.append(entry.getKey()).append(" ---> ");
            for (Integer num : entry.getValue()) {
                builder.append(num).append(",");
            }
            builder.append("\n");
        }
        System.out.println(builder.toString());

        Map<String, Integer> mapInt = new HashMap<>();
        Integer sum;
        for (Map.Entry<String, List<Integer>> entry : map.entrySet()) {
            sum = 0;
            for (Integer num : entry.getValue()) {
                sum += num;
            }
            mapInt.put(entry.getKey(), sum);
        }

        builder = new StringBuilder();
        for (Map.Entry<String, Integer> entry : mapInt.entrySet()) {
           builder.append(entry.getKey()).append(" ---> ").append(entry.getValue()).append("\n");
        }
        System.out.println(builder.toString());

    }


    public static void addNode(String key, Integer value) {
        if (!map.containsKey(key) || !map.containsValue(value)){
            map.put(key, value);
        } else if (map.containsKey(key) && map.containsValue(value) ) {
            throw new IllegalArgumentException("В мапе не может быть 2х одинаковых пар");
        }
    }

    public static String toStringMap(Map<String, Integer> map) {
        StringBuilder builder = new StringBuilder();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            builder.append(entry.getKey()).append(" ---> ").append(entry.getValue()).append("\n");
        }
        return builder.toString();
    }

    private static void task3() {
        System.out.println("\n Часть1. Задание 3:");

        addNode("str1", 2);
        addNode("str2", 1);
        //addNode("str1", 2); //  В мапе не может быть 2х одинаковых пар
        addNode("str1", 5);
        System.out.println(toStringMap(map));
    }

    private static void task1() {
        System.out.println("Часть1. Задание 1:");

        PhoneBook phone = new PhoneBook();
        for (int i = 0; i < 20; i++) {
            phone.putPhone("Иван Иванов"+i, "895220941"+i);
        }

        System.out.println(phone);
    }

    private static void task2() {
        System.out.println("Часть1. Задание 2:");

        RecipeSet recipeSet = new RecipeSet();

        ProductSet productSet1 = new ProductSet();
        productSet1.addProduct(new Product("апельсины", 120.50f), 1f);
        productSet1.addProduct(new Product("мандарины", 100), 3f);
        productSet1.addProduct(new Product("мандарины", 100), 2f);

        recipeSet.addRecipe(new Recipe("Тропический салат", productSet1));

        ProductSet productSet2 = new ProductSet();
        productSet2.addProduct(new Product("картофель", 40), 10f);
        productSet2.addProduct(new Product("огурцы", 60),  3f);
        recipeSet.addRecipe(new Recipe("Овощной салат", productSet2));
        System.out.println(recipeSet);

    }
}