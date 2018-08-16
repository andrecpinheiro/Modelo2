
package webservices.modelo2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for retornoWsVo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="retornoWsVo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="atualizouCargo" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="atualizouCentroCusto" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="atualizouFuncionario" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="atualizouRegistro" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="atualizouSetor" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="atualizouUnidade" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="codigoEmpresa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigoFuncionario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descricaoErro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="encontrouCargo" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="encontrouCentroCusto" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="encontrouErro" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="encontrouFuncionario" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="encontrouRegistro" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="encontrouSetor" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="encontrouUnidade" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="incluiuCargo" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="incluiuCentroCusto" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="incluiuFuncionario" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="incluiuRegistro" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="incluiuSetor" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="incluiuUnidade" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="observacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="atualizouMotivoLicenca" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="atualizouTurno" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="encontrouUnidadeContratante" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="encontrouMotivoLicenca" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="encontrouTurno" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="incluiuUnidadeContratante" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="incluiuMotivoLicenca" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="incluiuTurno" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "retornoWsVo", propOrder = {
    "atualizouCargo",
    "atualizouCentroCusto",
    "atualizouFuncionario",
    "atualizouRegistro",
    "atualizouSetor",
    "atualizouUnidade",
    "codigoEmpresa",
    "codigoFuncionario",
    "descricaoErro",
    "encontrouCargo",
    "encontrouCentroCusto",
    "encontrouErro",
    "encontrouFuncionario",
    "encontrouRegistro",
    "encontrouSetor",
    "encontrouUnidade",
    "incluiuCargo",
    "incluiuCentroCusto",
    "incluiuFuncionario",
    "incluiuRegistro",
    "incluiuSetor",
    "incluiuUnidade",
    "observacao",
    "atualizouMotivoLicenca",
    "atualizouTurno",
    "encontrouUnidadeContratante",
    "encontrouMotivoLicenca",
    "encontrouTurno",
    "incluiuUnidadeContratante",
    "incluiuMotivoLicenca",
    "incluiuTurno"
})
public class RetornoWsVo {

    protected boolean atualizouCargo;
    protected boolean atualizouCentroCusto;
    protected boolean atualizouFuncionario;
    protected boolean atualizouRegistro;
    protected boolean atualizouSetor;
    protected boolean atualizouUnidade;
    protected String codigoEmpresa;
    protected String codigoFuncionario;
    protected String descricaoErro;
    protected boolean encontrouCargo;
    protected boolean encontrouCentroCusto;
    protected boolean encontrouErro;
    protected boolean encontrouFuncionario;
    protected boolean encontrouRegistro;
    protected boolean encontrouSetor;
    protected boolean encontrouUnidade;
    protected boolean incluiuCargo;
    protected boolean incluiuCentroCusto;
    protected boolean incluiuFuncionario;
    protected boolean incluiuRegistro;
    protected boolean incluiuSetor;
    protected boolean incluiuUnidade;
    protected String observacao;
    protected boolean atualizouMotivoLicenca;
    protected boolean atualizouTurno;
    protected boolean encontrouUnidadeContratante;
    protected boolean encontrouMotivoLicenca;
    protected boolean encontrouTurno;
    protected boolean incluiuUnidadeContratante;
    protected boolean incluiuMotivoLicenca;
    protected boolean incluiuTurno;

    /**
     * Gets the value of the atualizouCargo property.
     * 
     */
    public boolean isAtualizouCargo() {
        return atualizouCargo;
    }

    /**
     * Sets the value of the atualizouCargo property.
     * 
     */
    public void setAtualizouCargo(boolean value) {
        this.atualizouCargo = value;
    }

    /**
     * Gets the value of the atualizouCentroCusto property.
     * 
     */
    public boolean isAtualizouCentroCusto() {
        return atualizouCentroCusto;
    }

    /**
     * Sets the value of the atualizouCentroCusto property.
     * 
     */
    public void setAtualizouCentroCusto(boolean value) {
        this.atualizouCentroCusto = value;
    }

    /**
     * Gets the value of the atualizouFuncionario property.
     * 
     */
    public boolean isAtualizouFuncionario() {
        return atualizouFuncionario;
    }

    /**
     * Sets the value of the atualizouFuncionario property.
     * 
     */
    public void setAtualizouFuncionario(boolean value) {
        this.atualizouFuncionario = value;
    }

    /**
     * Gets the value of the atualizouRegistro property.
     * 
     */
    public boolean isAtualizouRegistro() {
        return atualizouRegistro;
    }

