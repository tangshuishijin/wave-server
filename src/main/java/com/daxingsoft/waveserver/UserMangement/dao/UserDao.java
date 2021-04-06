package com.daxingsoft.waveserver.UserMangement.dao;

import com.daxingsoft.waveserver.UserMangement.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface UserDao {

    User addUser(User user);

    User deleteById(Long id);

    User updateUser(User user);

    List<User> findAll();

    User findById(Long id);

    User findByName(String name);

    List<User> findFirstNByName(int n);

}
