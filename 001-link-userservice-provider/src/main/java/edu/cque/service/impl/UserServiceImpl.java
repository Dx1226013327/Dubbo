package edu.cque.service.impl;

import edu.cque.model.User;
import edu.cque.service.UserService;

public class UserServiceImpl implements UserService {
    public User queryUserById(Integer id) {
        User user = new User();
        user.setId(id);
        user.setName("张三");
        return user;
    }
}
