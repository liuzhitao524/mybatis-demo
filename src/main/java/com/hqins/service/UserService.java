package com.hqins.service;

import com.hqins.mapper.User;

import java.util.List;

public interface UserService {
    List<User> findAllUsers();
    String findUser(Integer id);
    void updateUsername(Integer id,String username);
    List<User> findRandUsers(List<Integer> randIds);
    String getUserDescription(User user);
}
