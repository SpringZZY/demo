package com.example.demo.queryRoom.service.serviceImpl;

import com.example.demo.queryRoom.dao.queryRoomDao;
import com.example.demo.queryRoom.entity.hotel_room;
import com.example.demo.queryRoom.entity.test_DEPARTMENT;
import com.example.demo.queryRoom.entity.zzy_user;
import com.example.demo.queryRoom.service.queryRoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class queryRoomServiceImpl implements queryRoomService {

    @Autowired
    queryRoomDao queryRoomDao;

    @Override
    public List<hotel_room> queryroom() {
        return null;
    }

    @Override
    public test_DEPARTMENT query(test_DEPARTMENT td) {

        td.setDEPARTMENT_ID(10);
        test_DEPARTMENT tdt = queryRoomDao.query(td);

        return tdt;
    }

    @Override
    public zzy_user queryzzy() {

        zzy_user zu = queryRoomDao.queryzzy();
        return zu;
    }
}
