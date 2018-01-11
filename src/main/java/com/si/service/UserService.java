package com.si.service;


import com.si.pojo.PageHandler;
import com.si.pojo.User;

import java.util.List;

/**
 * Created by Administrator on 2018/1/11.
 */
public interface UserService {
    List<User> getUserList();

    PageHandler<User> getJsonList(Integer page, Integer rows);
}
