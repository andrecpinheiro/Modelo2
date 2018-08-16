
package webservices.modelo2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for funcionarioModelo2WsVo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="funcionarioModelo2WsVo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="atualizarCargo" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="atualizarCentroCusto" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="atualizarFuncionario" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="atualizarMotivoLicenca" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="atualizarSetor" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="atualizarTurno" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="atualizarUnidade" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="cargoWsVo" type="{http://services.soc.age.com/}funcionarioCargoWsVo" minOccurs="0"/>
 *         &lt;element name="centroCustoWsVo" type="{http://services.soc.age.com/}funcionarioCentroCustoWsVo" minOccurs="0"/>
 *         &lt;element name="criarCargo" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="criarCentroCusto" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="criarFuncionario" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="criarHistorico" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="criarMotivoLicenca" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="criarSetor" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="criarTurno" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="criarUnidade" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="criarUnidadeContratante" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="deficienciaWsVo" type="{http://services.soc.age.com/}funcionarioDeficienciaWsVo" minOccurs="0"/>
 *         &lt;element name="destravarFuncionarioBloqueado" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="funcionarioWsVo" type="{http://services.soc.age.com/}funcionarioWsVo" minOccurs="0"/>
 *         &lt;element name="identificacaoWsVo" type="{http://services.soc.age.com/}identificacaoUsuarioWsVo" minOccurs="0"/>
 *         &lt;element name="motivoLicencaWsVo" type="{http://services.soc.age.com/}funcionarioMotivoLicencaWsVo" minOccurs="0"/>
 *         &lt;element name="naoImportarFuncionarioSemHierarquia" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="setorWsVo" type="{http://services.soc.age.com/}funcionarioSetorWsVo" minOccurs="0"/>
 *         &lt;element name="turnoWsVo" type="{http://services.soc.age.com/}funcionarioTurnoWsVo" minOccurs="0"/>
 *         &lt;element name="unidadeContratanteWsVo" type="{http://services.soc.age.com/}funcionarioUnidadeWsVo" minOccurs="0"/>
 *         &lt;element name="unidadeWsVo" type="{http://services.soc.age.com/}funcionarioUnidadeWsVo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "funcionarioModelo2WsVo", propOrder = {
    "atualizarCargo",
    "atualizarCentroCusto",
    "atualizarFuncionario",
    "atualizarMotivoLicenca",
    "atualizarSetor",
    "atualizarTurno",
    "atualizarUnidade",
    "cargoWsVo",
    "centroCustoWsVo",
    "criarCargo",
    "criarCentroCusto",
    "criarFuncionario",
    "criarHistorico",
    "criarMotivoLicenca",
    "criarSetor",
    "criarTurno",
    "criarUnidade",
    "criarUnidadeContratante",
    "deficienciaWsVo",
    "destravarFuncionarioBloqueado",
    "funcionarioWsVo",
    "identificacaoWsVo",
    "motivoLicencaWsVo",
    "naoImportarFuncionarioSemHierarquia",
    "setorWsVo",
    "turnoWsVo",
    "unidadeContratanteWsVo",
    "unidadeWsVo"
})
public class FuncionarioModelo2WsVo {

    protected boolean atualizarCargo;
    protected boolean atualizarCentroCusto;
    protected boolean atualizarFuncionario;
    protected boolean atualizarMotivoLicenca;
    protected boolean atualizarSetor;
    protected boolean atualizarTurno;
    protected boolean atualizarUnidade;
    protected FuncionarioCargoWsVo cargoWsVo;
    protected FuncionarioCentroCustoWsVo centroCustoWsVo;
    protected boolean criarCargo;
    protected boolean criarCentroCusto;
    protected boolean criarFuncionario;
    protected boolean criarHistorico;
    protected boolean criarMotivoLicenca;
    protected boolean criarSetor;
    protected boolean criarTurno;
    protected boolean criarUnidade;
    protected boolean criarUnidadeContratante;
    protected FuncionarioDeficienciaWsVo deficienciaWsVo;
    protected boolean destravarFuncionarioBloqueado;
    protected FuncionarioWsVo funcionarioWsVo;
    protected IdentificacaoUsuarioWsVo identificacaoWsVo;
    protected FuncionarioMotivoLicencaWsVo motivoLicencaWsVo;
    protected boolean naoImportarFuncionarioSemHierarquia;
    protected FuncionarioSetorWsVo setorWsVo;
    protected FuncionarioTurnoWsVo turnoWsVo;
    protected FuncionarioUnidadeWsVo unidadeContratanteWsVo;
    protected FuncionarioUnidadeWsVo unidadeWsVo;

