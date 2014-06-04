
package com.dotuian.client.wsimport;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "HelloWordService", targetNamespace = "http://impl.service.dotuian.com/", wsdlLocation = "http://localhost:9000/HelloWorld?wsdl")
public class HelloWordService
    extends Service
{

    private final static URL HELLOWORDSERVICE_WSDL_LOCATION;
    private final static WebServiceException HELLOWORDSERVICE_EXCEPTION;
    private final static QName HELLOWORDSERVICE_QNAME = new QName("http://impl.service.dotuian.com/", "HelloWordService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:9000/HelloWorld?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        HELLOWORDSERVICE_WSDL_LOCATION = url;
        HELLOWORDSERVICE_EXCEPTION = e;
    }

    public HelloWordService() {
        super(__getWsdlLocation(), HELLOWORDSERVICE_QNAME);
    }

    public HelloWordService(WebServiceFeature... features) {
        super(__getWsdlLocation(), HELLOWORDSERVICE_QNAME, features);
    }

    public HelloWordService(URL wsdlLocation) {
        super(wsdlLocation, HELLOWORDSERVICE_QNAME);
    }

    public HelloWordService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, HELLOWORDSERVICE_QNAME, features);
    }

    public HelloWordService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public HelloWordService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns IHelloWorld
     */
    @WebEndpoint(name = "HelloWordImplPort")
    public IHelloWorld getHelloWordImplPort() {
        return super.getPort(new QName("http://impl.service.dotuian.com/", "HelloWordImplPort"), IHelloWorld.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns IHelloWorld
     */
    @WebEndpoint(name = "HelloWordImplPort")
    public IHelloWorld getHelloWordImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://impl.service.dotuian.com/", "HelloWordImplPort"), IHelloWorld.class, features);
    }

    private static URL __getWsdlLocation() {
        if (HELLOWORDSERVICE_EXCEPTION!= null) {
            throw HELLOWORDSERVICE_EXCEPTION;
        }
        return HELLOWORDSERVICE_WSDL_LOCATION;
    }

}