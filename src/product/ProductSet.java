package product;

import java.security.PublicKey;
import java.util.*;

public class ProductSet {
    HashMap<Product, Float> productSet = new HashMap<Product, Float>();

    public void addProduct(Product product, Float count) {
        if (count <= 0) {
            count = 1f;
        }
        if (productSet.containsKey(product)){
            productSet.put(product, productSet.get(product) + count);
        }else {
            productSet.put(product, count);
        }
    }

    public Float getSumCost(){
        Float sumCost = 0f;
        for (Map.Entry<Product, Float> entry : productSet.entrySet()) {
            sumCost += entry.getKey().getCost() * entry.getValue();
        }
        return sumCost;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (Map.Entry<Product, Float> entry : productSet.entrySet()) {
            builder.append(entry.getKey().getName()).append(" ---> ").append(entry.getValue()).append("\n");
        }
        return builder.toString();
    }
}
