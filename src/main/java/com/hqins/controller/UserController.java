package com.hqins.controller;

import com.hqins.domain.People;
import com.hqins.mapper.User;
import com.hqins.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Array;
import java.util.Hashtable;
import java.util.List;
import java.util.Vector;

@Controller
public class UserController {

    @Autowired
    private UserService userService;


    @RequestMapping(value="/users",method =RequestMethod.GET)
    @ResponseBody
    public List<User> allUsers(){
        return userService.findAllUsers();
    }

    @RequestMapping(value="/demo",method = RequestMethod.POST)
    @ResponseBody
    public String demo(@RequestBody User user){
        return user.getUserId() + user.getUserName();
    }

    @RequestMapping(value="/user/{id}",method = RequestMethod.GET)
    @ResponseBody
    public String  user(@PathVariable(name="id") Integer id){
        return userService.findUser(id);
    }

    @RequestMapping(value="/user/{id}",method = RequestMethod.PUT)
    @ResponseBody
    public String updateUsername(@PathVariable("id") Integer id,@RequestBody User user){
        userService.updateUsername(id,user.getUserName());
        return user.getUserName();
    }

    @RequestMapping(value="/randUser",method=RequestMethod.POST)
    @ResponseBody
    public List<User> randUsers(@RequestBody List<Integer> randIds){
        return  userService.findRandUsers(randIds);
    }

    @RequestMapping(value="/description",method=RequestMethod.POST)
    @ResponseBody
    public String getUserDescription(@RequestBody User user){
        return userService.getUserDescription(user);
    }




}
