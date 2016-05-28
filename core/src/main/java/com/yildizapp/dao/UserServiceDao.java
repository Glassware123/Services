package com.yildizapp.dao;
import com.sun.org.apache.xml.internal.security.utils.Base64;
import com.yildizapp.domain.UserService;

import java.io.File;
import java.util.List;

public interface UserServiceDao extends BaseDao<UserService> {
    void save(UserService userService);
    List<UserService> getAllUsers();
    List<UserService> getUserByEmail(String email);
    List<UserService> getUserByUsername (String username);
    void deleteByUsername(String username);
    void updateUser(UserService userService);
    void isOnlineService(Integer id,Boolean isOnlineStatus);
    void updateUserImage(Integer id, String userImage);
}