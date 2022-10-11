package com.weh.service;

import com.weh.entity.User;

public interface UserService {
    User get();
    User getById(int id);
    User addUser(User user);
}
