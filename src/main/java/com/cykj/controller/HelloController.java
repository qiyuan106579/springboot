package com.cykj.controller;

import com.cykj.bean.User;
import com.cykj.servive.impl.HelloServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @version 1.0
 * @author: qiyuan
 * @date: 2021/7/12 15:56
 * @desc:
 */
@Controller
public class HelloController {
    @Autowired
    private HelloServiceImpl helloService;

    @RequestMapping("/hello")
    public String hello() {
        return "Hello";
    }

    @RequestMapping("/getHello")
    @ResponseBody
    public String getLogin(User user) {
        System.out.println("123456-----------------------------------------------------------");
        System.out.println("账号：" + user.getUserName() + "\n密码：" + user.getPassword());
        User login = helloService.login(user.getUserName(), user.getPassword());
        if (login != null) {
            return "200";
        } else {
            return "100";
        }
    }

    @RequestMapping("/getRegister")
    @ResponseBody
    public String getRegister(User user) {
        System.out.println("注册：" + "\n" + "账号：" + user.getUserName() + " 密码：" + user.getPassword());
        boolean register = helloService.register(user.getUserName(), user.getPassword());
        if (register) {
            return "200";
        } else {
            return "1000";
        }
    }


    //    @RequestMapping(value = "/getHello", method = RequestMethod.POST, produces = "application/json;charset=ISO-88595-1")
    @PostMapping("/getHello4")
    @ResponseBody
    public String getHello4(@RequestBody User user) {
        System.out.println(user.getUserName() + "\n" + user.getPassword());
        return "1111111";
    }

}
