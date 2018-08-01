package services.user;

import domain.User;
import enums.UserType;

import java.util.List;
import java.util.Optional;

public class PrintUserService {
    private InMemoryDatabase database;

    public PrintUserService (InMemoryDatabase database){
        this.database = database;
    }

    public List<User> GetUsrsByType(UserType type){
       return database.getAllUsersByType(type);
    }

    public Optional<User> GetCurrentUserById(Long id){
        return database.getUserById(id);
    }
}
