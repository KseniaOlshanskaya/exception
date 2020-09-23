import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductCatalog {
    ArrayList<Product> listOfProducts = new ArrayList<>();

    public ProductCatalog(){
    }

    public List<Product> getAllProducts() {
        return this.listOfProducts;
    }

    public void createProduct(Product product) throws ProductAlreadyExists{
        if(this.listOfProducts.isEmpty()) {
            this.listOfProducts.add(product);
        }
        else {
            for(Product pr : this.listOfProducts) {
                if(pr.getName().equals(product.getName())){
                    throw new ProductAlreadyExists("Продукт с таким названием уже существует.");
                }
            }
            this.listOfProducts.add(product);
        }

    }

}
