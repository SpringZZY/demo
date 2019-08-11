package com.example.demo.queryRoom.dao;

import com.example.demo.queryRoom.entity.hotel_room;
import com.example.demo.queryRoom.entity.test_DEPARTMENT;
import com.example.demo.queryRoom.entity.zzy_user;

import java.util.List;


public interface queryRoomDao {

    /***
     * 新增
     * @param td
     * @return
     */
    test_DEPARTMENT query(test_DEPARTMENT td);

    public List<hotel_room> queryroom ();

    zzy_user queryzzy();
}
