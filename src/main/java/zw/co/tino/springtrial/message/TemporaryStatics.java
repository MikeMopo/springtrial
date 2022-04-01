package zw.co.tino.springtrial.message;

import org.springframework.stereotype.Component;
import zw.co.tino.springtrial.model.User;

import java.util.ArrayList;
import java.util.List;

@Component
public class TemporaryStatics {

    public static List<User> users = new ArrayList<>();

    static{

        users.add(new User(1, "Tino", "tintin@us.mail"));
        users.add(new User(2, "Mike", "mikmik@us.mail"));
    }
}

