package com.example.consumer;

import com.example.common.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private  InvokeProvider invokeProvider;

    @RequestMapping(value = "/findUserById")
    User findUserById(@RequestParam("userId") Integer id){
        System.out.println(id);
        return invokeProvider.findUserById(id);
    }
}
