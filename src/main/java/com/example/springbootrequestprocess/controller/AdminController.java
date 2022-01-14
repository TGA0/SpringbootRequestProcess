package com.example.springbootrequestprocess.controller;
import com.example.springbootrequestprocess.pojo.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminController {

    @GetMapping("/admin")
    public User admin(String id){
        //模拟根据id获取用户信息
        User user = new User();
        user.setId(id);
        user.setUsername("TGA0");
        user.setPassword("123456");
        return user;
    }
}
