
package webservices.modelo2;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the webservices.modelo2 package. 
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

    private final static QName _ImportacaoFuncionario_QNAME = new QName("http://services.soc.age.com/", "importacaoFuncionario");
    private final static QName _ImportacaoFuncionarioResponse_QNAME = new QName("http://services.soc.age.com/", "importacaoFuncionarioResponse");
    private final static QName _WSException_QNAME = new QName("http://services.soc.age.com/", "WSException");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: webservices.modelo2
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FuncionarioClassificacaoDeficienciaWsVo }
     * 
     */
    public FuncionarioClassificacaoDeficienciaWsVo createFuncionarioClassificacaoDeficienciaWsVo() {
        return new FuncionarioClassificacaoDeficienciaWsVo();
    }

    /**
     * Create an instance of {@link FuncionarioUnidadeWsVo }
     * 
     */
    public FuncionarioUnidadeWsVo createFuncionarioUnidadeWsVo() {
        return new FuncionarioUnidadeWsVo();
    }

    /**
     * Create an instance of {@link FuncionarioCargoWsVo }
     * 
     */
    public FuncionarioCargoWsVo createFuncionarioCargoWsVo() {
        return new FuncionarioCargoWsVo();
    }

    /**
     * Create an instance of {@link FuncionarioMotivoLicencaWsVo }
     * 
     */
    public FuncionarioMotivoLicencaWsVo createFuncionarioMotivoLicencaWsVo() {
        return new FuncionarioMotivoLicencaWsVo();
    }

    /**
     * Create an instance of {@link RetornoWsVo }
     * 
     */
    public RetornoWsVo createRetornoWsVo() {
        return new RetornoWsVo();
    }

    /**
     * Create an instance of {@link IdentificacaoWsVo }
     * 
     */
    public IdentificacaoWsVo createIdentificacaoWsVo() {
        return new IdentificacaoWsVo();
    }

    /**
     * Create an instance of {@link WSException }
     * 
     */
    public WSException createWSException() {
        return new WSException();
    }

    /**
     * Create an instance of {@link FuncionarioCentroCustoWsVo }
     * 
     */
    public FuncionarioCentroCustoWsVo createFuncionarioCentroCustoWsVo() {
        return new FuncionarioCentroCustoWsVo();
    }

    /**
     * Create an instance of {@link FuncionarioDeficienciaWsVo }
     * 
     */
    public FuncionarioDeficienciaWsVo createFuncionarioDeficienciaWsVo() {
        return new FuncionarioDeficienciaWsVo();
    }

    /**
     * Create an instance of {@link ImportacaoFuncionario }
     * 
     */
    public ImportacaoFuncionario createImportacaoFuncionario() {
        return new ImportacaoFuncionario();
    }

    /**
     * Create an instance of {@link FuncionarioModelo2WsVo }
     * 
     */
    public FuncionarioModelo2WsVo createFuncionarioModelo2WsVo() {
        return new FuncionarioModelo2WsVo();
    }

    /**
     * Create an instance of {@link IdentificacaoUsuarioWsVo }
     * 
     */
    public IdentificacaoUsuarioWsVo createIdentificacaoUsuarioWsVo() {
        return new IdentificacaoUsuarioWsVo();
    }

    /**
     * Create an instance of {@link ImportacaoFuncionarioResponse }
     * 
     */
    public ImportacaoFuncionarioResponse createImportacaoFuncionarioResponse() {
        return new ImportacaoFuncionarioResponse();
    }

    /**
     * Create an instance of {@link FuncionarioWsVo }
     * 
     */
    public FuncionarioWsVo createFuncionarioWsVo() {
        return new FuncionarioWsVo();
    }

    /**
     * Create an instance of {@link FuncionarioSetorWsVo }
     * 
     */
    public FuncionarioSetorWsVo createFuncionarioSetorWsVo() {
        return new FuncionarioSetorWsVo();
    }

    /**
     * Create an instance of {@link FuncionarioTurnoWsVo }
     * 
     */
    public FuncionarioTurnoWsVo createFuncionarioTurnoWsVo() {
        return new FuncionarioTurnoWsVo();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ImportacaoFuncionario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.soc.age.com/", name = "importacaoFuncionario")
    public JAXBElement<ImportacaoFuncionario> createImportacaoFuncionario(ImportacaoFuncionario value) {
        return new JAXBElement<ImportacaoFuncionario>(_ImportacaoFuncionario_QNAME, ImportacaoFuncionario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ImportacaoFuncionarioResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.soc.age.com/", name = "importacaoFuncionarioResponse")
    public JAXBElement<ImportacaoFuncionarioResponse> createImportacaoFuncionarioResponse(ImportacaoFuncionarioResponse value) {
        return new JAXBElement<ImportacaoFuncionarioResponse>(_ImportacaoFuncionarioResponse_QNAME, ImportacaoFuncionarioResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WSException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.soc.age.com/", name = "WSException")
    public JAXBElement<WSException> createWSException(WSException value) {
        return new JAXBElement<WSException>(_WSException_QNAME, WSException.class, null, value);
    }

}
