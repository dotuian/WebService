package com.dotuian.client.interceptor;

import java.util.List;

import javax.xml.namespace.QName;

import org.apache.cxf.binding.soap.SoapMessage;
import org.apache.cxf.headers.Header;
import org.apache.cxf.helpers.DOMUtils;
import org.apache.cxf.interceptor.Fault;
import org.apache.cxf.phase.AbstractPhaseInterceptor;
import org.apache.cxf.phase.Phase;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class AddUserinfo2HeaderInterceptor extends
        AbstractPhaseInterceptor<SoapMessage> {

    private String username;
    private String password;

    public AddUserinfo2HeaderInterceptor(String username, String password) {
        // 指定拦截器执行的阶段
        super(Phase.PREPARE_SEND);
        this.username = username;
        this.password = password;
    }

    @Override
    public void handleMessage(SoapMessage message) throws Fault {
        System.out.println("======== AddUserinfo2HeaderInterceptor#handleMessage() ========");
        
        // 创建Document对象
        Document doc = DOMUtils.createDocument();
        Element element = doc.createElement("authenticate");
        
        Element username = doc.createElement("username");
        username.setTextContent(this.username);
        Element password = doc.createElement("password");
        password.setTextContent(this.password);
        
        element.appendChild(username);
        element.appendChild(password);
        
        /**
         * <authenticate>
         *   <username>用户名</username>
         *   <password>密码</password>
         * </authenticate>
         */
        
        
        // 将上述Docoment信息添加到SOAP消息的Header中
        List<Header> headers = message.getHeaders();
        headers.add(new Header(new QName("dotuian"),element));
    }

}
