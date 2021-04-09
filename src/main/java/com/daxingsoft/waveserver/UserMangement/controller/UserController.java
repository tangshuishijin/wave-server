package com.daxingsoft.waveserver.UserMangement.controller;


import com.daxingsoft.waveserver.UserMangement.daoImpl.UserDaoImpl;
import com.daxingsoft.waveserver.UserMangement.entity.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;


@RequestMapping("/user")
@Controller
public class UserController {
    @Autowired
    private UserDaoImpl userDao;
    private Logger logger = LoggerFactory.getLogger(UserController.class);

    @GetMapping("/addUser")
    public String addUser(/*User user*/Model model){
        logger.debug("addUser has been involved!");
        Map<String,Object> mp = new HashMap<>();
        mp.put("users",userDao.findAll());
        model.addAttribute("users",mp);
        return "userManagement/userList";
    }
    @PostMapping("/addUser")
    public String insertUser(User user,Model model){
        User userAdd = userDao.save(user);
        model.addAttribute("users",userDao.findAll());
        return "userManagement/userList";
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
    @ResponseBody
    public Iterable<User> listUser(){
        logger.debug("listUser has been involved!");
        return userDao.findAll();
    }

    public UserDaoImpl getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDaoImpl userDao) {
        this.userDao = userDao;
    }
}
