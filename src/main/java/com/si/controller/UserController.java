package com.si.controller;

import com.si.pojo.PageHandler;
import com.si.pojo.User;
import com.si.service.UserService;
import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by Administrator on 2018/1/11.
 */
@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("list")
    @ResponseBody
    public List<User> getUserList(HttpServletRequest request){
        List<User> userList = userService.getUserList();
        request.setAttribute("userList",userList);
        System.out.println(userList.toString());
        return userList;
    }
    @RequestMapping("/pageList")
    @ResponseBody
    public PageHandler<User> getPageList(Integer page, Integer rows){
        PageHandler<User> userList = userService.getJsonList(page, rows);
        return userList;
    }
    @RequestMapping("")
    public String index(){
        return "toIndex";
    }



}
