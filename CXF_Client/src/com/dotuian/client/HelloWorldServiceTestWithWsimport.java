package com.dotuian.client;

import java.util.List;

import org.apache.cxf.endpoint.Client;
import org.apache.cxf.frontend.ClientProxy;
import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;

import com.dotuian.client.interceptor.AddUserinfo2HeaderInterceptor;
import com.dotuian.client.wsimport.Entity;
import com.dotuian.client.wsimport.HelloWordService;
import com.dotuian.client.wsimport.IHelloWorld;
import com.dotuian.client.wsimport.ListUser;
import com.dotuian.client.wsimport.User;

public class HelloWorldServiceTestWithWsimport {

    public static void main(String[] args) {

        HelloWordService proxy = new HelloWordService();
        IHelloWorld service = proxy.getHelloWordImplPort();
        
        // 在客户端添加拦截器
        Client client = ClientProxy.getClient(service);
        client.getOutInterceptors().add(new LoggingOutInterceptor());
        client.getInInterceptors().add(new LoggingInInterceptor());
        
        client.getOutInterceptors().add(new AddUserinfo2HeaderInterceptor("username", "password"));
        
        
        
        System.out.println("\n\n================================");
        System.out.println(service.sayHi("cxf 2.7 "));

        
        System.out.println("\n\n================================");
        List<Object> list = service.getRandomNumber(3);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).toString());
        }

        
        System.out.println("\n\n================================");
        List<User> userList = service.getAllUserList();
        for (int i = 0; i < userList.size(); i++) {
            User user = userList.get(i);
            System.out.println(user);
        }

        
        System.out.println("\n\n================================");
        User user = service.getUserByUserid(2);
        if (user != null) {
            System.out.println(user.getUserid() + "  " + user.getUsername()
                    + "  " + user.getPassword());
        } else {
            System.out.println("userid = 2  no exist !!!");
        }

        
        System.out.println("\n\n================================");
        user = service.getUserByUserid(200);
        if (user != null) {
            System.out.println(user.getUserid() + "  " + user.getUsername()
                    + "  " + user.getPassword());
        } else {
            System.out.println("userid = 20  no exist !!!");
        }

        
        System.out.println("\n\n================================");
        ListUser data = service.getAllUsers();
        for(Entity e : data.getEntity()){
            System.out.println("\n------------\n");
            System.out.println(e.getKey());
            System.out.println(e.getUser().getUserid() + "  " + e.getUser().getPassword() + "  " + e.getUser().getUsername());
            System.out.println();
        }
        
        
        System.out.println(HelloWorldServiceTestWithWsimport.class);
        
    }
}
