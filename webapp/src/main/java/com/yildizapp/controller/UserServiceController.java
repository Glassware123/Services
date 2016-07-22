package com.yildizapp.controller;
import com.yildizapp.request.UserImageRequest;
import com.yildizapp.request.UserIsOnlineServiceRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.yildizapp.dao.UserServiceDao;
import com.yildizapp.domain.UserService;
import com.yildizapp.request.UserServiceRequest;

import java.util.List;

@Controller
@RequestMapping(value= "/user")
public class UserServiceController {
    @Autowired
    private UserServiceDao userServiceDao;

    @RequestMapping(value = "/register",method = RequestMethod.POST,produces = "application/json; charset=UTF-8 ")
    @ResponseBody
    public void saveUser(@RequestBody UserServiceRequest userServiceRequest){
        UserService userService=new UserService();
        userService.setName(userServiceRequest.getName());
        userService.setSurname(userServiceRequest.getSurname());
        userService.setPhoneNumber(userServiceRequest.getPhoneNumber());
        userService.setUsername(userServiceRequest.getUsername());
        userService.setPassword(userServiceRequest.getPassword());
        userService.setEmail(userServiceRequest.getEmail());
        userService.setDepartment(userServiceRequest.getDepartment());
        userServiceDao.save(userService);
    }
    @RequestMapping(value = "/getusers",method = RequestMethod.GET)
    @ResponseBody
    public List<UserService> getAllUsers() {
        return userServiceDao.getAllUsers();
    }


    @RequestMapping(value = "/finduserbyemail",method = RequestMethod.POST,consumes = "application/json")
    @ResponseBody
    public List<UserService> getUserByEmail(@RequestBody UserServiceRequest userServiceRequest) {
        return userServiceDao.getUserByEmail(userServiceRequest.getEmail());
    }

    @RequestMapping(value = "/finduserbyusername",method = RequestMethod.POST,consumes = "application/json")
    @ResponseBody
    public List<UserService> getUserByUsername(@RequestBody UserServiceRequest userServiceRequest) {
        return userServiceDao.getUserByUsername(userServiceRequest.getUsername());
    }

    @RequestMapping(value = "/deleteuserbyusername",method = RequestMethod.POST,consumes = "application/json")
    @ResponseBody
    public void deleteUserByUsername(@RequestBody UserServiceRequest userServiceRequest) {
        userServiceDao.deleteByUsername(userServiceRequest.getUsername());
    }

    @RequestMapping(value = "/updateuserbyemail",method = RequestMethod.POST,consumes = "application/json")
    @ResponseBody
    public void updateUserByEmail(@RequestBody UserServiceRequest userServiceRequest) {
        UserService user = userServiceDao.getUserByEmail(userServiceRequest.getEmail()).get(0);
        user.setName(userServiceRequest.getName());
        user.setSurname(userServiceRequest.getSurname());
        user.setUsername(userServiceRequest.getUsername());
        user.setPassword(userServiceRequest.getPassword());
        user.setPhoneNumber(userServiceRequest.getPhoneNumber());
        user.setEmail(userServiceRequest.getEmail());
        user.setDepartment(userServiceRequest.getDepartment());
        user.setBio(userServiceRequest.getBio());
        userServiceDao.updateUser(user);
    }

    @RequestMapping(value = "/isOnlineService",method = RequestMethod.POST,consumes = "application/json")
    @ResponseBody
    public void isOnlineService(@RequestBody UserIsOnlineServiceRequest userIsOnlineServiceRequest) {
        userServiceDao.isOnlineService(userIsOnlineServiceRequest.getId(),userIsOnlineServiceRequest.getIsOnlineStatus());
    }

    @RequestMapping(value = "/updateImageService",method = RequestMethod.POST,consumes = "application/json")
    @ResponseBody
    public void updateImageService(@RequestBody UserImageRequest userImageRequest) {
        userServiceDao.updateUserImage(userImageRequest.getId(),userImageRequest.getUserImage());
    }
}