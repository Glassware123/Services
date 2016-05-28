package com.yildizapp.dao;

import com.yildizapp.domain.UserService;

import java.util.List;

public interface BaseDao<T> {

    List<T> findAll();

    void saveOrUpdate(T t);

    List<UserService> findUserByEmail(String email);

    List<UserService> findUserByUsername(String username);

    void delete (T t);
}
