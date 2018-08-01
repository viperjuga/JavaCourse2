package services.car;

import database.Database;
import domain.Car;

public class RemoveCarService {
    private Database database;

    public RemoveCarService (Database database){
        this.database = database;
    }

    public void removeCar(Car user){
        database.removeCar(user);
    }
}
