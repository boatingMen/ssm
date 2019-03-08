package com.shsxt.controller;

import com.shsxt.po.User;
import com.shsxt.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Administrator on 2019/3/8.
 */
@Controller
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "queryUserById",method = RequestMethod.POST)
    @ResponseBody
    public User queryUserById(Integer id) throws Exception {
        return userService.queryById(id);
    }

    @RequestMapping("queryUserById2/{id}")
    @ResponseBody
    public User queryUserById2(@PathVariable Integer id) throws Exception {
        return userService.queryById(id);
    }

    @RequestMapping("test/{id}/{name}")
    @ResponseBody
    public String test(@PathVariable Integer id,@PathVariable String name) throws Exception {
        return id+" - "+name;
    }
}
