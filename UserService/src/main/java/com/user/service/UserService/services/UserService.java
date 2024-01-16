package com.user.service.UserService.services;

import com.user.service.UserService.entities.User;

import java.util.List;

public interface UserService {

    //user operations
    //create

    User saveUser(User user);

    //get all user

    List<User> getAllUser();

    //Get Single user of given userId

    User getUser(String userId);

    //User deleteUser(String userId);

    //Delete
//    User delete(String userId);

    //Update

//    User update(String userId);
}
