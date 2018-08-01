package services.car;

import domain.Car;

public class RemoveCarService {
    private InMemoryDatabase database;

    public RemoveCarService (InMemoryDatabase database){
        this.database = database;
    }

    public void removeCar(Car user){
        database.removeCar(user);
    }
}
