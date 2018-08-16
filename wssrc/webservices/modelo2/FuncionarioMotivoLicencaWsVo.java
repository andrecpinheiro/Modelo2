
package webservices.modelo2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for funcionarioMotivoLicencaWsVo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="funcionarioMotivoLicencaWsVo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigoDeIntegracao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoBusca" type="{http://services.soc.age.com/}tipoBuscaMotivoLicencaEnum" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "funcionarioMotivoLicencaWsVo", propOrder = {
    "codigo",
    "codigoDeIntegracao",
    "nome",
    "tipoBusca"
})
public class FuncionarioMotivoLicencaWsVo {

    protected String codigo;
    protected String codigoDeIntegracao;
    protected String nome;
    protected TipoBuscaMotivoLicencaEnum tipoBusca;

    /**
     * Gets the value of the codigo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * Sets the value of the codigo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigo(String value) {
        this.codigo = value;
    }

    /**
     * Gets the value of the codigoDeIntegracao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoDeIntegracao() {
        return codigoDeIntegracao;
    }

    /**
     * Sets the value of the codigoDeIntegracao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoDeIntegracao(String value) {
        this.codigoDeIntegracao = value;
    }

    /**
     * Gets the value of the nome property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNome() {
        return nome;
    }

    /**
     * Sets the value of the nome property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNome(String value) {
        this.nome = value;
    }

    /**
     * Gets the value of the tipoBusca property.
     * 
     * @return
     *     possible object is
     *     {@link TipoBuscaMotivoLicencaEnum }
     *     
     */
    public TipoBuscaMotivoLicencaEnum getTipoBusca() {
        return tipoBusca;
    }

    /**
     * Sets the value of the tipoBusca property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoBuscaMotivoLicencaEnum }
     *     
     */
    public void setTipoBusca(TipoBuscaMotivoLicencaEnum value) {
        this.tipoBusca = value;
    }

}