    /**
     * Sets the value of the atualizouRegistro property.
     * 
     */
    public void setAtualizouRegistro(boolean value) {
        this.atualizouRegistro = value;
    }

    /**
     * Gets the value of the atualizouSetor property.
     * 
     */
    public boolean isAtualizouSetor() {
        return atualizouSetor;
    }

    /**
     * Sets the value of the atualizouSetor property.
     * 
     */
    public void setAtualizouSetor(boolean value) {
        this.atualizouSetor = value;
    }

    /**
     * Gets the value of the atualizouUnidade property.
     * 
     */
    public boolean isAtualizouUnidade() {
        return atualizouUnidade;
    }

    /**
     * Sets the value of the atualizouUnidade property.
     * 
     */
    public void setAtualizouUnidade(boolean value) {
        this.atualizouUnidade = value;
    }

    /**
     * Gets the value of the codigoEmpresa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoEmpresa() {
        return codigoEmpresa;
    }

    /**
     * Sets the value of the codigoEmpresa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoEmpresa(String value) {
        this.codigoEmpresa = value;
    }

    /**
     * Gets the value of the codigoFuncionario property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoFuncionario() {
        return codigoFuncionario;
    }

    /**
     * Sets the value of the codigoFuncionario property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoFuncionario(String value) {
        this.codigoFuncionario = value;
    }

    /**
     * Gets the value of the descricaoErro property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescricaoErro() {
        return descricaoErro;
    }

    /**
     * Sets the value of the descricaoErro property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescricaoErro(String value) {
        this.descricaoErro = value;
    }

    /**
     * Gets the value of the encontrouCargo property.
     * 
     */
    public boolean isEncontrouCargo() {
        return encontrouCargo;
    }

    /**
     * Sets the value of the encontrouCargo property.
     * 
     */
    public void setEncontrouCargo(boolean value) {
        this.encontrouCargo = value;
    }

    /**
     * Gets the value of the encontrouCentroCusto property.
     * 
     */
    public boolean isEncontrouCentroCusto() {
        return encontrouCentroCusto;
    }

    /**
     * Sets the value of the encontrouCentroCusto property.
     * 
     */
    public void setEncontrouCentroCusto(boolean value) {
        this.encontrouCentroCusto = value;
    }

    /**
     * Gets the value of the encontrouErro property.
     * 
     */
    public boolean isEncontrouErro() {
        return encontrouErro;
    }

    /**
     * Sets the value of the encontrouErro property.
     * 
     */
    public void setEncontrouErro(boolean value) {
        this.encontrouErro = value;
    }

    /**
     * Gets the value of the encontrouFuncionario property.
     * 
     */
    public boolean isEncontrouFuncionario() {
        return encontrouFuncionario;
    }

    /**
     * Sets the value of the encontrouFuncionario property.
     * 
     */
    public void setEncontrouFuncionario(boolean value) {
        this.encontrouFuncionario = value;
    }

    /**
     * Gets the value of the encontrouRegistro property.
     * 
     */
    public boolean isEncontrouRegistro() {
        return encontrouRegistro;
    }

    /**
     * Sets the value of the encontrouRegistro property.
     * 
     */
    public void setEncontrouRegistro(boolean value) {
        this.encontrouRegistro = value;
    }

    /**
     * Gets the value of the encontrouSetor property.
     * 
     */
    public boolean isEncontrouSetor() {
        return encontrouSetor;
    }

    /**
     * Sets the value of the encontrouSetor property.
     * 
     */
    public void setEncontrouSetor(boolean value) {
        this.encontrouSetor = value;
    }

    /**
     * Gets the value of the encontrouUnidade property.
     * 
     */
    public boolean isEncontrouUnidade() {
        return encontrouUnidade;
    }

    /**
     * Sets the value of the encontrouUnidade property.
     * 
     */
    public void setEncontrouUnidade(boolean value) {
        this.encontrouUnidade = value;
    }

    /**
     * Gets the value of the incluiuCargo property.
     * 
     */
    public boolean isIncluiuCargo() {
        return incluiuCargo;
    }

    /**
     * Sets the value of the incluiuCargo property.
     * 
     */
    public void setIncluiuCargo(boolean value) {
        this.incluiuCargo = value;
    }

    /**
     * Gets the value of the incluiuCentroCusto property.
     * 
     */
    public boolean isIncluiuCentroCusto() {
        return incluiuCentroCusto;
    }

