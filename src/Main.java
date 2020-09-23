public class Main {
    public static void main(String[] args) {
        ProductCatalog newCatalog = new ProductCatalog();
        Product product1 = new Product(1254, "Молоко", 50, "Напиток");
        Product product2 = new Product(1274, "Молоко", 50, "Напиток");

        try {
            newCatalog.createProduct(product1);
        } catch (ProductAlreadyExists exc) {
            System.out.println(exc.getMessage());
        }


        Product product3 = new Product(1254, 30, "Хлебо-булочное изделие. ");
        try {
            newCatalog.updateProduct(product3);
        }
        catch(ProductNotValid exc) {
            System.out.println(exc.getMessage());
        }

        newCatalog.deleteProduct(product2.getID());
    }
}