package com.jiangda.cust.integration.transport.gener.jdintegration;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.7.18
 * 2017-04-04T19:56:13.685+08:00
 * Generated source version: 2.7.18
 * 
 */
@WebService(targetNamespace = "http://ws.integration.framework.jiangda.com/", name = "JDIntegrationService")
@XmlSeeAlso({ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface JDIntegrationService {

    @WebMethod
    @WebResult(name = "executeResponse", targetNamespace = "http://ws.integration.framework.jiangda.com/", partName = "parameters")
    public ExecuteResponse execute(
        @WebParam(partName = "parameters", name = "execute", targetNamespace = "http://ws.integration.framework.jiangda.com/")
        Execute parameters,
        @WebParam(partName = "authInfo", name = "authInfo", targetNamespace = "http://ws.integration.framework.jiangda.com/", header = true)
        AuthInfo authInfo
    );
}