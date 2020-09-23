public class Product {
    private long id;
    private String name = null;
    private double price;
    private String category;

    public Product(long id, String name, double price, String category){
        this.id = id;
        this.name = name;
        this.price = price;
        this.category = category;

    }

    public Product(long id, double price, String category){
        this.id = id;
        this.price = price;
        this.category = category;

    }

    public String getName() {
        return this.name;
    }

    public long getID() {
        return this.id;
    }
}
