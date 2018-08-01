package services.car;

import database.Database;
import domain.Car;

import java.util.Optional;

public class RemoveCarService {
    private Database database;

    public RemoveCarService (Database database){
        this.database = database;
    }

    public void removeCar(Long id){
        Optional<Car> car = database.getCarById(id);
        if (car.isPresent())        {
            database.removeCar(car.get());
        }

    }
}
