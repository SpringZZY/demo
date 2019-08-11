package com.example.demo.cxfdemo.entity;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.io.Serializable;


public class userEntity implements Serializable {

    private static final long serialVersionUID = -5939599230753662529L;

    public String userName;
    public String userAge;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserAge() {
        return userAge;
    }

    public void setUserAge(String userAge) {
        this.userAge = userAge;
    }
}
