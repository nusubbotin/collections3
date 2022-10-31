import product.Product;
import product.ProductSet;
import recipe.Recipe;
import recipe.RecipeSet;

public class Main {
    public static void main(String[] args) {

        task1();
        task2();

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