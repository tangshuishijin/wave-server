package com.daxingsoft.waveserver.UserMangement.controller;


import com.daxingsoft.waveserver.UserMangement.dao.UserDao;
import com.daxingsoft.waveserver.UserMangement.daoImpl.UserDaoImpl;
import com.daxingsoft.waveserver.UserMangement.entity.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RequestMapping("/user")
@Controller
public class UserController {
    @Autowired
    private UserDaoImpl userDao;
    private Logger logger = LoggerFactory.getLogger(UserController.class);

    @GetMapping("/addUser")
    public String addUser(/*User user*/){
        logger.debug("addUser has been involved!");
        return "userManagement/userEdit";
    }
    @PostMapping("/addUser")
    @ResponseBody
    public String insertUser(User user){
        userDao.save(user);
        return "susscess";
    }

    public String editUser(User user){
        logger.debug("editUser has been involved!");
        return "success";
    }

    public String deleteUser(User user){
        logger.debug("deleteUser has been involved!");
        return "success";
    }
    @GetMapping("/listUser")
    public List<User> listUser(){
        logger.debug("listUser has been involved!");
        return null;
    }

    public UserDaoImpl getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDaoImpl userDao) {
        this.userDao = userDao;
    }
}
