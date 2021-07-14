package com.cykj.servive.impl;

import com.cykj.bean.User;
import com.cykj.mapper.HelloMapper;
import com.cykj.servive.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @version 1.0
 * @author: qiyuan
 * @date: 2021/7/9 16:14
 * @desc:
 */

@Service
public class HelloServiceImpl implements HelloService {
    @Autowired
    private HelloMapper helloMapper;

    @Override
    public User login(String uName, String pwd) {
        User user = helloMapper.findUser(uName, pwd);
        if (user != null) {
            return user;
        } else {
            return null;
        }
    }

    @Override
    public boolean register(String uName, String pwd) {
        int insertUser = helloMapper.insertUser(uName, pwd);
        if (insertUser > 0) {
            return true;
        } else {
            return false;
        }
    }
}
