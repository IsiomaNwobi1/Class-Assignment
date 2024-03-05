package week6_curriculum.class_activity_7A;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MaxMinPrice {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();
        List<Float> priceList = new ArrayList<>();

        productList.add(new Product(1, "Phone", 25000f));
        productList.add(new Product(2, "Car", 30000f));
        productList.add(new Product(3, "Bike", 95000f));
        productList.add(new Product(4, "ChessBoard", 5000f));

        for (Product p : productList) {
            priceList.add(p.price);
        }

        Float maxPrice = priceList.stream()
                .max(Comparator.naturalOrder())
                .orElse(null);

        Float minPrice = priceList.stream()
                .min(Comparator.naturalOrder())
                .orElse(null);

        System.out.println("The maximum price is: " + maxPrice);
        System.out.println("The minimum price is: " + minPrice);
    }
}