    /**
     * Gets the value of the atualizarCargo property.
     * 
     */
    public boolean isAtualizarCargo() {
        return atualizarCargo;
    }

    /**
     * Sets the value of the atualizarCargo property.
     * 
     */
    public void setAtualizarCargo(boolean value) {
        this.atualizarCargo = value;
    }

    /**
     * Gets the value of the atualizarCentroCusto property.
     * 
     */
    public boolean isAtualizarCentroCusto() {
        return atualizarCentroCusto;
    }

    /**
     * Sets the value of the atualizarCentroCusto property.
     * 
     */
    public void setAtualizarCentroCusto(boolean value) {
        this.atualizarCentroCusto = value;
    }

    /**
     * Gets the value of the atualizarFuncionario property.
     * 
     */
    public boolean isAtualizarFuncionario() {
        return atualizarFuncionario;
    }

    /**
     * Sets the value of the atualizarFuncionario property.
     * 
     */
    public void setAtualizarFuncionario(boolean value) {
        this.atualizarFuncionario = value;
    }

    /**
     * Gets the value of the atualizarMotivoLicenca property.
     * 
     */
    public boolean isAtualizarMotivoLicenca() {
        return atualizarMotivoLicenca;
    }

    /**
     * Sets the value of the atualizarMotivoLicenca property.
     * 
     */
    public void setAtualizarMotivoLicenca(boolean value) {
        this.atualizarMotivoLicenca = value;
    }

    /**
     * Gets the value of the atualizarSetor property.
     * 
     */
    public boolean isAtualizarSetor() {
        return atualizarSetor;
    }

    /**
     * Sets the value of the atualizarSetor property.
     * 
     */
    public void setAtualizarSetor(boolean value) {
        this.atualizarSetor = value;
    }

    /**
     * Gets the value of the atualizarTurno property.
     * 
     */
    public boolean isAtualizarTurno() {
        return atualizarTurno;
    }

    /**
     * Sets the value of the atualizarTurno property.
     * 
     */
    public void setAtualizarTurno(boolean value) {
        this.atualizarTurno = value;
    }

    /**
     * Gets the value of the atualizarUnidade property.
     * 
     */
    public boolean isAtualizarUnidade() {
        return atualizarUnidade;
    }

    /**
     * Sets the value of the atualizarUnidade property.
     * 
     */
    public void setAtualizarUnidade(boolean value) {
        this.atualizarUnidade = value;
    }

    /**
     * Gets the value of the cargoWsVo property.
     * 
     * @return
     *     possible object is
     *     {@link FuncionarioCargoWsVo }
     *     
     */
    public FuncionarioCargoWsVo getCargoWsVo() {
        return cargoWsVo;
    }

    /**
     * Sets the value of the cargoWsVo property.
     * 
     * @param value
     *     allowed object is
     *     {@link FuncionarioCargoWsVo }
     *     
     */
    public void setCargoWsVo(FuncionarioCargoWsVo value) {
        this.cargoWsVo = value;
    }

    /**
     * Gets the value of the centroCustoWsVo property.
     * 
     * @return
     *     possible object is
     *     {@link FuncionarioCentroCustoWsVo }
     *     
     */
    public FuncionarioCentroCustoWsVo getCentroCustoWsVo() {
        return centroCustoWsVo;
    }

    /**
     * Sets the value of the centroCustoWsVo property.
     * 
     * @param value
     *     allowed object is
     *     {@link FuncionarioCentroCustoWsVo }
     *     
     */
    public void setCentroCustoWsVo(FuncionarioCentroCustoWsVo value) {
        this.centroCustoWsVo = value;
    }

    /**
     * Gets the value of the criarCargo property.
     * 
     */
    public boolean isCriarCargo() {
        return criarCargo;
    }

