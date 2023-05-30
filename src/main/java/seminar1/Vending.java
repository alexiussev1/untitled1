package seminar1;

import java.util.ArrayList;
import java.util.List;

//... и ТорговыйАвтомат,
//  содержащий в себе методы initProducts (List <Product>)
//  сохраняющий в себе список исходных продуктов и getProduct(String name)
public class Vending {
    List<Product> list = new ArrayList<>();
    void addProduct(Product product) {
        list.add(product);

    }
    Product getProduct (String name){
        for (Product product : list) {
            if (name.equals(product.kind)) {
                return product;
            }
        }
        return null;
    }

}
