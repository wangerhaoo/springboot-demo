package com.weh.service.impl;

import com.weh.entity.User;
import com.weh.service.UserService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service //也是使用component  两者区别 @Service 知道是controller里使用的跟业务逻辑有关。这种语义化更清晰  @component更通用，
@Component // 这里也可以使用
public class UserServiceImpl implements UserService {
    public User get(){
        User user = new User(131,"get");
        System.out.println("user = " + user);
        return user;
    }
    public User getById( int id){
        User user = new User(id,"getById");
        System.out.println("user = " + user);
        return user;

    }
    public User addUser( User user){
        System.out.println("postuser = " + user);
        return user;
    }
}
