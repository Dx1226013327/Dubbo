package edu.cque.service;

import edu.cque.model.User;

public interface UserService {
    /**
     * 根据用户ID查找用户
     * @param id
     * @return
     */
    User queryUserById(Integer id);
}
