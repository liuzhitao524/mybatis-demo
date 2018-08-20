package com.hqins.dao;

import com.hqins.mapper.User;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface UserDao {
    List<User> findAllUsers();
    String findUser(@Param("id") Integer id);
    void updateUsername(@Param("id") Integer id,@Param("username") String username);
    List<User> findRandUsers(@Param("list") List<Integer> randIds);
    String getUserDescription(@Param("user") User user);


}
