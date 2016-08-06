import java.util.ArrayList;
import java.util.List;

/**
 * Created by Hieu It on 8/5/2016.
 */
public class ProductManager {
    List<Product> listProduct = new ArrayList<>();

    public ProductManager(List<Product> products) {
        this.listProduct = products;
    }

    public boolean addProduct(Product product) {
        if (listProduct.add(product)) {
            return true;
        }
        return false;
    }

    public boolean removeProduct(String productId) {
        for (int i = 0; i < listProduct.size(); i++) {
            if (listProduct.get(i).getId().equals(productId)) {
                listProduct.remove(i);
                return true;
            }
        }
        return false;
    }

    public Product findProduct(String productName) {
        for (int i = 0; i < listProduct.size(); i++) {
            if (productName.equals(listProduct.get(i))) {
                return listProduct.get(i);
            }
        }
        return null;
    }

    public void sortProductByName() {
        Product tempProduct = null;
        List<Product> listProduct1 = new ArrayList<>();
        for (int i = 0; i < listProduct.size()-1; i++) {
            for (int j = i+1; j < listProduct.size(); j++) {
                if (listProduct.get(i).getName().compareToIgnoreCase(listProduct.get(j).getName()) > 0) {
                    tempProduct = listProduct.get(i);
                    listProduct.set(i,listProduct.get(j));
                    listProduct.set(j,tempProduct);

                }
            }
        }
    }

    public void sortProductByPrice() {
        Product tempProduct;
        for (int i = 0; i < listProduct.size(); i++) {
            for (int j = i+1;j<listProduct.size();j++) {
                if (listProduct.get(i).getPrice() > listProduct.get(j).getPrice()) {
                    tempProduct = listProduct.get(i);
                    //listProduct.remove(i - 1);
                    //listProduct.add(i - 1, listProduct.get(i));
                    listProduct.set(i, listProduct.get(j));
                    //listProduct.remove(i);
                    //listProduct.add(i, tempProduct);
                    listProduct.set(j, tempProduct);
                }
            }
        }
    }

    public void showAllProduct() {
        for (int i = 0; i < listProduct.size(); i++) {
            listProduct.get(i).toString();
        }
    }
}