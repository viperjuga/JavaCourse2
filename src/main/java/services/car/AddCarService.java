package services.car;

import database.Database;
import domain.Car;

public class AddCarService {
    private Database database;

    public AddCarService (Database database){
        this.database = database;
    }

    public void addCar(Car user){
        database.addCar(user);
    }
}
