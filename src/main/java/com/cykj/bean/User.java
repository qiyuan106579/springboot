package com.cykj.bean;

/**
 * @version 1.0
 * @author: qiyuan
 * @date: 2021/7/8 17:11
 * @desc:
 */
public class User {
    private String userName;
    private String password;

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
