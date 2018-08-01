package services.rent;

import database.Database;
import enums.CarStatus;

public class UpdateRentService {
    private Database database;

    public UpdateRentService (Database database){
        this.database = database;
    }

    public void updateRentStatus (Long rentId, CarStatus status){
        database.updateRentStatus(rentId, status);
    }
}
