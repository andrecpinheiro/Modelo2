
package webservices.modelo2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for identificacaoWsVo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="identificacaoWsVo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="chaveAcesso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigoEmpresaPrincipal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigoResponsavel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="homologacao" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "identificacaoWsVo", propOrder = {
    "chaveAcesso",
    "codigoEmpresaPrincipal",
    "codigoResponsavel",
    "homologacao"
})
public class IdentificacaoWsVo {

    protected String chaveAcesso;
    protected String codigoEmpresaPrincipal;
    protected String codigoResponsavel;
    protected boolean homologacao;

    /**
     * Gets the value of the chaveAcesso property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChaveAcesso() {
        return chaveAcesso;
    }

    /**
     * Sets the value of the chaveAcesso property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChaveAcesso(String value) {
        this.chaveAcesso = value;
    }

    /**
     * Gets the value of the codigoEmpresaPrincipal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoEmpresaPrincipal() {
        return codigoEmpresaPrincipal;
    }

    /**
     * Sets the value of the codigoEmpresaPrincipal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoEmpresaPrincipal(String value) {
        this.codigoEmpresaPrincipal = value;
    }

    /**
     * Gets the value of the codigoResponsavel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoResponsavel() {
        return codigoResponsavel;
    }

    /**
     * Sets the value of the codigoResponsavel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoResponsavel(String value) {
        this.codigoResponsavel = value;
    }

    /**
     * Gets the value of the homologacao property.
     * 
     */
    public boolean isHomologacao() {
        return homologacao;
    }

    /**
     * Sets the value of the homologacao property.
     * 
     */
    public void setHomologacao(boolean value) {
        this.homologacao = value;
    }

}
