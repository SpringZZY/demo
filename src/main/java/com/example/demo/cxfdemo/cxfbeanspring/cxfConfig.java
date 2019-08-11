package com.example.demo.cxfdemo.cxfbeanspring;

import com.example.demo.cxfdemo.server.queryRoomInfo;
import org.apache.cxf.Bus;
import org.apache.cxf.bus.spring.SpringBus;
import org.apache.cxf.transport.servlet.CXFServlet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import javax.xml.ws.Endpoint;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.context.annotation.Configuration;

@Configuration
public class cxfConfig {


    @Bean(name = Bus.DEFAULT_BUS_ID)
    public SpringBus springBus() {
        return new SpringBus();
    }

    @Bean
    public ServletRegistrationBean disServlet() {
        return new ServletRegistrationBean(new CXFServlet(), "/cxf/*");// 发布服务名称 localhost:8080/cxf

    }

    @Autowired
    queryRoomInfo queryRoomInfo;


    @Bean
    public Endpoint endpoint() {
        EndpointImpl endpoint = new EndpointImpl(springBus(),queryRoomInfo);// 绑定要发布的服务实现类
        endpoint.publish("/queryRoom"); // 接口访问地址
        System.out.println("");
        return endpoint;
    }

}
