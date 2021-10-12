package com.su.mtools.mvc.controller;

import com.su.mtools.mvc.common.Response;
import com.su.mtools.mvc.entity.User;
import com.su.mtools.mvc.service.UserService;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Repository
@RestController
@RequestMapping("/user")
public class UserController {
    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping("/addUser")
    public Response addUser(@RequestBody User user) {
        return userService.addUser(user);
    }
}
