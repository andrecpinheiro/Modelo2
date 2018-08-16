
package webservices.modelo2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for funcionarioUnidadeWsVo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="funcionarioUnidadeWsVo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bairro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bairroCobranca" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cep" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cepCobranca" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cidade" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cidadeCobranca" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cnpj_cei" type="{http://services.soc.age.com/}cnpjCei" minOccurs="0"/>
 *         &lt;element name="codigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigoArquivo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigoCnae" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigoCnpjCei" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigoMunicipio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigoMunicipioCobranca" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigoRh" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="complemento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="complementoCobranca" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dataAssinaturaContrato" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descricaoCnae" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="endereco" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="enderecoCobranca" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="estado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="estadoCobranca" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="grauRisco" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="inscricaoEstadual" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="inscricaoMunicipal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numero" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numeroCobranca" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="observacaoASO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="observacaoContrato" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="observacaoPPP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="percentualCalculoBrigada" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="razaoSocial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="status" type="{http://services.soc.age.com/}situacao" minOccurs="0"/>
 *         &lt;element name="telefoneCat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoBusca" type="{http://services.soc.age.com/}tipoBuscaUnidadeEnum" minOccurs="0"/>
 *         &lt;element name="tipoCnae" type="{http://services.soc.age.com/}tipoCnae" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "funcionarioUnidadeWsVo", propOrder = {
    "bairro",
    "bairroCobranca",
    "cep",
    "cepCobranca",
    "cidade",
    "cidadeCobranca",
    "cnpjCei",
    "codigo",
    "codigoArquivo",
    "codigoCnae",
    "codigoCnpjCei",
    "codigoMunicipio",
    "codigoMunicipioCobranca",
    "codigoRh",
    "complemento",
    "complementoCobranca",
    "dataAssinaturaContrato",
    "descricaoCnae",
    "endereco",
    "enderecoCobranca",
    "estado",
    "estadoCobranca",
    "grauRisco",
    "inscricaoEstadual",
    "inscricaoMunicipal",
    "nome",
    "numero",
    "numeroCobranca",
    "observacaoASO",
    "observacaoContrato",
    "observacaoPPP",
    "percentualCalculoBrigada",
    "razaoSocial",
    "status",
    "telefoneCat",
    "tipoBusca",
    "tipoCnae"
})
public class FuncionarioUnidadeWsVo {

    protected String bairro;
    protected String bairroCobranca;
    protected String cep;
    protected String cepCobranca;
    protected String cidade;
    protected String cidadeCobranca;
    @XmlElement(name = "cnpj_cei")
    protected CnpjCei cnpjCei;
    protected String codigo;
    protected String codigoArquivo;
    protected String codigoCnae;
    protected String codigoCnpjCei;
    protected String codigoMunicipio;
    protected String codigoMunicipioCobranca;
    protected String codigoRh;
    protected String complemento;
    protected String complementoCobranca;
    protected String dataAssinaturaContrato;
    protected String descricaoCnae;
    protected String endereco;
    protected String enderecoCobranca;
    protected String estado;
    protected String estadoCobranca;
    protected Integer grauRisco;
    protected String inscricaoEstadual;
    protected String inscricaoMunicipal;
    protected String nome;
    protected String numero;
    protected String numeroCobranca;
    protected String observacaoASO;
    protected String observacaoContrato;
    protected String observacaoPPP;
    protected String percentualCalculoBrigada;
    protected String razaoSocial;
    protected Situacao status;
    protected String telefoneCat;
    protected TipoBuscaUnidadeEnum tipoBusca;
    protected TipoCnae tipoCnae;

    /**
     * Gets the value of the bairro property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBairro() {
        return bairro;
    }

    /**
     * Sets the value of the bairro property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBairro(String value) {
        this.bairro = value;
    }

    /**
     * Gets the value of the bairroCobranca property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBairroCobranca() {
        return bairroCobranca;
    }

    /**
     * Sets the value of the bairroCobranca property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBairroCobranca(String value) {
        this.bairroCobranca = value;
    }

    /**
     * Gets the value of the cep property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCep() {
        return cep;
    }

    /**
     * Sets the value of the cep property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCep(String value) {
        this.cep = value;
    }

    /**
     * Gets the value of the cepCobranca property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCepCobranca() {
        return cepCobranca;
    }

    /**
     * Sets the value of the cepCobranca property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCepCobranca(String value) {
        this.cepCobranca = value;
    }

    /**
     * Gets the value of the cidade property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCidade() {
        return cidade;
    }

    /**
     * Sets the value of the cidade property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCidade(String value) {
        this.cidade = value;
    }

    /**
     * Gets the value of the cidadeCobranca property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCidadeCobranca() {
        return cidadeCobranca;
    }

    /**
     * Sets the value of the cidadeCobranca property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCidadeCobranca(String value) {
        this.cidadeCobranca = value;
    }

    /**
     * Gets the value of the cnpjCei property.
     * 
     * @return
     *     possible object is
     *     {@link CnpjCei }
     *     
     */
    public CnpjCei getCnpjCei() {
        return cnpjCei;
    }

    /**
     * Sets the value of the cnpjCei property.
     * 
     * @param value
     *     allowed object is
     *     {@link CnpjCei }
     *     
     */
    public void setCnpjCei(CnpjCei value) {
        this.cnpjCei = value;
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
     * Gets the value of the codigoArquivo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoArquivo() {
        return codigoArquivo;
    }

    /**
     * Sets the value of the codigoArquivo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoArquivo(String value) {
        this.codigoArquivo = value;
    }

    /**
     * Gets the value of the codigoCnae property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoCnae() {
        return codigoCnae;
    }

    /**
     * Sets the value of the codigoCnae property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoCnae(String value) {
        this.codigoCnae = value;
    }

    /**
     * Gets the value of the codigoCnpjCei property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoCnpjCei() {
        return codigoCnpjCei;
    }

    /**
     * Sets the value of the codigoCnpjCei property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoCnpjCei(String value) {
        this.codigoCnpjCei = value;
    }

    /**
     * Gets the value of the codigoMunicipio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoMunicipio() {
        return codigoMunicipio;
    }

    /**
     * Sets the value of the codigoMunicipio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoMunicipio(String value) {
        this.codigoMunicipio = value;
    }

    /**
     * Gets the value of the codigoMunicipioCobranca property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoMunicipioCobranca() {
        return codigoMunicipioCobranca;
    }

    /**
     * Sets the value of the codigoMunicipioCobranca property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoMunicipioCobranca(String value) {
        this.codigoMunicipioCobranca = value;
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
     * Gets the value of the complemento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComplemento() {
        return complemento;
    }

    /**
     * Sets the value of the complemento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComplemento(String value) {
        this.complemento = value;
    }

    /**
     * Gets the value of the complementoCobranca property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComplementoCobranca() {
        return complementoCobranca;
    }

    /**
     * Sets the value of the complementoCobranca property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComplementoCobranca(String value) {
        this.complementoCobranca = value;
    }

    /**
     * Gets the value of the dataAssinaturaContrato property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataAssinaturaContrato() {
        return dataAssinaturaContrato;
    }

    /**
     * Sets the value of the dataAssinaturaContrato property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataAssinaturaContrato(String value) {
        this.dataAssinaturaContrato = value;
    }

    /**
     * Gets the value of the descricaoCnae property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescricaoCnae() {
        return descricaoCnae;
    }

    /**
     * Sets the value of the descricaoCnae property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescricaoCnae(String value) {
        this.descricaoCnae = value;
    }

    /**
     * Gets the value of the endereco property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * Sets the value of the endereco property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndereco(String value) {
        this.endereco = value;
    }

    /**
     * Gets the value of the enderecoCobranca property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnderecoCobranca() {
        return enderecoCobranca;
    }

    /**
     * Sets the value of the enderecoCobranca property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnderecoCobranca(String value) {
        this.enderecoCobranca = value;
    }

    /**
     * Gets the value of the estado property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstado() {
        return estado;
    }

    /**
     * Sets the value of the estado property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstado(String value) {
        this.estado = value;
    }

    /**
     * Gets the value of the estadoCobranca property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstadoCobranca() {
        return estadoCobranca;
    }

    /**
     * Sets the value of the estadoCobranca property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstadoCobranca(String value) {
        this.estadoCobranca = value;
    }

    /**
     * Gets the value of the grauRisco property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getGrauRisco() {
        return grauRisco;
    }

    /**
     * Sets the value of the grauRisco property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setGrauRisco(Integer value) {
        this.grauRisco = value;
    }

    /**
     * Gets the value of the inscricaoEstadual property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInscricaoEstadual() {
        return inscricaoEstadual;
    }

    /**
     * Sets the value of the inscricaoEstadual property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInscricaoEstadual(String value) {
        this.inscricaoEstadual = value;
    }

    /**
     * Gets the value of the inscricaoMunicipal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInscricaoMunicipal() {
        return inscricaoMunicipal;
    }

    /**
     * Sets the value of the inscricaoMunicipal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInscricaoMunicipal(String value) {
        this.inscricaoMunicipal = value;
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
     * Gets the value of the numero property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumero() {
        return numero;
    }

    /**
     * Sets the value of the numero property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumero(String value) {
        this.numero = value;
    }

    /**
     * Gets the value of the numeroCobranca property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroCobranca() {
        return numeroCobranca;
    }

    /**
     * Sets the value of the numeroCobranca property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroCobranca(String value) {
        this.numeroCobranca = value;
    }

    /**
     * Gets the value of the observacaoASO property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObservacaoASO() {
        return observacaoASO;
    }

    /**
     * Sets the value of the observacaoASO property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObservacaoASO(String value) {
        this.observacaoASO = value;
    }

    /**
     * Gets the value of the observacaoContrato property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObservacaoContrato() {
        return observacaoContrato;
    }

    /**
     * Sets the value of the observacaoContrato property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObservacaoContrato(String value) {
        this.observacaoContrato = value;
    }

    /**
     * Gets the value of the observacaoPPP property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObservacaoPPP() {
        return observacaoPPP;
    }

    /**
     * Sets the value of the observacaoPPP property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObservacaoPPP(String value) {
        this.observacaoPPP = value;
    }

    /**
     * Gets the value of the percentualCalculoBrigada property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPercentualCalculoBrigada() {
        return percentualCalculoBrigada;
    }

    /**
     * Sets the value of the percentualCalculoBrigada property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPercentualCalculoBrigada(String value) {
        this.percentualCalculoBrigada = value;
    }

    /**
     * Gets the value of the razaoSocial property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRazaoSocial() {
        return razaoSocial;
    }

    /**
     * Sets the value of the razaoSocial property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRazaoSocial(String value) {
        this.razaoSocial = value;
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
     * Gets the value of the telefoneCat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelefoneCat() {
        return telefoneCat;
    }

    /**
     * Sets the value of the telefoneCat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelefoneCat(String value) {
        this.telefoneCat = value;
    }

    /**
     * Gets the value of the tipoBusca property.
     * 
     * @return
     *     possible object is
     *     {@link TipoBuscaUnidadeEnum }
     *     
     */
    public TipoBuscaUnidadeEnum getTipoBusca() {
        return tipoBusca;
    }

    /**
     * Sets the value of the tipoBusca property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoBuscaUnidadeEnum }
     *     
     */
    public void setTipoBusca(TipoBuscaUnidadeEnum value) {
        this.tipoBusca = value;
    }

    /**
     * Gets the value of the tipoCnae property.
     * 
     * @return
     *     possible object is
     *     {@link TipoCnae }
     *     
     */
    public TipoCnae getTipoCnae() {
        return tipoCnae;
    }

    /**
     * Sets the value of the tipoCnae property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoCnae }
     *     
     */
    public void setTipoCnae(TipoCnae value) {
        this.tipoCnae = value;
    }

}
