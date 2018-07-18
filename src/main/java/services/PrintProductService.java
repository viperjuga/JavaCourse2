package services;

import database.Database;
import domain.Product;

import java.util.List;

public class PrintProductService {

    private Database database;

    public PrintProductService(Database database) {
        this.database = database;
    }

    public List<Product> getAllProducts() {
        return database.getAllProducts();
    }

}
