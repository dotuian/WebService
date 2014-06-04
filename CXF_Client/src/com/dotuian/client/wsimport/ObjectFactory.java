
package com.dotuian.client.wsimport;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.dotuian.client.wsimport package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetAllUserListResponse_QNAME = new QName("http://service.dotuian.com/", "getAllUserListResponse");
    private final static QName _GetRandomNumber_QNAME = new QName("http://service.dotuian.com/", "getRandomNumber");
    private final static QName _SayHi_QNAME = new QName("http://service.dotuian.com/", "sayHi");
    private final static QName _GetAllUserList_QNAME = new QName("http://service.dotuian.com/", "getAllUserList");
    private final static QName _GetUserByUseridResponse_QNAME = new QName("http://service.dotuian.com/", "getUserByUseridResponse");
    private final static QName _GetAllUsers_QNAME = new QName("http://service.dotuian.com/", "getAllUsers");
    private final static QName _GetAllUsersResponse_QNAME = new QName("http://service.dotuian.com/", "getAllUsersResponse");
    private final static QName _GetUserByUserid_QNAME = new QName("http://service.dotuian.com/", "getUserByUserid");
    private final static QName _SayHiResponse_QNAME = new QName("http://service.dotuian.com/", "sayHiResponse");
    private final static QName _GetRandomNumberResponse_QNAME = new QName("http://service.dotuian.com/", "getRandomNumberResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.dotuian.client.wsimport
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SayHiResponse }
     * 
     */
    public SayHiResponse createSayHiResponse() {
        return new SayHiResponse();
    }

    /**
     * Create an instance of {@link GetRandomNumberResponse }
     * 
     */
    public GetRandomNumberResponse createGetRandomNumberResponse() {
        return new GetRandomNumberResponse();
    }

    /**
     * Create an instance of {@link GetUserByUserid }
     * 
     */
    public GetUserByUserid createGetUserByUserid() {
        return new GetUserByUserid();
    }

    /**
     * Create an instance of {@link GetAllUsersResponse }
     * 
     */
    public GetAllUsersResponse createGetAllUsersResponse() {
        return new GetAllUsersResponse();
    }

    /**
     * Create an instance of {@link GetAllUsers }
     * 
     */
    public GetAllUsers createGetAllUsers() {
        return new GetAllUsers();
    }

    /**
     * Create an instance of {@link GetUserByUseridResponse }
     * 
     */
    public GetUserByUseridResponse createGetUserByUseridResponse() {
        return new GetUserByUseridResponse();
    }

    /**
     * Create an instance of {@link GetAllUserList }
     * 
     */
    public GetAllUserList createGetAllUserList() {
        return new GetAllUserList();
    }

    /**
     * Create an instance of {@link GetRandomNumber }
     * 
     */
    public GetRandomNumber createGetRandomNumber() {
        return new GetRandomNumber();
    }

    /**
     * Create an instance of {@link GetAllUserListResponse }
     * 
     */
    public GetAllUserListResponse createGetAllUserListResponse() {
        return new GetAllUserListResponse();
    }

    /**
     * Create an instance of {@link SayHi }
     * 
     */
    public SayHi createSayHi() {
        return new SayHi();
    }

    /**
     * Create an instance of {@link ListUser }
     * 
     */
    public ListUser createListUser() {
        return new ListUser();
    }

    /**
     * Create an instance of {@link Entity }
     * 
     */
    public Entity createEntity() {
        return new Entity();
    }

    /**
     * Create an instance of {@link User }
     * 
     */
    public User createUser() {
        return new User();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllUserListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.dotuian.com/", name = "getAllUserListResponse")
    public JAXBElement<GetAllUserListResponse> createGetAllUserListResponse(GetAllUserListResponse value) {
        return new JAXBElement<GetAllUserListResponse>(_GetAllUserListResponse_QNAME, GetAllUserListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRandomNumber }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.dotuian.com/", name = "getRandomNumber")
    public JAXBElement<GetRandomNumber> createGetRandomNumber(GetRandomNumber value) {
        return new JAXBElement<GetRandomNumber>(_GetRandomNumber_QNAME, GetRandomNumber.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SayHi }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.dotuian.com/", name = "sayHi")
    public JAXBElement<SayHi> createSayHi(SayHi value) {
        return new JAXBElement<SayHi>(_SayHi_QNAME, SayHi.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllUserList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.dotuian.com/", name = "getAllUserList")
    public JAXBElement<GetAllUserList> createGetAllUserList(GetAllUserList value) {
        return new JAXBElement<GetAllUserList>(_GetAllUserList_QNAME, GetAllUserList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUserByUseridResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.dotuian.com/", name = "getUserByUseridResponse")
    public JAXBElement<GetUserByUseridResponse> createGetUserByUseridResponse(GetUserByUseridResponse value) {
        return new JAXBElement<GetUserByUseridResponse>(_GetUserByUseridResponse_QNAME, GetUserByUseridResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllUsers }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.dotuian.com/", name = "getAllUsers")
    public JAXBElement<GetAllUsers> createGetAllUsers(GetAllUsers value) {
        return new JAXBElement<GetAllUsers>(_GetAllUsers_QNAME, GetAllUsers.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllUsersResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.dotuian.com/", name = "getAllUsersResponse")
    public JAXBElement<GetAllUsersResponse> createGetAllUsersResponse(GetAllUsersResponse value) {
        return new JAXBElement<GetAllUsersResponse>(_GetAllUsersResponse_QNAME, GetAllUsersResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUserByUserid }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.dotuian.com/", name = "getUserByUserid")
    public JAXBElement<GetUserByUserid> createGetUserByUserid(GetUserByUserid value) {
        return new JAXBElement<GetUserByUserid>(_GetUserByUserid_QNAME, GetUserByUserid.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SayHiResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.dotuian.com/", name = "sayHiResponse")
    public JAXBElement<SayHiResponse> createSayHiResponse(SayHiResponse value) {
        return new JAXBElement<SayHiResponse>(_SayHiResponse_QNAME, SayHiResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRandomNumberResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.dotuian.com/", name = "getRandomNumberResponse")
    public JAXBElement<GetRandomNumberResponse> createGetRandomNumberResponse(GetRandomNumberResponse value) {
        return new JAXBElement<GetRandomNumberResponse>(_GetRandomNumberResponse_QNAME, GetRandomNumberResponse.class, null, value);
    }

}
