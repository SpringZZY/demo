package com.example.demo.queryRoom.contoller;

import com.example.demo.queryRoom.entity.hotel_room;
import com.example.demo.queryRoom.entity.test_DEPARTMENT;
import com.example.demo.queryRoom.entity.zzy_user;
import com.example.demo.queryRoom.service.queryRoomService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class queryController {

    @Autowired
    queryRoomService queryroomservice;

    Logger logger = Logger.getLogger(queryController.class);

    @RequestMapping("/queryRomm")
    public ModelAndView queryRommNum(){

        ModelAndView mav = new ModelAndView();

        Map<String,Object> modelAndView = new HashMap<>();
        modelAndView.put("name","张三");
        modelAndView.put("age",22);

        mav.addAllObjects(modelAndView);
        mav.addObject("a","12345");
        mav.setViewName("index");//设置返回页面

        hotel_room hr = new hotel_room();
        List<hotel_room> list = queryroomservice.queryroom();

        logger.info("queryController -> queryRommNum -> list  line 40 :" + list);

        test_DEPARTMENT tdat = new test_DEPARTMENT();

        zzy_user zy = queryroomservice.queryzzy();

        logger.info("queryController -> queryRommNum -> zzy_user  line 46 :" + zy);

        test_DEPARTMENT department = queryroomservice.query(tdat);

        logger.info("queryController -> queryRommNum -> department  line 50 :" + department);

        return mav;
    }

}
