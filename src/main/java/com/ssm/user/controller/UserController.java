package com.ssm.user.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ssm.user.pojo.User;
import com.ssm.user.service.UserService;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/page/user")
    public String showPage() {
        return "user-list";
    }

    /**
     * {"total":10,"rows":users}
     *
     * @param page
     * @param rows
     * @return
     */
    @RequestMapping("/user/list")
    @ResponseBody
    public Object getUserList(int page, int rows) {
        List<User> users = userService.getUsers(page, rows);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("total", userService.getCount());
        map.put("rows", users);
        return map;
    }

    @RequestMapping("/all/list")
    @ResponseBody
    public Object getAllList(int page, int rows) {
        List<User> allUsers = userService.getAllUsers(page, rows);
        HashMap<Object, Object> map = new HashMap<>();
        map.put("total", userService.getAllCount());
        map.put("rows", allUsers);
        return map;
    }
}
