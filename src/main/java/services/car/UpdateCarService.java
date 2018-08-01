package services.car;

import database.Database;
import domain.Car;

import java.util.Optional;

public class UpdateCarService {
    private Database database;

    public UpdateCarService (Database database){
        this.database = database;
    }

    public void updateCar(Car newCar){
        Optional<Car> car = database.getCarById(newCar.getId());
        if(car.isPresent()){
            Car updateCar = car.get();
            updateCar.setColor(newCar.getColor());
            updateCar.setFuelType(newCar.getFuelType());
            updateCar.setGearboxType(newCar.getGearboxType());
            updateCar.setMark(newCar.getMark());
            updateCar.setModel(newCar.getModel());
            updateCar.setMotorCapacity(newCar.getMotorCapacity());
            updateCar.setRegisterNumber(newCar.getRegisterNumber());
            database.updateCar(updateCar);
        }

    }
}
