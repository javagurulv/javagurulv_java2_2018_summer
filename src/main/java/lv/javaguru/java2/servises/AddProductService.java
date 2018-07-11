package lv.javaguru.java2.servises;

import lv.javaguru.java2.database.Database;
import lv.javaguru.java2.domain.Product;

public class AddProductService {

    private Database database;

    public AddProductService(Database database) {
        this.database = database;
    }

    public void addProduct(String title, String description) {
        Product product = new Product();
        product.setTitle(title);
        product.setDescription(description);
        database.addProduct(product);
    }

}
