package zw.co.tino.springtrial.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import zw.co.tino.springtrial.model.User;
import zw.co.tino.springtrial.service.UserService;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/all")
    public List<User> getAll(){
        return userService.getAllUsers();
    }
    @PostMapping("/add")
    public User saveNewUser(@RequestBody User user){
      userService.addNewUser(user);
      return user;
    }
    

}
