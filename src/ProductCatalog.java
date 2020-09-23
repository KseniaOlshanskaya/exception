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

    public void updateProduct(Product product) throws ProductNotValid {
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
            if(product.getName() == null){
                throw new ProductNotValid("Продукт без названия. ");
            }
            this.listOfProducts.remove(foundProduct);
            this.listOfProducts.add(product);
        }
        else {
            throw new ProductNotFound("Продукта с таким идентификатором не существует. ");
        }
    }

    public void deleteProduct(long id){
        boolean result = false;
        for(Product pr : this.listOfProducts) {
            if(pr.getID() == id) {
                result = true;
                this.listOfProducts.remove(pr);
                break;
            }
        }
        if(!result) {
            throw new ProductNotFound("Продукт с идентификатором "+ id + " не найден.");
        }
    }
}
