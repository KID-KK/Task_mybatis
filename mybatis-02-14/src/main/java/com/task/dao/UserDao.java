package com.task.dao;

import com.task.pojo.User;

import java.util.List;

public interface UserDao {
    //查询全部用户
    List<User> getUserList();
    //根据u_id查询用户
    User getUserById(int id);
    //增加一个用户
    int addUser(User user);
    //修改用户密码
    int updateUser(User user);
    //删除一个用户
    int deleteUser(int id);

}
