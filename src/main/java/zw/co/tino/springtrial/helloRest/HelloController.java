package zw.co.tino.springtrial.helloRest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import zw.co.tino.springtrial.model.Users;
import zw.co.tino.springtrial.service.HelloService;

import java.util.List;

@RestController
public class HelloController {

    @Autowired
    private HelloService helloService;

    @GetMapping("/home")
    public List<Users> getAll(){
        return helloService.getAllUsers();
    }

}
