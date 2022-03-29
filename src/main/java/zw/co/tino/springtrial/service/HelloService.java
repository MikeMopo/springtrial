package zw.co.tino.springtrial.service;

import org.springframework.stereotype.Service;
import zw.co.tino.springtrial.model.Users;

import java.util.ArrayList;
import java.util.List;

@Service
public class HelloService {
    public List<Users> getAllUsers() {
        List<Users> users = new ArrayList<>();
        users.add(new Users(1, "Tino", "tintin@us.mail"));
        users.add(new Users(2, "Mike", "mikmik@us.mail"));
        return users;
    }
}
