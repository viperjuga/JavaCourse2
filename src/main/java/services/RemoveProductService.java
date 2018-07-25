package services;

import database.Database;
import domainProduct.Product;

import java.util.Optional;

public class RemoveProductService {

    private Database database;

    public RemoveProductService(Database database) {
        this.database = database;
    }

    public boolean removeProductByTitle(String title) {
        Optional<Product> foundProduct = database.getByTitle(title);
        if (foundProduct.isPresent()) {
            Product product = foundProduct.get();
            return database.remove(product);
        } else {
            return false;
        }
    }

}
