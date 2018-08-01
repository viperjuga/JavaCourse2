package services.user;

import database.Database;
import domain.User;

public class AddUserService {
    private Database database;

    public AddUserService (Database database){
        this.database = database;
    }

    public void AddUser(User user){
        database.addUser(user);
    };

}
