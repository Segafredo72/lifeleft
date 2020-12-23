
package generated.ageservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the generated.ageservice package. 
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

    private final static QName _GetAge_QNAME = new QName("http://ageservice/", "getAge");
    private final static QName _GetAgeResponse_QNAME = new QName("http://ageservice/", "getAgeResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: generated.ageservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetAge }
     * 
     */
    public GetAge createGetAge() {
        return new GetAge();
    }

    /**
     * Create an instance of {@link GetAgeResponse }
     * 
     */
    public GetAgeResponse createGetAgeResponse() {
        return new GetAgeResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAge }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ageservice/", name = "getAge")
    public JAXBElement<GetAge> createGetAge(GetAge value) {
        return new JAXBElement<GetAge>(_GetAge_QNAME, GetAge.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAgeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ageservice/", name = "getAgeResponse")
    public JAXBElement<GetAgeResponse> createGetAgeResponse(GetAgeResponse value) {
        return new JAXBElement<GetAgeResponse>(_GetAgeResponse_QNAME, GetAgeResponse.class, null, value);
    }

}
