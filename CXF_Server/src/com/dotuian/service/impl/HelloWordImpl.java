package com.dotuian.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;

import javax.jws.WebService;

import com.dotuian.dto.User;
import com.dotuian.service.IHelloWorld;

@WebService(endpointInterface = "com.dotuian.service.IHelloWorld", serviceName = "HelloWordService")
public class HelloWordImpl implements IHelloWorld {

    private static Map<Integer, User> dataMap = new HashMap<Integer, User>();

    static {
        for (int i = 1; i <= 20; i++) {
            User user = new User(i, "User" + String.format("%05d", i), "pwd"
                    + String.format("%05d", i));
            dataMap.put(i, user);
        }
    }

    @Override
    public String sayHi(String text) {
        System.out.println("sayHi called");
        return "Hello World. " + text;
    }

    @Override
    public List<User> getAllUserList() {
        List<User> dataList = new ArrayList<User>();

        Iterator ite = this.dataMap.entrySet().iterator();
        while (ite.hasNext()) {
            Map.Entry entry = (Map.Entry) ite.next();
            Integer key = (Integer) entry.getKey();
            User user = (User) entry.getValue();
            dataList.add(user);
            System.out.println(user.toString());
        }

        return dataList;
    }

    @Override
    public List<Integer> getRandomNumber(int size) {
        List<Integer> list = new ArrayList<Integer>();
        Random rand = new Random();
        for (int i = 0; i < size; i++) {
            list.add(rand.nextInt(100));
        }
        return list;
    }

    @Override
    public User getUserByUserid(int userid) {
        return this.dataMap.get(userid);
    }
    
    
    @Override
    public Map<Integer, User> getAllUsers() {
        return this.dataMap;
    }

}
