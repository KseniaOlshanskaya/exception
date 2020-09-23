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

    public void updateProduct(Product product) throws ProductNotFound{
        boolean result = false;
        Product foundProduct = null;
        for(Product pr:this.listOfProducts) {
            if (product.getID() == pr.getID()) {
                result = true;
                foundProduct = pr;
                break;
            }
        }
        if(result) {
            this.listOfProducts.remove(foundProduct);
            this.listOfProducts.add(product);
        }
        else {
            throw new ProductNotFound("Продукта с таким идентификатором не существует. ");
        }
    }

}
