import product.Product;
import product.ProductSet;
import recipe.Recipe;
import recipe.RecipeSet;

import java.util.HashMap;
import java.util.Map;

public class Main {

    static Map<String, Integer> map = new HashMap<>();

    public static void main(String[] args) {

        task1();
        task2();
        taks3();
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

    private static void taks3() {
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