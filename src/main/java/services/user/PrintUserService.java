package services.user;

import database.Database;
import domain.User;
import enums.UserType;

import java.util.List;
import java.util.Optional;

public class PrintUserService {
    private Database database;

    public PrintUserService (Database database){
        this.database = database;
    }

    public List<User> GetUsersByType(UserType type){
       return database.getAllUsersByType(type);
    }

    public Optional<User> GetCurrentUserById(Long id){
        return database.getUserById(id);
    }
}
