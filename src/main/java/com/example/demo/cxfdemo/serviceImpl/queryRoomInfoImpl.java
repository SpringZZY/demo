package com.example.demo.cxfdemo.serviceImpl;

import com.example.demo.cxfdemo.entity.userEntity;
import com.example.demo.cxfdemo.server.queryRoomInfo;
import com.example.demo.queryRoom.entity.test_DEPARTMENT;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.jws.WebService;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@WebService(name="UserService",
        targetNamespace="http://server.cxfdemo.demo.example.com",
        endpointInterface="com.example.demo.cxfdemo.server.queryRoomInfo")
@Component
public class queryRoomInfoImpl implements queryRoomInfo {


    private Map<String, userEntity> userMap = new HashMap<String, userEntity>();
    public queryRoomInfoImpl() {
        System.out.println("向实体类插入数据");
        userEntity user = new userEntity();
        user.setUserName("zhansan");
        user.setUserAge("20");
        userMap.put("1", user);

        user = new userEntity();
        user.setUserName("zhansanzzy");
        user.setUserAge("20");
        userMap.put("2", user);
    }


    @Override
    public String getUser(String name) {
        String result = "";
        try {
            result = "UserName:" + name + " - Date:"+ new Date();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public String listUser() {
        String result = "";
        try {
            result = "Date:"+ new Date();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public String deleteUser(String id) {
        String result = "";
        try {
            result = "UserId:" + id + " - Date:"+ new Date();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public String updateUser(String id) {
        String result = "";
        try {
            result = "UserId:" + id + " - Date:"+ new Date();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public String queyTestDEPARTMENT() {
        ArrayList<userEntity> users = new ArrayList<>();
        userMap.forEach((key,value)->{users.add(value);});
        return "";
    }

}
