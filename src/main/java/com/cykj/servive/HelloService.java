package com.cykj.servive;

import com.cykj.bean.User;

/**
 * @version 1.0
 * @author: qiyuan
 * @date: 2021/7/9 16:13
 * @desc:
 */
public interface HelloService {
    User login(String uName, String pwd);

    boolean register(String uName, String pwd);
}
