package services.car;

import domain.Car;

public class AddCarService {
    private InMemoryDatabase database;

    public AddCarService (InMemoryDatabase database){
        this.database = database;
    }

    public void addCar(Car user){
        database.addCar(user);
    }
}
