
package webservices.modelo2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for funcionarioClassificacaoDeficienciaWsVo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="funcionarioClassificacaoDeficienciaWsVo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="classificacao" type="{http://services.soc.age.com/}classificacaoDeficienciaEnum" minOccurs="0"/>
 *         &lt;element name="codigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoBusca" type="{http://services.soc.age.com/}tipoBuscaEnum" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "funcionarioClassificacaoDeficienciaWsVo", propOrder = {
    "classificacao",
    "codigo",
    "nome",
    "tipoBusca"
})
public class FuncionarioClassificacaoDeficienciaWsVo {

    protected ClassificacaoDeficienciaEnum classificacao;
    protected String codigo;
    protected String nome;
    protected TipoBuscaEnum tipoBusca;

    /**
     * Gets the value of the classificacao property.
     * 
     * @return
     *     possible object is
     *     {@link ClassificacaoDeficienciaEnum }
     *     
     */
    public ClassificacaoDeficienciaEnum getClassificacao() {
        return classificacao;
    }

    /**
     * Sets the value of the classificacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClassificacaoDeficienciaEnum }
     *     
     */
    public void setClassificacao(ClassificacaoDeficienciaEnum value) {
        this.classificacao = value;
    }

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
     *     {@link TipoBuscaEnum }
     *     
     */
    public TipoBuscaEnum getTipoBusca() {
        return tipoBusca;
    }

    /**
     * Sets the value of the tipoBusca property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoBuscaEnum }
     *     
     */
    public void setTipoBusca(TipoBuscaEnum value) {
        this.tipoBusca = value;
    }

}
