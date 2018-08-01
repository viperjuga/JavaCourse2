package database;

import domain.Car;
import domainProduct.Product;

import java.util.List;
import java.util.Optional;

public interface Database {

    void addProduct(Car product);

    Optional<Product> getByTitle(String title);

    boolean remove(Product product);

    List<Product> getAllProducts();
}
