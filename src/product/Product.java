package product;

import java.util.Objects;

public class Product {
    private String name;
    private float cost;
    private boolean alreadyBought = false;

    public Product(String name) {
        this(name, 100);
    }

    public Product(String name, float cost) {
        setName(name);
        setCost(cost);
    }

    public String getName() {
        return name;
    }

    public float getCost() {
        return cost;
    }

    public boolean isAlreadyBought() {
        return alreadyBought;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty() || name.isBlank()){
            throw new IllegalArgumentException("Название не может быть пустым. Заполните карточку товара полностью");
        }
        this.name = name;
    }

    public void setCost(float cost) {
        if (cost <= 0) {
            throw new IllegalArgumentException("Цена должен быть положительным числом");
        }else {
            this.cost = cost;
        }
    }

    public void buyProduct() {
        if (!alreadyBought){
            alreadyBought = true;
            System.out.println("Продукт " + name + " купили");
        }else {
            throw new IllegalArgumentException("Товар "+ name +" уже куплен");
        }
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", cost=" + cost +
                ", alreadyBought=" + alreadyBought +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
