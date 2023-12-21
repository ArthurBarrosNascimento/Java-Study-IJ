package application;

import entities.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Program11 {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        Predicate<Product> pred = p -> p.getPrice() >= 100;

        list.removeIf(pred);

        for (Product p: list) {
            System.out.println(p.getName() + ": " + p.getPrice());
        }
    }
}
