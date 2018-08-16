
package webservices.modelo2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for funcionarioSetorWsVo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="funcionarioSetorWsVo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigoRh" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descricao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="observacaoAso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="status" type="{http://services.soc.age.com/}situacao" minOccurs="0"/>
 *         &lt;element name="tipoBusca" type="{http://services.soc.age.com/}tipoBuscaSetorEnum" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "funcionarioSetorWsVo", propOrder = {
    "codigo",
    "codigoRh",
    "descricao",
    "nome",
    "observacaoAso",
    "status",
    "tipoBusca"
})
public class FuncionarioSetorWsVo {

    protected String codigo;
    protected String codigoRh;
    protected String descricao;
    protected String nome;
    protected String observacaoAso;
    protected Situacao status;
    protected TipoBuscaSetorEnum tipoBusca;

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
     * Gets the value of the descricao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * Sets the value of the descricao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescricao(String value) {
        this.descricao = value;
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
     * Gets the value of the observacaoAso property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObservacaoAso() {
        return observacaoAso;
    }

    /**
     * Sets the value of the observacaoAso property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObservacaoAso(String value) {
        this.observacaoAso = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link Situacao }
     *     
     */
    public Situacao getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link Situacao }
     *     
     */
    public void setStatus(Situacao value) {
        this.status = value;
    }

    /**
     * Gets the value of the tipoBusca property.
     * 
     * @return
     *     possible object is
     *     {@link TipoBuscaSetorEnum }
     *     
     */
    public TipoBuscaSetorEnum getTipoBusca() {
        return tipoBusca;
    }

    /**
     * Sets the value of the tipoBusca property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoBuscaSetorEnum }
     *     
     */
    public void setTipoBusca(TipoBuscaSetorEnum value) {
        this.tipoBusca = value;
    }

}
