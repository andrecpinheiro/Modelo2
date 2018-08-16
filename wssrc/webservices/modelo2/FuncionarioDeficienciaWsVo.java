
package webservices.modelo2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for funcionarioDeficienciaWsVo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="funcionarioDeficienciaWsVo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cids" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="classificacaoDeficiencia" type="{http://services.soc.age.com/}funcionarioClassificacaoDeficienciaWsVo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="codigoLegislacaoReferencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigoMedico" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dataEmissaoLaudo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="deficiencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="deficiente" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="gravarHistorico" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="nomeLegislacaoReferencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="observacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="origemDeficiencia" type="{http://services.soc.age.com/}origemDeficienciaEnum" minOccurs="0"/>
 *         &lt;element name="parecerLaudo" type="{http://services.soc.age.com/}parecerLaudoEnum" minOccurs="0"/>
 *         &lt;element name="reabilitado" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="tipoBuscaLegislacaoReferencia" type="{http://services.soc.age.com/}tipoBuscaEnum" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "funcionarioDeficienciaWsVo", propOrder = {
    "cids",
    "classificacaoDeficiencia",
    "codigoLegislacaoReferencia",
    "codigoMedico",
    "dataEmissaoLaudo",
    "deficiencia",
    "deficiente",
    "gravarHistorico",
    "nomeLegislacaoReferencia",
    "observacao",
    "origemDeficiencia",
    "parecerLaudo",
    "reabilitado",
    "tipoBuscaLegislacaoReferencia"
})
public class FuncionarioDeficienciaWsVo {

    @XmlElement(nillable = true)
    protected List<String> cids;
    @XmlElement(nillable = true)
    protected List<FuncionarioClassificacaoDeficienciaWsVo> classificacaoDeficiencia;
    protected String codigoLegislacaoReferencia;
    protected String codigoMedico;
    protected String dataEmissaoLaudo;
    protected String deficiencia;
    protected Boolean deficiente;
    protected Boolean gravarHistorico;
    protected String nomeLegislacaoReferencia;
    protected String observacao;
    protected OrigemDeficienciaEnum origemDeficiencia;
    protected ParecerLaudoEnum parecerLaudo;
    protected Boolean reabilitado;
    protected TipoBuscaEnum tipoBuscaLegislacaoReferencia;

    /**
     * Gets the value of the cids property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cids property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCids().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCids() {
        if (cids == null) {
            cids = new ArrayList<String>();
        }
        return this.cids;
    }

    /**
     * Gets the value of the classificacaoDeficiencia property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the classificacaoDeficiencia property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClassificacaoDeficiencia().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FuncionarioClassificacaoDeficienciaWsVo }
     * 
     * 
     */
    public List<FuncionarioClassificacaoDeficienciaWsVo> getClassificacaoDeficiencia() {
        if (classificacaoDeficiencia == null) {
            classificacaoDeficiencia = new ArrayList<FuncionarioClassificacaoDeficienciaWsVo>();
        }
        return this.classificacaoDeficiencia;
    }

    /**
     * Gets the value of the codigoLegislacaoReferencia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoLegislacaoReferencia() {
        return codigoLegislacaoReferencia;
    }

    /**
     * Sets the value of the codigoLegislacaoReferencia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoLegislacaoReferencia(String value) {
        this.codigoLegislacaoReferencia = value;
    }

    /**
     * Gets the value of the codigoMedico property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoMedico() {
        return codigoMedico;
    }

    /**
     * Sets the value of the codigoMedico property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoMedico(String value) {
        this.codigoMedico = value;
    }

    /**
     * Gets the value of the dataEmissaoLaudo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataEmissaoLaudo() {
        return dataEmissaoLaudo;
    }

    /**
     * Sets the value of the dataEmissaoLaudo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataEmissaoLaudo(String value) {
        this.dataEmissaoLaudo = value;
    }

    /**
     * Gets the value of the deficiencia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeficiencia() {
        return deficiencia;
    }

    /**
     * Sets the value of the deficiencia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeficiencia(String value) {
        this.deficiencia = value;
    }

    /**
     * Gets the value of the deficiente property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDeficiente() {
        return deficiente;
    }

    /**
     * Sets the value of the deficiente property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDeficiente(Boolean value) {
        this.deficiente = value;
    }

    /**
     * Gets the value of the gravarHistorico property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGravarHistorico() {
        return gravarHistorico;
    }

    /**
     * Sets the value of the gravarHistorico property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGravarHistorico(Boolean value) {
        this.gravarHistorico = value;
    }

    /**
     * Gets the value of the nomeLegislacaoReferencia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeLegislacaoReferencia() {
        return nomeLegislacaoReferencia;
    }

    /**
     * Sets the value of the nomeLegislacaoReferencia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeLegislacaoReferencia(String value) {
        this.nomeLegislacaoReferencia = value;
    }

    /**
     * Gets the value of the observacao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObservacao() {
        return observacao;
    }

    /**
     * Sets the value of the observacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObservacao(String value) {
        this.observacao = value;
    }

    /**
     * Gets the value of the origemDeficiencia property.
     * 
     * @return
     *     possible object is
     *     {@link OrigemDeficienciaEnum }
     *     
     */
    public OrigemDeficienciaEnum getOrigemDeficiencia() {
        return origemDeficiencia;
    }

    /**
     * Sets the value of the origemDeficiencia property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrigemDeficienciaEnum }
     *     
     */
    public void setOrigemDeficiencia(OrigemDeficienciaEnum value) {
        this.origemDeficiencia = value;
    }

    /**
     * Gets the value of the parecerLaudo property.
     * 
     * @return
     *     possible object is
     *     {@link ParecerLaudoEnum }
     *     
     */
    public ParecerLaudoEnum getParecerLaudo() {
        return parecerLaudo;
    }

    /**
     * Sets the value of the parecerLaudo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParecerLaudoEnum }
     *     
     */
    public void setParecerLaudo(ParecerLaudoEnum value) {
        this.parecerLaudo = value;
    }

    /**
     * Gets the value of the reabilitado property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReabilitado() {
        return reabilitado;
    }

    /**
     * Sets the value of the reabilitado property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReabilitado(Boolean value) {
        this.reabilitado = value;
    }

    /**
     * Gets the value of the tipoBuscaLegislacaoReferencia property.
     * 
     * @return
     *     possible object is
     *     {@link TipoBuscaEnum }
     *     
     */
    public TipoBuscaEnum getTipoBuscaLegislacaoReferencia() {
        return tipoBuscaLegislacaoReferencia;
    }

    /**
     * Sets the value of the tipoBuscaLegislacaoReferencia property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoBuscaEnum }
     *     
     */
    public void setTipoBuscaLegislacaoReferencia(TipoBuscaEnum value) {
        this.tipoBuscaLegislacaoReferencia = value;
    }

}
