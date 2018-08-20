package com.hqins.service.impl;

import com.hqins.dao.UserDao;
import com.hqins.mapper.User;
import com.hqins.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;


     @Override
     public List<User>  findAllUsers(){
        return  userDao.findAllUsers();

     }
     @Override
     public String  findUser(Integer id){
         return userDao.findUser(id);
     }

     @Override
     public void  updateUsername(Integer id,String username){
         userDao.updateUsername(id,username);
     }
     @Override
     public List<User> findRandUsers( List<Integer> randIds){
         return userDao.findRandUsers(randIds);
     }
     @Override
     public String getUserDescription(User user){
         return userDao.getUserDescription(user);
     }


}