    /**
     * Sets the value of the criarCargo property.
     * 
     */
    public void setCriarCargo(boolean value) {
        this.criarCargo = value;
    }

    /**
     * Gets the value of the criarCentroCusto property.
     * 
     */
    public boolean isCriarCentroCusto() {
        return criarCentroCusto;
    }

    /**
     * Sets the value of the criarCentroCusto property.
     * 
     */
    public void setCriarCentroCusto(boolean value) {
        this.criarCentroCusto = value;
    }

    /**
     * Gets the value of the criarFuncionario property.
     * 
     */
    public boolean isCriarFuncionario() {
        return criarFuncionario;
    }

    /**
     * Sets the value of the criarFuncionario property.
     * 
     */
    public void setCriarFuncionario(boolean value) {
        this.criarFuncionario = value;
    }

    /**
     * Gets the value of the criarHistorico property.
     * 
     */
    public boolean isCriarHistorico() {
        return criarHistorico;
    }

    /**
     * Sets the value of the criarHistorico property.
     * 
     */
    public void setCriarHistorico(boolean value) {
        this.criarHistorico = value;
    }

    /**
     * Gets the value of the criarMotivoLicenca property.
     * 
     */
    public boolean isCriarMotivoLicenca() {
        return criarMotivoLicenca;
    }

    /**
     * Sets the value of the criarMotivoLicenca property.
     * 
     */
    public void setCriarMotivoLicenca(boolean value) {
        this.criarMotivoLicenca = value;
    }

    /**
     * Gets the value of the criarSetor property.
     * 
     */
    public boolean isCriarSetor() {
        return criarSetor;
    }

    /**
     * Sets the value of the criarSetor property.
     * 
     */
    public void setCriarSetor(boolean value) {
        this.criarSetor = value;
    }

    /**
     * Gets the value of the criarTurno property.
     * 
     */
    public boolean isCriarTurno() {
        return criarTurno;
    }

    /**
     * Sets the value of the criarTurno property.
     * 
     */
    public void setCriarTurno(boolean value) {
        this.criarTurno = value;
    }

    /**
     * Gets the value of the criarUnidade property.
     * 
     */
    public boolean isCriarUnidade() {
        return criarUnidade;
    }

    /**
     * Sets the value of the criarUnidade property.
     * 
     */
    public void setCriarUnidade(boolean value) {
        this.criarUnidade = value;
    }

    /**
     * Gets the value of the criarUnidadeContratante property.
     * 
     */
    public boolean isCriarUnidadeContratante() {
        return criarUnidadeContratante;
    }

    /**
     * Sets the value of the criarUnidadeContratante property.
     * 
     */
    public void setCriarUnidadeContratante(boolean value) {
        this.criarUnidadeContratante = value;
    }

    /**
     * Gets the value of the deficienciaWsVo property.
     * 
     * @return
     *     possible object is
     *     {@link FuncionarioDeficienciaWsVo }
     *     
     */
    public FuncionarioDeficienciaWsVo getDeficienciaWsVo() {
        return deficienciaWsVo;
    }

    /**
     * Sets the value of the deficienciaWsVo property.
     * 
     * @param value
     *     allowed object is
     *     {@link FuncionarioDeficienciaWsVo }
     *     
     */
    public void setDeficienciaWsVo(FuncionarioDeficienciaWsVo value) {
        this.deficienciaWsVo = value;
    }

    /**
     * Gets the value of the destravarFuncionarioBloqueado property.
     * 
     */
    public boolean isDestravarFuncionarioBloqueado() {
        return destravarFuncionarioBloqueado;
    }

    /**
     * Sets the value of the destravarFuncionarioBloqueado property.
     * 
     */
    public void setDestravarFuncionarioBloqueado(boolean value) {
        this.destravarFuncionarioBloqueado = value;
    }

    /**
     * Gets the value of the funcionarioWsVo property.
     * 
     * @return
     *     possible object is
     *     {@link FuncionarioWsVo }
     *     
     */
    public FuncionarioWsVo getFuncionarioWsVo() {
        return funcionarioWsVo;
    }

    /**
     * Sets the value of the funcionarioWsVo property.
     * 
     * @param value
     *     allowed object is
     *     {@link FuncionarioWsVo }
     *     
     */
    public void setFuncionarioWsVo(FuncionarioWsVo value) {
        this.funcionarioWsVo = value;
    }

