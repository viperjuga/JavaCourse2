package services.rent;

import database.Database;
import domain.Rent;

public class AddRentService {

    private Database database;

    public AddRentService (Database database){
        this.database = database;
    }

    public void addRent (Rent rent){
        database.addRent(rent);
    }
}
