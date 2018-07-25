package database;

import domain.Car;
import domain.Rent;
import domain.HomeAddress;
import domain.User;
import enums.UserType;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class InMemoryDatabase {
    private List<User> users = new ArrayList<>();
    private List<Car> cars = new ArrayList<>();
    private List<Rent> carsRent = new ArrayList<>();
    private List<HomeAddress> address = new ArrayList<>();

    public void addUser(User user){this.users.add(user);}

    public Optional<User> getUserById (Long id){
       return users.stream().filter(e -> e.getId() == id).findFirst();
    }

    public void updateUser (User user){


    }

    public List<User> getAllUsersByType(UserType type) {
        return (List<User>) users.stream().filter(e -> e.getType() == type);
    }
}
