package com.example.demo.cxfdemo.server;


import com.example.demo.cxfdemo.entity.userEntity;
import com.example.demo.queryRoom.entity.test_DEPARTMENT;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(name="UserService",targetNamespace = "http://server.cxfdemo.demo.example.com")
public interface queryRoomInfo {

        public String getUser(String name);

    public String listUser();

    public String deleteUser(String id);

    public String updateUser(String id);

    public String queyTestDEPARTMENT();
}