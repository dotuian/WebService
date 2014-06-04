package com.dotuian.publish;

import javax.xml.ws.Endpoint;

import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.jaxws.EndpointImpl;

import com.dotuian.interceptor.AuthenticateInterceptor;
import com.dotuian.service.impl.HelloWordImpl;

public class PublishServiceWithEndpoint {

    public static void main(String[] args) {

        HelloWordImpl implementor = new HelloWordImpl();
        String address = "http://localhost:9000/HelloWorld";
        EndpointImpl impl = (EndpointImpl)Endpoint.publish(address, implementor);

        // 在服务器端添加输入输出拦截器
        impl.getInInterceptors().add(new LoggingInInterceptor());
        impl.getOutInterceptors().add(new LoggingOutInterceptor());

        // 添加自定义的用户验证拦截器
        impl.getInInterceptors().add(new AuthenticateInterceptor());
        
        
        
        System.err.println("service is published ... ");

    }

}
