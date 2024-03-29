package com.reign.model;

import java.io.Serializable;

/**
 * @ClassName User
 * @Description model
 * @Author wuwenxiang
 * @Date 2019-09-20 21:01
 * @Version 1.0
 **/
public class User implements Serializable {
    private String userName;

    private int age;

    public User(String userName, int age) {
        this.userName = userName;
        this.age = age;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", age=" + age +
                '}';
    }
}
