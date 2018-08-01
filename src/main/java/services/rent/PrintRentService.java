package services.rent;

import database.Database;
import domain.Rent;
import enums.CarStatus;

import java.util.List;

public class PrintRentService {
    private Database database;

    public PrintRentService (Database database){
        this.database = database;
    }

    public List<Rent> getAllRents (){
        return database.getAllRents();
    }

    public List<Rent> getRentsForCar(Long carId){
        return database.getRentsForCar(carId);
    }

    public List<Rent> getCurrentClientRents(Long clientId){
        return database.getCurrentClientRents(clientId);
    }
    public List<Rent> getCurrentOperatorRents (Long operatorId){
        return database.getCurrentOperatorRents(operatorId);
    }
    public List<Rent> getRentWithStatus(CarStatus status){
        return database.getRentWithStatus(status);
    }
}
