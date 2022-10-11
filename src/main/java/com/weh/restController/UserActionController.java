package com.weh.restController;

import com.weh.entity.User;
import com.weh.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("userAction")

public class UserActionController {
    @Autowired
    /*
     * @Resource = @Autowired+@Qualifier
     * 如果接口只实现一个，使用@Autowired就可以了，不需要指定名字
     * 如果接口有多个实现，那么使用@Resource 并指定name(推荐）
     * 或者使用@Autowired+@Qualifier 加Qualifier 的value 值
     */
    private UserService userService;
    @GetMapping  //("get") //http://localhost:8080/userAction/get
    public User get(){
//        userService  = new UserServiceImpl();
        return userService.get();
    }
    @GetMapping("{id}")  //("get") //http://localhost:8080/rest/get
    public User getById(@PathVariable("id") int id){
//        userService  = new UserServiceImpl();
        return userService.getById(id);
    }
    @PostMapping
    @CrossOrigin //解决跨域， 但是一般不这样用， 一般使用过滤器的方式来解决跨域
    public User addUser(@RequestBody User user){
//        userService  = new UserServiceImpl();
        return userService.addUser(user);
    }
}
