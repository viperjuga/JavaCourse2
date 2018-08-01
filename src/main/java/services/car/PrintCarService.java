package services.car;

import database.Database;
import domain.Car;

import java.util.Date;
import java.util.List;
import java.util.Optional;

public class PrintCarService {
    private Database database;

    public PrintCarService (Database database){
        this.database = database;
    }

    public List<Car> getAllCars (){
        return database.getAllCars();
    }

    public Optional<Car> getCarById(Long carId){
        return database.getCarById(carId);
    }

    public List<Car> getFreeCarsForDate (Date date){
        return database.getFreeCarsForDate(date);
    }
}
