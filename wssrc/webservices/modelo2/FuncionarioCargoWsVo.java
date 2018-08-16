
package webservices.modelo2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for funcionarioCargoWsVo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="funcionarioCargoWsVo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="atualizaDescricaoRequisitosCargoPeloCbo" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="cbo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigoRh" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descricaoDetalhada" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descricaoLocal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="educacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="experiencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="funcao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gfip" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="habilidades" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="localTrabalho" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="materialUtilizado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mobiliarioUtilizado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nomeLegal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="orientacaoAso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="requisitosFuncao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="status" type="{http://services.soc.age.com/}situacao" minOccurs="0"/>
 *         &lt;element name="tipoBusca" type="{http://services.soc.age.com/}tipoBuscaCargoEnum" minOccurs="0"/>
 *         &lt;element name="treinamento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "funcionarioCargoWsVo", propOrder = {
    "atualizaDescricaoRequisitosCargoPeloCbo",
    "cbo",
    "codigo",
    "codigoRh",
    "descricaoDetalhada",
    "descricaoLocal",
    "educacao",
    "experiencia",
    "funcao",
    "gfip",
    "habilidades",
    "localTrabalho",
    "materialUtilizado",
    "mobiliarioUtilizado",
    "nome",
    "nomeLegal",
    "orientacaoAso",
    "requisitosFuncao",
    "status",
    "tipoBusca",
    "treinamento"
})
public class FuncionarioCargoWsVo {

    protected boolean atualizaDescricaoRequisitosCargoPeloCbo;
    protected String cbo;
    protected String codigo;
    protected String codigoRh;
    protected String descricaoDetalhada;
    protected String descricaoLocal;
    protected String educacao;
    protected String experiencia;
    protected String funcao;
    protected Integer gfip;
    protected String habilidades;
    protected String localTrabalho;
    protected String materialUtilizado;
    protected String mobiliarioUtilizado;
    protected String nome;
    protected String nomeLegal;
    protected String orientacaoAso;
    protected String requisitosFuncao;
    protected Situacao status;
    protected TipoBuscaCargoEnum tipoBusca;
    protected String treinamento;

    /**
     * Gets the value of the atualizaDescricaoRequisitosCargoPeloCbo property.
     * 
     */
    public boolean isAtualizaDescricaoRequisitosCargoPeloCbo() {
        return atualizaDescricaoRequisitosCargoPeloCbo;
    }

    /**
     * Sets the value of the atualizaDescricaoRequisitosCargoPeloCbo property.
     * 
     */
    public void setAtualizaDescricaoRequisitosCargoPeloCbo(boolean value) {
        this.atualizaDescricaoRequisitosCargoPeloCbo = value;
    }

    /**
     * Gets the value of the cbo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCbo() {
        return cbo;
    }

    /**
     * Sets the value of the cbo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCbo(String value) {
        this.cbo = value;
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
     * Gets the value of the descricaoDetalhada property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescricaoDetalhada() {
        return descricaoDetalhada;
    }

    /**
     * Sets the value of the descricaoDetalhada property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescricaoDetalhada(String value) {
        this.descricaoDetalhada = value;
    }

    /**
     * Gets the value of the descricaoLocal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescricaoLocal() {
        return descricaoLocal;
    }

    /**
     * Sets the value of the descricaoLocal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescricaoLocal(String value) {
        this.descricaoLocal = value;
    }

    /**
     * Gets the value of the educacao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEducacao() {
        return educacao;
    }

    /**
     * Sets the value of the educacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEducacao(String value) {
        this.educacao = value;
    }

    /**
     * Gets the value of the experiencia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExperiencia() {
        return experiencia;
    }

    /**
     * Sets the value of the experiencia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExperiencia(String value) {
        this.experiencia = value;
    }

    /**
     * Gets the value of the funcao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFuncao() {
        return funcao;
    }

    /**
     * Sets the value of the funcao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFuncao(String value) {
        this.funcao = value;
    }

    /**
     * Gets the value of the gfip property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getGfip() {
        return gfip;
    }

    /**
     * Sets the value of the gfip property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setGfip(Integer value) {
        this.gfip = value;
    }

    /**
     * Gets the value of the habilidades property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHabilidades() {
        return habilidades;
    }

    /**
     * Sets the value of the habilidades property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHabilidades(String value) {
        this.habilidades = value;
    }

    /**
     * Gets the value of the localTrabalho property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalTrabalho() {
        return localTrabalho;
    }

    /**
     * Sets the value of the localTrabalho property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalTrabalho(String value) {
        this.localTrabalho = value;
    }

    /**
     * Gets the value of the materialUtilizado property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaterialUtilizado() {
        return materialUtilizado;
    }

    /**
     * Sets the value of the materialUtilizado property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaterialUtilizado(String value) {
        this.materialUtilizado = value;
    }

    /**
     * Gets the value of the mobiliarioUtilizado property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobiliarioUtilizado() {
        return mobiliarioUtilizado;
    }

    /**
     * Sets the value of the mobiliarioUtilizado property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobiliarioUtilizado(String value) {
        this.mobiliarioUtilizado = value;
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
     * Gets the value of the nomeLegal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeLegal() {
        return nomeLegal;
    }

    /**
     * Sets the value of the nomeLegal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeLegal(String value) {
        this.nomeLegal = value;
    }

    /**
     * Gets the value of the orientacaoAso property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrientacaoAso() {
        return orientacaoAso;
    }

    /**
     * Sets the value of the orientacaoAso property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrientacaoAso(String value) {
        this.orientacaoAso = value;
    }

    /**
     * Gets the value of the requisitosFuncao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequisitosFuncao() {
        return requisitosFuncao;
    }

    /**
     * Sets the value of the requisitosFuncao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequisitosFuncao(String value) {
        this.requisitosFuncao = value;
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
     *     {@link TipoBuscaCargoEnum }
     *     
     */
    public TipoBuscaCargoEnum getTipoBusca() {
        return tipoBusca;
    }

    /**
     * Sets the value of the tipoBusca property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoBuscaCargoEnum }
     *     
     */
    public void setTipoBusca(TipoBuscaCargoEnum value) {
        this.tipoBusca = value;
    }

    /**
     * Gets the value of the treinamento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTreinamento() {
        return treinamento;
    }

    /**
     * Sets the value of the treinamento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTreinamento(String value) {
        this.treinamento = value;
    }

}
