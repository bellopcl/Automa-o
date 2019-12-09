
package br.com.senior.services;

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
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "g5-senior-services", targetNamespace = "http://services.senior.com.br", wsdlLocation = "http://eucalipto.nutriplan.com.br:8080/g5-senior-services/sapiens_Syncnutriplan_op?wsdl")
public class G5SeniorServices
    extends Service
{

    private final static URL G5SENIORSERVICES_WSDL_LOCATION;
    private final static WebServiceException G5SENIORSERVICES_EXCEPTION;
    private final static QName G5SENIORSERVICES_QNAME = new QName("http://services.senior.com.br", "g5-senior-services");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://eucalipto.nutriplan.com.br:8080/g5-senior-services/sapiens_Syncnutriplan_op?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        G5SENIORSERVICES_WSDL_LOCATION = url;
        G5SENIORSERVICES_EXCEPTION = e;
    }

    public G5SeniorServices() {
        super(__getWsdlLocation(), G5SENIORSERVICES_QNAME);
    }

    public G5SeniorServices(WebServiceFeature... features) {
        super(__getWsdlLocation(), G5SENIORSERVICES_QNAME, features);
    }

    public G5SeniorServices(URL wsdlLocation) {
        super(wsdlLocation, G5SENIORSERVICES_QNAME);
    }

    public G5SeniorServices(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, G5SENIORSERVICES_QNAME, features);
    }

    public G5SeniorServices(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public G5SeniorServices(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns SapiensSyncnutriplanOp
     */
    @WebEndpoint(name = "sapiens_Syncnutriplan_opPort")
    public SapiensSyncnutriplanOp getSapiensSyncnutriplanOpPort() {
        return super.getPort(new QName("http://services.senior.com.br", "sapiens_Syncnutriplan_opPort"), SapiensSyncnutriplanOp.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns SapiensSyncnutriplanOp
     */
    @WebEndpoint(name = "sapiens_Syncnutriplan_opPort")
    public SapiensSyncnutriplanOp getSapiensSyncnutriplanOpPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://services.senior.com.br", "sapiens_Syncnutriplan_opPort"), SapiensSyncnutriplanOp.class, features);
    }

    private static URL __getWsdlLocation() {
        if (G5SENIORSERVICES_EXCEPTION!= null) {
            throw G5SENIORSERVICES_EXCEPTION;
        }
        return G5SENIORSERVICES_WSDL_LOCATION;
    }

}
