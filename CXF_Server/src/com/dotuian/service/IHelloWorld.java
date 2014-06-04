package com.dotuian.service;

import java.util.List;
import java.util.Map;

import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import com.dotuian.dto.User;
import com.dotuian.util.ConvertUser;

@WebService
public interface IHelloWorld {

    String sayHi(@WebParam(name = "text") String text);

    List getRandomNumber(@WebParam(name = "size") int size);

    List<User> getAllUserList();

    User getUserByUserid(@WebParam(name = "userid") int userid);
    
    @XmlJavaTypeAdapter(ConvertUser.class)
    Map<Integer, User> getAllUsers();
    
}
