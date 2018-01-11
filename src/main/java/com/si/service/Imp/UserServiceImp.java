package com.si.service.Imp;

import com.si.main.Main;
import com.si.mapper.UserMapper;
import com.si.pojo.PageHandler;
import com.si.pojo.User;
import com.si.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;

/**
 * Created by Administrator on 2018/1/11.
 */
@Service
@Transactional
public class UserServiceImp implements UserService {
    @Autowired
    private UserMapper userMapper;

    public List<User> getUserList() {
        return userMapper.getUserList();
    }

    public PageHandler<User> getJsonList(Integer page, Integer rows) {
        PageHandler<User> userPageHandler = new PageHandler<User>();
        int count=userMapper.getUserCount();
        HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
        hashMap.put("index",(page-1)*rows);
        hashMap.put("rows",rows);
        List<User> jsonList = userMapper.getJsonList(hashMap);
        userPageHandler.setTotal(count);
        userPageHandler.setPageList(jsonList);
        return userPageHandler;
    }
}
