package services.user;

import domain.User;

public class AddUserService {
    private InMemoryDatabase database;

    public AddUserService (InMemoryDatabase database){
        this.database = database;
    }

    public void AddUser(User user){
        database.addUser(user);
    };

}
