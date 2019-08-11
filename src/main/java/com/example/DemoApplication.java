package com.example;

import com.example.demo.cxfdemo.serviceImpl.queryRoomInfoImpl;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import javax.xml.ws.Endpoint;

@SpringBootApplication
@MapperScan("com.example.demo.queryRoom.dao")
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}

