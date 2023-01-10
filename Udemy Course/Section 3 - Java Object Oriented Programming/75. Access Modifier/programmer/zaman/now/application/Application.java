package programmer.zaman.now.application;

import programmer.zaman.now.data.Product;

public class Application {
    public static void main(String[] args) {

        Product product = new Product("Mac book Air", 25_000_000);
        System.out.println(product.name);
        System.out.println(product.price);
    }
}