    /**
     * Gets the value of the identificacaoWsVo property.
     * 
     * @return
     *     possible object is
     *     {@link IdentificacaoUsuarioWsVo }
     *     
     */
    public IdentificacaoUsuarioWsVo getIdentificacaoWsVo() {
        return identificacaoWsVo;
    }

    /**
     * Sets the value of the identificacaoWsVo property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentificacaoUsuarioWsVo }
     *     
     */
    public void setIdentificacaoWsVo(IdentificacaoUsuarioWsVo value) {
        this.identificacaoWsVo = value;
    }

    /**
     * Gets the value of the motivoLicencaWsVo property.
     * 
     * @return
     *     possible object is
     *     {@link FuncionarioMotivoLicencaWsVo }
     *     
     */
    public FuncionarioMotivoLicencaWsVo getMotivoLicencaWsVo() {
        return motivoLicencaWsVo;
    }

    /**
     * Sets the value of the motivoLicencaWsVo property.
     * 
     * @param value
     *     allowed object is
     *     {@link FuncionarioMotivoLicencaWsVo }
     *     
     */
    public void setMotivoLicencaWsVo(FuncionarioMotivoLicencaWsVo value) {
        this.motivoLicencaWsVo = value;
    }

    /**
     * Gets the value of the naoImportarFuncionarioSemHierarquia property.
     * 
     */
    public boolean isNaoImportarFuncionarioSemHierarquia() {
        return naoImportarFuncionarioSemHierarquia;
    }

    /**
     * Sets the value of the naoImportarFuncionarioSemHierarquia property.
     * 
     */
    public void setNaoImportarFuncionarioSemHierarquia(boolean value) {
        this.naoImportarFuncionarioSemHierarquia = value;
    }

    /**
     * Gets the value of the setorWsVo property.
     * 
     * @return
     *     possible object is
     *     {@link FuncionarioSetorWsVo }
     *     
     */
    public FuncionarioSetorWsVo getSetorWsVo() {
        return setorWsVo;
    }

    /**
     * Sets the value of the setorWsVo property.
     * 
     * @param value
     *     allowed object is
     *     {@link FuncionarioSetorWsVo }
     *     
     */
    public void setSetorWsVo(FuncionarioSetorWsVo value) {
        this.setorWsVo = value;
    }

    /**
     * Gets the value of the turnoWsVo property.
     * 
     * @return
     *     possible object is
     *     {@link FuncionarioTurnoWsVo }
     *     
     */
    public FuncionarioTurnoWsVo getTurnoWsVo() {
        return turnoWsVo;
    }

    /**
     * Sets the value of the turnoWsVo property.
     * 
     * @param value
     *     allowed object is
     *     {@link FuncionarioTurnoWsVo }
     *     
     */
    public void setTurnoWsVo(FuncionarioTurnoWsVo value) {
        this.turnoWsVo = value;
    }

    /**
     * Gets the value of the unidadeContratanteWsVo property.
     * 
     * @return
     *     possible object is
     *     {@link FuncionarioUnidadeWsVo }
     *     
     */
    public FuncionarioUnidadeWsVo getUnidadeContratanteWsVo() {
        return unidadeContratanteWsVo;
    }

    /**
     * Sets the value of the unidadeContratanteWsVo property.
     * 
     * @param value
     *     allowed object is
     *     {@link FuncionarioUnidadeWsVo }
     *     
     */
    public void setUnidadeContratanteWsVo(FuncionarioUnidadeWsVo value) {
        this.unidadeContratanteWsVo = value;
    }

    /**
     * Gets the value of the unidadeWsVo property.
     * 
     * @return
     *     possible object is
     *     {@link FuncionarioUnidadeWsVo }
     *     
     */
    public FuncionarioUnidadeWsVo getUnidadeWsVo() {
        return unidadeWsVo;
    }

    /**
     * Sets the value of the unidadeWsVo property.
     * 
     * @param value
     *     allowed object is
     *     {@link FuncionarioUnidadeWsVo }
     *     
     */
    public void setUnidadeWsVo(FuncionarioUnidadeWsVo value) {
        this.unidadeWsVo = value;
    }

}