    /**
     * Sets the value of the incluiuCentroCusto property.
     * 
     */
    public void setIncluiuCentroCusto(boolean value) {
        this.incluiuCentroCusto = value;
    }

    /**
     * Gets the value of the incluiuFuncionario property.
     * 
     */
    public boolean isIncluiuFuncionario() {
        return incluiuFuncionario;
    }

    /**
     * Sets the value of the incluiuFuncionario property.
     * 
     */
    public void setIncluiuFuncionario(boolean value) {
        this.incluiuFuncionario = value;
    }

    /**
     * Gets the value of the incluiuRegistro property.
     * 
     */
    public boolean isIncluiuRegistro() {
        return incluiuRegistro;
    }

    /**
     * Sets the value of the incluiuRegistro property.
     * 
     */
    public void setIncluiuRegistro(boolean value) {
        this.incluiuRegistro = value;
    }

    /**
     * Gets the value of the incluiuSetor property.
     * 
     */
    public boolean isIncluiuSetor() {
        return incluiuSetor;
    }

    /**
     * Sets the value of the incluiuSetor property.
     * 
     */
    public void setIncluiuSetor(boolean value) {
        this.incluiuSetor = value;
    }

    /**
     * Gets the value of the incluiuUnidade property.
     * 
     */
    public boolean isIncluiuUnidade() {
        return incluiuUnidade;
    }

    /**
     * Sets the value of the incluiuUnidade property.
     * 
     */
    public void setIncluiuUnidade(boolean value) {
        this.incluiuUnidade = value;
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
     * Gets the value of the atualizouMotivoLicenca property.
     * 
     */
    public boolean isAtualizouMotivoLicenca() {
        return atualizouMotivoLicenca;
    }

    /**
     * Sets the value of the atualizouMotivoLicenca property.
     * 
     */
    public void setAtualizouMotivoLicenca(boolean value) {
        this.atualizouMotivoLicenca = value;
    }

    /**
     * Gets the value of the atualizouTurno property.
     * 
     */
    public boolean isAtualizouTurno() {
        return atualizouTurno;
    }

    /**
     * Sets the value of the atualizouTurno property.
     * 
     */
    public void setAtualizouTurno(boolean value) {
        this.atualizouTurno = value;
    }

    /**
     * Gets the value of the encontrouUnidadeContratante property.
     * 
     */
    public boolean isEncontrouUnidadeContratante() {
        return encontrouUnidadeContratante;
    }

    /**
     * Sets the value of the encontrouUnidadeContratante property.
     * 
     */
    public void setEncontrouUnidadeContratante(boolean value) {
        this.encontrouUnidadeContratante = value;
    }

    /**
     * Gets the value of the encontrouMotivoLicenca property.
     * 
     */
    public boolean isEncontrouMotivoLicenca() {
        return encontrouMotivoLicenca;
    }

    /**
     * Sets the value of the encontrouMotivoLicenca property.
     * 
     */
    public void setEncontrouMotivoLicenca(boolean value) {
        this.encontrouMotivoLicenca = value;
    }

    /**
     * Gets the value of the encontrouTurno property.
     * 
     */
    public boolean isEncontrouTurno() {
        return encontrouTurno;
    }

    /**
     * Sets the value of the encontrouTurno property.
     * 
     */
    public void setEncontrouTurno(boolean value) {
        this.encontrouTurno = value;
    }

    /**
     * Gets the value of the incluiuUnidadeContratante property.
     * 
     */
    public boolean isIncluiuUnidadeContratante() {
        return incluiuUnidadeContratante;
    }

    /**
     * Sets the value of the incluiuUnidadeContratante property.
     * 
     */
    public void setIncluiuUnidadeContratante(boolean value) {
        this.incluiuUnidadeContratante = value;
    }

    /**
     * Gets the value of the incluiuMotivoLicenca property.
     * 
     */
    public boolean isIncluiuMotivoLicenca() {
        return incluiuMotivoLicenca;
    }

    /**
     * Sets the value of the incluiuMotivoLicenca property.
     * 
     */
    public void setIncluiuMotivoLicenca(boolean value) {
        this.incluiuMotivoLicenca = value;
    }

    /**
     * Gets the value of the incluiuTurno property.
     * 
     */
    public boolean isIncluiuTurno() {
        return incluiuTurno;
    }

    /**
     * Sets the value of the incluiuTurno property.
     * 
     */
    public void setIncluiuTurno(boolean value) {
        this.incluiuTurno = value;
    }

}
