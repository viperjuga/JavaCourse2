package services.user;

import database.InMemoryDatabase;
import domain.User;

import java.util.Optional;

public class UpdateUserService {
    private InMemoryDatabase database;

    public UpdateUserService (InMemoryDatabase database){
        this.database = database;
    }

    public void updateUser(User user){

        Optional<User> oldUser = database.getUserById(user.getId());
        if(oldUser.isPresent()) {
            User newUser = oldUser.get();
            newUser.setFirstName(user.getFirstName());
            newUser.setSecondName(user.getSecondName());
            newUser.setBirthDate(user.getBirthDate());
            newUser.setType(user.getType());
            newUser.setAdrress(user.getAdrress());
            newUser.setActive(user.getActive());

            database.updateUser(newUser);
        }

    }
}
