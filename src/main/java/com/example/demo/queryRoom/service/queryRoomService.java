package com.example.demo.queryRoom.service;

import com.example.demo.queryRoom.entity.hotel_room;
import com.example.demo.queryRoom.entity.test_DEPARTMENT;
import com.example.demo.queryRoom.entity.zzy_user;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.List;

public interface queryRoomService {
    public List<hotel_room> queryroom ();

    test_DEPARTMENT query(test_DEPARTMENT td);

    zzy_user queryzzy();
}
