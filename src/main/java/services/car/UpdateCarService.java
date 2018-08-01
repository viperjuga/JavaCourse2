package services.car;

import database.Database;
import domain.Car;

public class UpdateCarService {
    private Database database;

    public UpdateCarService (Database database){
        this.database = database;
    }

    public void updateCar(Car car){
        database.updateCar(car);
    }
}
