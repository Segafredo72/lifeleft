
package generated.leftlife;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the generated.leftlife package. 
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

    private final static QName _AnneeRestantesAVivre_QNAME = new QName("http://lifeleft.com/", "anneeRestantesAVivre");
    private final static QName _AnneeRestantesAVivreResponse_QNAME = new QName("http://lifeleft.com/", "anneeRestantesAVivreResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: generated.leftlife
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AnneeRestantesAVivre }
     * 
     */
    public AnneeRestantesAVivre createAnneeRestantesAVivre() {
        return new AnneeRestantesAVivre();
    }

    /**
     * Create an instance of {@link AnneeRestantesAVivreResponse }
     * 
     */
    public AnneeRestantesAVivreResponse createAnneeRestantesAVivreResponse() {
        return new AnneeRestantesAVivreResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AnneeRestantesAVivre }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://lifeleft.com/", name = "anneeRestantesAVivre")
    public JAXBElement<AnneeRestantesAVivre> createAnneeRestantesAVivre(AnneeRestantesAVivre value) {
        return new JAXBElement<AnneeRestantesAVivre>(_AnneeRestantesAVivre_QNAME, AnneeRestantesAVivre.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AnneeRestantesAVivreResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://lifeleft.com/", name = "anneeRestantesAVivreResponse")
    public JAXBElement<AnneeRestantesAVivreResponse> createAnneeRestantesAVivreResponse(AnneeRestantesAVivreResponse value) {
        return new JAXBElement<AnneeRestantesAVivreResponse>(_AnneeRestantesAVivreResponse_QNAME, AnneeRestantesAVivreResponse.class, null, value);
    }

}
