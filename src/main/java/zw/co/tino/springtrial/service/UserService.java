package zw.co.tino.springtrial.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zw.co.tino.springtrial.message.TemporaryStatics;
import zw.co.tino.springtrial.model.User;

import java.util.List;

@Service
public class UserService {
    
    @Autowired
    private TemporaryStatics temporaryStatics;
    public List<User> getAllUsers() {
        return temporaryStatics.users;

    }


    public void addNewUser(User newUser) {
        newUser.setId(temporaryStatics.users.size() + 1);
        temporaryStatics.users.add(newUser);
    }
}
