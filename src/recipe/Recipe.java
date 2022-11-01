package recipe;

import product.ProductSet;

import java.util.Objects;

public class Recipe {
    private String name;
    private ProductSet productSet;

    public Recipe(String name, ProductSet productSet) {
        this.name = name;
        this.productSet = productSet;
    }

    public String getName() {
        return name;
    }

    public ProductSet getProductSet() {
        return productSet;
    }

    @Override
    public String toString() {
        return "Recipe{" +
                "name='" + name + '\'' +
                ", productSet=" + productSet +
                ", SummCost=" + productSet.getSumCost() +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Recipe recipe = (Recipe) o;
        return Objects.equals(name, recipe.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
