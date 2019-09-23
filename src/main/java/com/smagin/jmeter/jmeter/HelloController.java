package com.smagin.jmeter.jmeter;

import com.smagin.jmeter.jmeter.model.User;
import com.smagin.jmeter.jmeter.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloController {
    @Autowired
    private UserRepository repository;



    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }
    @GetMapping("/users")
    public List<User> getAll(){
        return repository.findAll();
    }
}
