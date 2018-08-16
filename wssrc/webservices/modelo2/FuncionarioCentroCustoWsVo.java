
package webservices.modelo2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for funcionarioCentroCustoWsVo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="funcionarioCentroCustoWsVo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigoRh" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoBusca" type="{http://services.soc.age.com/}tipoBuscaCentroCustoEnum" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "funcionarioCentroCustoWsVo", propOrder = {
    "codigo",
    "codigoRh",
    "nome",
    "tipoBusca"
})
public class FuncionarioCentroCustoWsVo {

    protected String codigo;
    protected String codigoRh;
    protected String nome;
    protected TipoBuscaCentroCustoEnum tipoBusca;

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
     * Gets the value of the codigoRh property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoRh() {
        return codigoRh;
    }

    /**
     * Sets the value of the codigoRh property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoRh(String value) {
        this.codigoRh = value;
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
     *     {@link TipoBuscaCentroCustoEnum }
     *     
     */
    public TipoBuscaCentroCustoEnum getTipoBusca() {
        return tipoBusca;
    }

    /**
     * Sets the value of the tipoBusca property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoBuscaCentroCustoEnum }
     *     
     */
    public void setTipoBusca(TipoBuscaCentroCustoEnum value) {
        this.tipoBusca = value;
    }

}
