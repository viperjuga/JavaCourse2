package database;

import domain.Car;
import domain.Rent;
import domain.User;
import enums.CarStatus;
import enums.UserType;

import java.util.Date;
import java.util.List;
import java.util.Optional;

public interface Database {

    //user
    void addUser(User user);
    void updateUser (User user);
    Optional<User> getUserById (Long id);
    List<User> getAllUsersByType(UserType type);


    //cars
    void addCar(Car car);
    void removeCar(Car car);
    void updateCar(Car car);
    List<Car> getAllCars ();
    Optional<Car> getCarById(Long id);
    List<Car> getFreeCarsForDate(Date date);
    //TODO add request with filters


    //rent
    void addRent (Rent rent);
    void updateRentStatus (long rentId, CarStatus status);
    List<Rent> getAllRents ();
    List<Rent> getRentsForCar(Long carId);
    List<Rent> getCurrentClientRents(Long clientId);
    List<Rent> getCurrentOperatorRents (Long operatorId);
    List<Rent> getRentWithStatus(CarStatus status);


}
