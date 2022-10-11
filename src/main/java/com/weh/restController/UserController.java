package com.weh.restController;

import com.weh.entity.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("user")
public class UserController {
    @GetMapping  //("get") //http://localhost:8080/user
    public User get(){
        User user = new User(12,"get");
        System.out.println("user = " + user);
        return user;
    }
    @GetMapping("{id}")  //("get") //http://localhost:8080/user
    public User getById(@PathVariable("id") int id){
        User user = new User(id,"getById");
        System.out.println("user = " + user);
        return user;
    }
    @PostMapping
    @CrossOrigin //解决跨域， 但是一般不这样用， 一般使用过滤器的方式来解决跨域
    public User addUser(@RequestBody User user){
        System.out.println("postuser = " + user);
        return user;
    }
}
