public class Main {
    public static void main(String[]args) {
        ProductCatalog newCatalog = new ProductCatalog();
        Product product1 = new Product(1254, "Молоко", 50, "Напиток");

        try {
            newCatalog.createProduct(product1);
        }
        catch(ProductAlreadyExists exc) {
            System.out.println(exc.getMessage());
        }

    }
}
