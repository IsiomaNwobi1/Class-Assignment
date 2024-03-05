package week6_curriculum.class_activity_7A;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class WithoutJavaString {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();
        List<Float> priceList = new ArrayList<>();

        productList.add(new Product(1, "Phone", 25000f));
        productList.add(new Product(2, "Car", 30000f));
        productList.add(new Product(3, "Bike", 95000f));
        productList.add(new Product(4, "ChessBoard", 5000f));

        for (Product p : productList) {
            if (p.price < 30000) {
                priceList.add(p.price);

                Collections.sort(priceList); //To make the smallest number come first
            }
        }

        //To use stream to do the filtering
        priceList = productList.stream()
                        .filter(p->p.price < 5000)
                                .map(p->p.price)
                                        .collect(Collectors.toList());


        System.out.println(priceList);
    }
}
