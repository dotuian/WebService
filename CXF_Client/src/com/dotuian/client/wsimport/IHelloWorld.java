
package com.dotuian.client.wsimport;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebService(name = "IHelloWorld", targetNamespace = "http://service.dotuian.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface IHelloWorld {


    /**
     * 
     * @param size
     * @return
     *     returns java.util.List<java.lang.Object>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getRandomNumber", targetNamespace = "http://service.dotuian.com/", className = "com.dotuian.client.wsimport.GetRandomNumber")
    @ResponseWrapper(localName = "getRandomNumberResponse", targetNamespace = "http://service.dotuian.com/", className = "com.dotuian.client.wsimport.GetRandomNumberResponse")
    public List<Object> getRandomNumber(
        @WebParam(name = "size", targetNamespace = "")
        int size);

    /**
     * 
     * @return
     *     returns java.util.List<com.dotuian.client.wsimport.User>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getAllUserList", targetNamespace = "http://service.dotuian.com/", className = "com.dotuian.client.wsimport.GetAllUserList")
    @ResponseWrapper(localName = "getAllUserListResponse", targetNamespace = "http://service.dotuian.com/", className = "com.dotuian.client.wsimport.GetAllUserListResponse")
    public List<User> getAllUserList();

    /**
     * 
     * @return
     *     returns com.dotuian.client.wsimport.ListUser
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getAllUsers", targetNamespace = "http://service.dotuian.com/", className = "com.dotuian.client.wsimport.GetAllUsers")
    @ResponseWrapper(localName = "getAllUsersResponse", targetNamespace = "http://service.dotuian.com/", className = "com.dotuian.client.wsimport.GetAllUsersResponse")
    public ListUser getAllUsers();

    /**
     * 
     * @param text
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "sayHi", targetNamespace = "http://service.dotuian.com/", className = "com.dotuian.client.wsimport.SayHi")
    @ResponseWrapper(localName = "sayHiResponse", targetNamespace = "http://service.dotuian.com/", className = "com.dotuian.client.wsimport.SayHiResponse")
    public String sayHi(
        @WebParam(name = "text", targetNamespace = "")
        String text);

    /**
     * 
     * @param userid
     * @return
     *     returns com.dotuian.client.wsimport.User
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getUserByUserid", targetNamespace = "http://service.dotuian.com/", className = "com.dotuian.client.wsimport.GetUserByUserid")
    @ResponseWrapper(localName = "getUserByUseridResponse", targetNamespace = "http://service.dotuian.com/", className = "com.dotuian.client.wsimport.GetUserByUseridResponse")
    public User getUserByUserid(
        @WebParam(name = "userid", targetNamespace = "")
        int userid);

}
