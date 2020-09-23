import java.util.ArrayList;
import java.util.List;

public class ProductCatalog {
    ArrayList<Product> listOfProducts = new ArrayList<>();

    public ProductCatalog(){
    }

    public List<Product> getAllProducts() {
        return this.listOfProducts;
    }

}
