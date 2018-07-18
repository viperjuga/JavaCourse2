package services;

import database.Database;
import domain.Product;

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
