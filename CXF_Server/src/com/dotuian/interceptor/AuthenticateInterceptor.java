package com.dotuian.interceptor;

import java.util.List;

import org.apache.cxf.binding.soap.SoapMessage;
import org.apache.cxf.headers.Header;
import org.apache.cxf.interceptor.Fault;
import org.apache.cxf.phase.AbstractPhaseInterceptor;
import org.apache.cxf.phase.Phase;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

/**
 * 对客户端进行验证的拦截器
 * 
 * @author dotuian
 */
public class AuthenticateInterceptor extends
        AbstractPhaseInterceptor<SoapMessage> {

    public AuthenticateInterceptor() {
        // 该拦截器在调用之前拦截SOAP消息
        super(Phase.PRE_INVOKE);

    }

    // 实现自己的拦截器的时候，需要实现handleMessage方法。
    // handleMessage方法中的形参，就是拦截到SOAP消息的对象。
    // 在handleMessage方法中，可以对SOAP消息进行修改。
    public void handleMessage(SoapMessage message) throws Fault {
        System.out.println("=============================");

        List<Header> headers = message.getHeaders();
        if (headers == null || headers.size() == 0) {
            throw new IllegalArgumentException("客户端没有传递验证信息过来！");
        }

        Header firstHeader = headers.get(0);
        Element element = (Element) firstHeader.getObject();

        NodeList usernames = element.getElementsByTagName("username");
        NodeList passwords = element.getElementsByTagName("password");

        if (usernames.getLength() != 1) {
            throw new IllegalArgumentException("没有用户名信息或格式错误！");
        }

        if (passwords.getLength() != 1) {
            throw new IllegalArgumentException("没有密码信息或格式错误！");
        }

        String username = usernames.item(0).getTextContent();
        String password = passwords.item(0).getTextContent();
        if (!("username".equals(username) && "password".equals(password))) {
            throw new IllegalArgumentException("用户名或密码错误！");
        }

    };

}
