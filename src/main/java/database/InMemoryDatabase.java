package database;

import domain.Car;
import domain.CarRent;
import domain.HomeAddress;
import domain.User;

import java.util.ArrayList;
import java.util.List;

public class InMemoryDatabase {
    private List<User> users = new ArrayList<>();
    private List<Car> cars = new ArrayList<>();
    private List<CarRent> carsRent = new ArrayList<>();
    private List<HomeAddress> address = new ArrayList<>();

}
