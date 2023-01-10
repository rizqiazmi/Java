package programmer.zaman.now.data;

public class ProductApp {
    public static void main(String[] args) {

        Product product = new Product("Mac Book Air", 25000000);
        System.out.println(product.name);
        System.out.println(product.price);

        System.out.println(product);

        Product product2 = new Product("Mac Book Air", 25000000);

        System.out.println(product.equals(product2));
    }
}
