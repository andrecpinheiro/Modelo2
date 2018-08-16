
package webservices.modelo2;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for funcionarioWsVo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="funcionarioWsVo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="autorizadoMensagemSms" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="bairro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="campoInteiro01" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="campoInteiro02" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="campoInteiro03" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="campoInteiro04" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="campoInteiro05" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="campoInteiro06" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="campoInteiro07" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="campoInteiro08" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="campoInteiro09" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="campoInteiro10" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="campoString01" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="campoString02" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="campoString03" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="campoString04" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="campoString05" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="campoString06" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="campoString07" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="campoString08" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="campoString09" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="campoString10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="campoString11" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="campoString12" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="campoString13" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="campoString14" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="campoString15" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="campoString16" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="campoString17" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="campoString18" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="campoString19" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="campoString20" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="campoString21" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="campoString22" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="campoString23" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="campoString24" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="campoString25" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="campoString26" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="campoString27" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="campoString28" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="campoString29" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="campoString30" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="carteiraNacionalSaude" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="categoria" type="{http://services.soc.age.com/}tipoCategoriaEnum" minOccurs="0"/>
 *         &lt;element name="cep" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="chaveProcuraFuncionario" type="{http://services.soc.age.com/}chaveProcura" minOccurs="0"/>
 *         &lt;element name="cidade" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cipa" type="{http://services.soc.age.com/}tipoCipaEnum" minOccurs="0"/>
 *         &lt;element name="cipaDataFimMandato" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cipaDataInicioMandato" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cnpjEmpresaFuncionario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigoEmpresa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigoMunicipio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="complementoEndereco" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contatoEmergencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cor" type="{http://services.soc.age.com/}corEnum" minOccurs="0"/>
 *         &lt;element name="cpf" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dataAdmissao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dataAfastamento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dataDemissao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dataDemissionalCarta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dataEmissaoCtps" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dataFinalEstabilidade" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dataNascimento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dataUltimaMovimentacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="desabilitarRisco" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="descricaoAtividade" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="endereco" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="enderecoEmergencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="escolaridade" type="{http://services.soc.age.com/}tipoEscolaridadeEnum" minOccurs="0"/>
 *         &lt;element name="estado" type="{http://services.soc.age.com/}estadosEnum" minOccurs="0"/>
 *         &lt;element name="estadoCivil" type="{http://services.soc.age.com/}estadoCivilEnum" minOccurs="0"/>
 *         &lt;element name="funcao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="funcaoBrigadaIncendio" type="{http://services.soc.age.com/}tipoFuncaoBrigadaEnum" minOccurs="0"/>
 *         &lt;element name="gfip" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="historicoPPP" type="{http://services.soc.age.com/}historicoPPP" minOccurs="0"/>
 *         &lt;element name="matricula" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="naoPossuiCpf" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="naoPossuiCtps" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="naoPossuiMatricula" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="naoPossuiPis" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="naturalidade" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nomeCooperativa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nomeFuncionario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nomeMae" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nrCtps" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numeroEndereco" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="observacaoAso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="observacaoEstabilidade" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="observacaoPpp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="parentescoContatoEmergencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pis" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ramal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ramalTelefoneEmergencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="razaoSocialEmpresaFuncionario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="regimeRevezamento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="regimeTrabalho" type="{http://services.soc.age.com/}regimeTrabalhoEnum" minOccurs="0"/>
 *         &lt;element name="remuneracaoMensal" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="requisitosFuncao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rgDataEmissao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rgOrgaoEmissor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rgUf" type="{http://services.soc.age.com/}estadosEnum" minOccurs="0"/>
 *         &lt;element name="serieCtps" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sexo" type="{http://services.soc.age.com/}sexoEnum" minOccurs="0"/>
 *         &lt;element name="situacao" type="{http://services.soc.age.com/}situacaoFuncionario" minOccurs="0"/>
 *         &lt;element name="telefoneCelular" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="telefoneComercial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="telefoneEmergencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="telefoneResidencial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="telefoneSms" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoBuscaEmpresa" type="{http://services.soc.age.com/}tipoBuscaEmpresaEnum" minOccurs="0"/>
 *         &lt;element name="tipoContratacao" type="{http://services.soc.age.com/}tipoContratacaoEnum" minOccurs="0"/>
 *         &lt;element name="ufCtps" type="{http://services.soc.age.com/}estadosEnum" minOccurs="0"/>
 *         &lt;element name="utilizarDescricaoRequisitoCargo" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="observacaoFuncionario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "funcionarioWsVo", propOrder = {
    "autorizadoMensagemSms",
    "bairro",
    "campoInteiro01",
    "campoInteiro02",
    "campoInteiro03",
    "campoInteiro04",
    "campoInteiro05",
    "campoInteiro06",
    "campoInteiro07",
    "campoInteiro08",
    "campoInteiro09",
    "campoInteiro10",
    "campoString01",
    "campoString02",
    "campoString03",
    "campoString04",
    "campoString05",
    "campoString06",
    "campoString07",
    "campoString08",
    "campoString09",
    "campoString10",
    "campoString11",
    "campoString12",
    "campoString13",
    "campoString14",
    "campoString15",
    "campoString16",
    "campoString17",
    "campoString18",
    "campoString19",
    "campoString20",
    "campoString21",
    "campoString22",
    "campoString23",
    "campoString24",
    "campoString25",
    "campoString26",
    "campoString27",
    "campoString28",
    "campoString29",
    "campoString30",
    "carteiraNacionalSaude",
    "categoria",
    "cep",
    "chaveProcuraFuncionario",
    "cidade",
    "cipa",
    "cipaDataFimMandato",
    "cipaDataInicioMandato",
    "cnpjEmpresaFuncionario",
    "codigo",
    "codigoEmpresa",
    "codigoMunicipio",
    "complementoEndereco",
    "contatoEmergencia",
    "cor",
    "cpf",
    "dataAdmissao",
    "dataAfastamento",
    "dataDemissao",
    "dataDemissionalCarta",
    "dataEmissaoCtps",
    "dataFinalEstabilidade",
    "dataNascimento",
    "dataUltimaMovimentacao",
    "desabilitarRisco",
    "descricaoAtividade",
    "email",
    "endereco",
    "enderecoEmergencia",
    "escolaridade",
    "estado",
    "estadoCivil",
    "funcao",
    "funcaoBrigadaIncendio",
    "gfip",
    "historicoPPP",
    "matricula",
    "naoPossuiCpf",
    "naoPossuiCtps",
    "naoPossuiMatricula",
    "naoPossuiPis",
    "naturalidade",
    "nomeCooperativa",
    "nomeFuncionario",
    "nomeMae",
    "nrCtps",
    "numeroEndereco",
    "observacaoAso",
    "observacaoEstabilidade",
    "observacaoPpp",
    "parentescoContatoEmergencia",
    "pis",
    "ramal",
    "ramalTelefoneEmergencia",
    "razaoSocialEmpresaFuncionario",
    "regimeRevezamento",
    "regimeTrabalho",
    "remuneracaoMensal",
    "requisitosFuncao",
    "rg",
    "rgDataEmissao",
    "rgOrgaoEmissor",
    "rgUf",
    "serieCtps",
    "sexo",
    "situacao",
    "telefoneCelular",
    "telefoneComercial",
    "telefoneEmergencia",
    "telefoneResidencial",
    "telefoneSms",
    "tipoBuscaEmpresa",
    "tipoContratacao",
    "ufCtps",
    "utilizarDescricaoRequisitoCargo",
    "observacaoFuncionario"
})
public class FuncionarioWsVo {

    protected Boolean autorizadoMensagemSms;
    protected String bairro;
    protected int campoInteiro01;
    protected int campoInteiro02;
    protected int campoInteiro03;
    protected int campoInteiro04;
    protected int campoInteiro05;
    protected int campoInteiro06;
    protected int campoInteiro07;
    protected int campoInteiro08;
    protected int campoInteiro09;
    protected int campoInteiro10;
    protected String campoString01;
    protected String campoString02;
    protected String campoString03;
    protected String campoString04;
    protected String campoString05;
    protected String campoString06;
    protected String campoString07;
    protected String campoString08;
    protected String campoString09;
    protected String campoString10;
    protected String campoString11;
    protected String campoString12;
    protected String campoString13;
    protected String campoString14;
    protected String campoString15;
    protected String campoString16;
    protected String campoString17;
    protected String campoString18;
    protected String campoString19;
    protected String campoString20;
    protected String campoString21;
    protected String campoString22;
    protected String campoString23;
    protected String campoString24;
    protected String campoString25;
    protected String campoString26;
    protected String campoString27;
    protected String campoString28;
    protected String campoString29;
    protected String campoString30;
    protected String carteiraNacionalSaude;
    protected TipoCategoriaEnum categoria;
    protected String cep;
    protected ChaveProcura chaveProcuraFuncionario;
    protected String cidade;
    protected TipoCipaEnum cipa;
    protected String cipaDataFimMandato;
    protected String cipaDataInicioMandato;
    protected String cnpjEmpresaFuncionario;
    protected String codigo;
    protected String codigoEmpresa;
    protected String codigoMunicipio;
    protected String complementoEndereco;
    protected String contatoEmergencia;
    protected CorEnum cor;
    protected String cpf;
    protected String dataAdmissao;
    protected String dataAfastamento;
    protected String dataDemissao;
    protected String dataDemissionalCarta;
    protected String dataEmissaoCtps;
    protected String dataFinalEstabilidade;
    protected String dataNascimento;
    protected String dataUltimaMovimentacao;
    protected Boolean desabilitarRisco;
    protected String descricaoAtividade;
    protected String email;
    protected String endereco;
    protected String enderecoEmergencia;
    protected TipoEscolaridadeEnum escolaridade;
    protected EstadosEnum estado;
    protected EstadoCivilEnum estadoCivil;
    protected String funcao;
    protected TipoFuncaoBrigadaEnum funcaoBrigadaIncendio;
    protected Integer gfip;
    protected HistoricoPPP historicoPPP;
    protected String matricula;
    protected Boolean naoPossuiCpf;
    protected Boolean naoPossuiCtps;
    protected Boolean naoPossuiMatricula;
    protected Boolean naoPossuiPis;
    protected String naturalidade;
    protected String nomeCooperativa;
    protected String nomeFuncionario;
    protected String nomeMae;
    protected String nrCtps;
    protected String numeroEndereco;
    protected String observacaoAso;
    protected String observacaoEstabilidade;
    protected String observacaoPpp;
    protected String parentescoContatoEmergencia;
    protected String pis;
    protected String ramal;
    protected String ramalTelefoneEmergencia;
    protected String razaoSocialEmpresaFuncionario;
    protected String regimeRevezamento;
    protected RegimeTrabalhoEnum regimeTrabalho;
    protected BigDecimal remuneracaoMensal;
    protected String requisitosFuncao;
    protected String rg;
    protected String rgDataEmissao;
    protected String rgOrgaoEmissor;
    protected EstadosEnum rgUf;
    protected String serieCtps;
    protected SexoEnum sexo;
    protected SituacaoFuncionario situacao;
    protected String telefoneCelular;
    protected String telefoneComercial;
    protected String telefoneEmergencia;
    protected String telefoneResidencial;
    protected String telefoneSms;
    protected TipoBuscaEmpresaEnum tipoBuscaEmpresa;
    protected TipoContratacaoEnum tipoContratacao;
    protected EstadosEnum ufCtps;
    protected Boolean utilizarDescricaoRequisitoCargo;
    protected String observacaoFuncionario;

    /**
     * Gets the value of the autorizadoMensagemSms property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAutorizadoMensagemSms() {
        return autorizadoMensagemSms;
    }

    /**
     * Sets the value of the autorizadoMensagemSms property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAutorizadoMensagemSms(Boolean value) {
        this.autorizadoMensagemSms = value;
    }

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
     * Gets the value of the campoInteiro01 property.
     * 
     */
    public int getCampoInteiro01() {
        return campoInteiro01;
    }

    /**
     * Sets the value of the campoInteiro01 property.
     * 
     */
    public void setCampoInteiro01(int value) {
        this.campoInteiro01 = value;
    }

    /**
     * Gets the value of the campoInteiro02 property.
     * 
     */
    public int getCampoInteiro02() {
        return campoInteiro02;
    }

    /**
     * Sets the value of the campoInteiro02 property.
     * 
     */
    public void setCampoInteiro02(int value) {
        this.campoInteiro02 = value;
    }

    /**
     * Gets the value of the campoInteiro03 property.
     * 
     */
    public int getCampoInteiro03() {
        return campoInteiro03;
    }

    /**
     * Sets the value of the campoInteiro03 property.
     * 
     */
    public void setCampoInteiro03(int value) {
        this.campoInteiro03 = value;
    }

    /**
     * Gets the value of the campoInteiro04 property.
     * 
     */
    public int getCampoInteiro04() {
        return campoInteiro04;
    }

    /**
     * Sets the value of the campoInteiro04 property.
     * 
     */
    public void setCampoInteiro04(int value) {
        this.campoInteiro04 = value;
    }

    /**
     * Gets the value of the campoInteiro05 property.
     * 
     */
    public int getCampoInteiro05() {
        return campoInteiro05;
    }

    /**
     * Sets the value of the campoInteiro05 property.
     * 
     */
    public void setCampoInteiro05(int value) {
        this.campoInteiro05 = value;
    }

    /**
     * Gets the value of the campoInteiro06 property.
     * 
     */
    public int getCampoInteiro06() {
        return campoInteiro06;
    }

    /**
     * Sets the value of the campoInteiro06 property.
     * 
     */
    public void setCampoInteiro06(int value) {
        this.campoInteiro06 = value;
    }

    /**
     * Gets the value of the campoInteiro07 property.
     * 
     */
    public int getCampoInteiro07() {
        return campoInteiro07;
    }

    /**
     * Sets the value of the campoInteiro07 property.
     * 
     */
    public void setCampoInteiro07(int value) {
        this.campoInteiro07 = value;
    }

    /**
     * Gets the value of the campoInteiro08 property.
     * 
     */
    public int getCampoInteiro08() {
        return campoInteiro08;
    }

    /**
     * Sets the value of the campoInteiro08 property.
     * 
     */
    public void setCampoInteiro08(int value) {
        this.campoInteiro08 = value;
    }

    /**
     * Gets the value of the campoInteiro09 property.
     * 
     */
    public int getCampoInteiro09() {
        return campoInteiro09;
    }

    /**
     * Sets the value of the campoInteiro09 property.
     * 
     */
    public void setCampoInteiro09(int value) {
        this.campoInteiro09 = value;
    }

    /**
     * Gets the value of the campoInteiro10 property.
     * 
     */
    public int getCampoInteiro10() {
        return campoInteiro10;
    }

    /**
     * Sets the value of the campoInteiro10 property.
     * 
     */
    public void setCampoInteiro10(int value) {
        this.campoInteiro10 = value;
    }

    /**
     * Gets the value of the campoString01 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCampoString01() {
        return campoString01;
    }

    /**
     * Sets the value of the campoString01 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCampoString01(String value) {
        this.campoString01 = value;
    }

    /**
     * Gets the value of the campoString02 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCampoString02() {
        return campoString02;
    }

    /**
     * Sets the value of the campoString02 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCampoString02(String value) {
        this.campoString02 = value;
    }

    /**
     * Gets the value of the campoString03 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCampoString03() {
        return campoString03;
    }

    /**
     * Sets the value of the campoString03 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCampoString03(String value) {
        this.campoString03 = value;
    }

    /**
     * Gets the value of the campoString04 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCampoString04() {
        return campoString04;
    }

    /**
     * Sets the value of the campoString04 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCampoString04(String value) {
        this.campoString04 = value;
    }

    /**
     * Gets the value of the campoString05 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCampoString05() {
        return campoString05;
    }

    /**
     * Sets the value of the campoString05 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCampoString05(String value) {
        this.campoString05 = value;
    }

    /**
     * Gets the value of the campoString06 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCampoString06() {
        return campoString06;
    }

    /**
     * Sets the value of the campoString06 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCampoString06(String value) {
        this.campoString06 = value;
    }

    /**
     * Gets the value of the campoString07 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCampoString07() {
        return campoString07;
    }

    /**
     * Sets the value of the campoString07 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCampoString07(String value) {
        this.campoString07 = value;
    }

    /**
     * Gets the value of the campoString08 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCampoString08() {
        return campoString08;
    }

    /**
     * Sets the value of the campoString08 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCampoString08(String value) {
        this.campoString08 = value;
    }

    /**
     * Gets the value of the campoString09 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCampoString09() {
        return campoString09;
    }

    /**
     * Sets the value of the campoString09 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCampoString09(String value) {
        this.campoString09 = value;
    }

    /**
     * Gets the value of the campoString10 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCampoString10() {
        return campoString10;
    }

    /**
     * Sets the value of the campoString10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCampoString10(String value) {
        this.campoString10 = value;
    }

    /**
     * Gets the value of the campoString11 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCampoString11() {
        return campoString11;
    }

    /**
     * Sets the value of the campoString11 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCampoString11(String value) {
        this.campoString11 = value;
    }

    /**
     * Gets the value of the campoString12 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCampoString12() {
        return campoString12;
    }

    /**
     * Sets the value of the campoString12 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCampoString12(String value) {
        this.campoString12 = value;
    }

    /**
     * Gets the value of the campoString13 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCampoString13() {
        return campoString13;
    }

    /**
     * Sets the value of the campoString13 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCampoString13(String value) {
        this.campoString13 = value;
    }

    /**
     * Gets the value of the campoString14 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCampoString14() {
        return campoString14;
    }

    /**
     * Sets the value of the campoString14 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCampoString14(String value) {
        this.campoString14 = value;
    }

    /**
     * Gets the value of the campoString15 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCampoString15() {
        return campoString15;
    }

    /**
     * Sets the value of the campoString15 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCampoString15(String value) {
        this.campoString15 = value;
    }

    /**
     * Gets the value of the campoString16 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCampoString16() {
        return campoString16;
    }

    /**
     * Sets the value of the campoString16 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCampoString16(String value) {
        this.campoString16 = value;
    }

    /**
     * Gets the value of the campoString17 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCampoString17() {
        return campoString17;
    }

    /**
     * Sets the value of the campoString17 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCampoString17(String value) {
        this.campoString17 = value;
    }

    /**
     * Gets the value of the campoString18 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCampoString18() {
        return campoString18;
    }

    /**
     * Sets the value of the campoString18 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCampoString18(String value) {
        this.campoString18 = value;
    }

    /**
     * Gets the value of the campoString19 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCampoString19() {
        return campoString19;
    }

    /**
     * Sets the value of the campoString19 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCampoString19(String value) {
        this.campoString19 = value;
    }

    /**
     * Gets the value of the campoString20 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCampoString20() {
        return campoString20;
    }

    /**
     * Sets the value of the campoString20 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCampoString20(String value) {
        this.campoString20 = value;
    }

    /**
     * Gets the value of the campoString21 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCampoString21() {
        return campoString21;
    }

    /**
     * Sets the value of the campoString21 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCampoString21(String value) {
        this.campoString21 = value;
    }

    /**
     * Gets the value of the campoString22 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCampoString22() {
        return campoString22;
    }

    /**
     * Sets the value of the campoString22 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCampoString22(String value) {
        this.campoString22 = value;
    }

    /**
     * Gets the value of the campoString23 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCampoString23() {
        return campoString23;
    }

    /**
     * Sets the value of the campoString23 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCampoString23(String value) {
        this.campoString23 = value;
    }

    /**
     * Gets the value of the campoString24 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCampoString24() {
        return campoString24;
    }

    /**
     * Sets the value of the campoString24 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCampoString24(String value) {
        this.campoString24 = value;
    }

    /**
     * Gets the value of the campoString25 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCampoString25() {
        return campoString25;
    }

    /**
     * Sets the value of the campoString25 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCampoString25(String value) {
        this.campoString25 = value;
    }

    /**
     * Gets the value of the campoString26 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCampoString26() {
        return campoString26;
    }

    /**
     * Sets the value of the campoString26 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCampoString26(String value) {
        this.campoString26 = value;
    }

    /**
     * Gets the value of the campoString27 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCampoString27() {
        return campoString27;
    }

    /**
     * Sets the value of the campoString27 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCampoString27(String value) {
        this.campoString27 = value;
    }

    /**
     * Gets the value of the campoString28 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCampoString28() {
        return campoString28;
    }

    /**
     * Sets the value of the campoString28 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCampoString28(String value) {
        this.campoString28 = value;
    }

    /**
     * Gets the value of the campoString29 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCampoString29() {
        return campoString29;
    }

    /**
     * Sets the value of the campoString29 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCampoString29(String value) {
        this.campoString29 = value;
    }

    /**
     * Gets the value of the campoString30 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCampoString30() {
        return campoString30;
    }

    /**
     * Sets the value of the campoString30 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCampoString30(String value) {
        this.campoString30 = value;
    }

    /**
     * Gets the value of the carteiraNacionalSaude property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarteiraNacionalSaude() {
        return carteiraNacionalSaude;
    }

    /**
     * Sets the value of the carteiraNacionalSaude property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarteiraNacionalSaude(String value) {
        this.carteiraNacionalSaude = value;
    }

    /**
     * Gets the value of the categoria property.
     * 
     * @return
     *     possible object is
     *     {@link TipoCategoriaEnum }
     *     
     */
    public TipoCategoriaEnum getCategoria() {
        return categoria;
    }

    /**
     * Sets the value of the categoria property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoCategoriaEnum }
     *     
     */
    public void setCategoria(TipoCategoriaEnum value) {
        this.categoria = value;
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
     * Gets the value of the chaveProcuraFuncionario property.
     * 
     * @return
     *     possible object is
     *     {@link ChaveProcura }
     *     
     */
    public ChaveProcura getChaveProcuraFuncionario() {
        return chaveProcuraFuncionario;
    }

    /**
     * Sets the value of the chaveProcuraFuncionario property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChaveProcura }
     *     
     */
    public void setChaveProcuraFuncionario(ChaveProcura value) {
        this.chaveProcuraFuncionario = value;
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
     * Gets the value of the cipa property.
     * 
     * @return
     *     possible object is
     *     {@link TipoCipaEnum }
     *     
     */
    public TipoCipaEnum getCipa() {
        return cipa;
    }

    /**
     * Sets the value of the cipa property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoCipaEnum }
     *     
     */
    public void setCipa(TipoCipaEnum value) {
        this.cipa = value;
    }

    /**
     * Gets the value of the cipaDataFimMandato property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCipaDataFimMandato() {
        return cipaDataFimMandato;
    }

    /**
     * Sets the value of the cipaDataFimMandato property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCipaDataFimMandato(String value) {
        this.cipaDataFimMandato = value;
    }

    /**
     * Gets the value of the cipaDataInicioMandato property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCipaDataInicioMandato() {
        return cipaDataInicioMandato;
    }

    /**
     * Sets the value of the cipaDataInicioMandato property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCipaDataInicioMandato(String value) {
        this.cipaDataInicioMandato = value;
    }

    /**
     * Gets the value of the cnpjEmpresaFuncionario property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCnpjEmpresaFuncionario() {
        return cnpjEmpresaFuncionario;
    }

    /**
     * Sets the value of the cnpjEmpresaFuncionario property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCnpjEmpresaFuncionario(String value) {
        this.cnpjEmpresaFuncionario = value;
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
     * Gets the value of the complementoEndereco property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComplementoEndereco() {
        return complementoEndereco;
    }

    /**
     * Sets the value of the complementoEndereco property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComplementoEndereco(String value) {
        this.complementoEndereco = value;
    }

    /**
     * Gets the value of the contatoEmergencia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContatoEmergencia() {
        return contatoEmergencia;
    }

    /**
     * Sets the value of the contatoEmergencia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContatoEmergencia(String value) {
        this.contatoEmergencia = value;
    }

    /**
     * Gets the value of the cor property.
     * 
     * @return
     *     possible object is
     *     {@link CorEnum }
     *     
     */
    public CorEnum getCor() {
        return cor;
    }

    /**
     * Sets the value of the cor property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorEnum }
     *     
     */
    public void setCor(CorEnum value) {
        this.cor = value;
    }

    /**
     * Gets the value of the cpf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * Sets the value of the cpf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCpf(String value) {
        this.cpf = value;
    }

    /**
     * Gets the value of the dataAdmissao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataAdmissao() {
        return dataAdmissao;
    }

    /**
     * Sets the value of the dataAdmissao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataAdmissao(String value) {
        this.dataAdmissao = value;
    }

    /**
     * Gets the value of the dataAfastamento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataAfastamento() {
        return dataAfastamento;
    }

    /**
     * Sets the value of the dataAfastamento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataAfastamento(String value) {
        this.dataAfastamento = value;
    }

    /**
     * Gets the value of the dataDemissao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataDemissao() {
        return dataDemissao;
    }

    /**
     * Sets the value of the dataDemissao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataDemissao(String value) {
        this.dataDemissao = value;
    }

    /**
     * Gets the value of the dataDemissionalCarta property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataDemissionalCarta() {
        return dataDemissionalCarta;
    }

    /**
     * Sets the value of the dataDemissionalCarta property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataDemissionalCarta(String value) {
        this.dataDemissionalCarta = value;
    }

    /**
     * Gets the value of the dataEmissaoCtps property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataEmissaoCtps() {
        return dataEmissaoCtps;
    }

    /**
     * Sets the value of the dataEmissaoCtps property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataEmissaoCtps(String value) {
        this.dataEmissaoCtps = value;
    }

    /**
     * Gets the value of the dataFinalEstabilidade property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataFinalEstabilidade() {
        return dataFinalEstabilidade;
    }

    /**
     * Sets the value of the dataFinalEstabilidade property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataFinalEstabilidade(String value) {
        this.dataFinalEstabilidade = value;
    }

    /**
     * Gets the value of the dataNascimento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataNascimento() {
        return dataNascimento;
    }

    /**
     * Sets the value of the dataNascimento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataNascimento(String value) {
        this.dataNascimento = value;
    }

    /**
     * Gets the value of the dataUltimaMovimentacao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataUltimaMovimentacao() {
        return dataUltimaMovimentacao;
    }

    /**
     * Sets the value of the dataUltimaMovimentacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataUltimaMovimentacao(String value) {
        this.dataUltimaMovimentacao = value;
    }

    /**
     * Gets the value of the desabilitarRisco property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDesabilitarRisco() {
        return desabilitarRisco;
    }

    /**
     * Sets the value of the desabilitarRisco property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDesabilitarRisco(Boolean value) {
        this.desabilitarRisco = value;
    }

    /**
     * Gets the value of the descricaoAtividade property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescricaoAtividade() {
        return descricaoAtividade;
    }

    /**
     * Sets the value of the descricaoAtividade property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescricaoAtividade(String value) {
        this.descricaoAtividade = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
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
     * Gets the value of the enderecoEmergencia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnderecoEmergencia() {
        return enderecoEmergencia;
    }

    /**
     * Sets the value of the enderecoEmergencia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnderecoEmergencia(String value) {
        this.enderecoEmergencia = value;
    }

    /**
     * Gets the value of the escolaridade property.
     * 
     * @return
     *     possible object is
     *     {@link TipoEscolaridadeEnum }
     *     
     */
    public TipoEscolaridadeEnum getEscolaridade() {
        return escolaridade;
    }

    /**
     * Sets the value of the escolaridade property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoEscolaridadeEnum }
     *     
     */
    public void setEscolaridade(TipoEscolaridadeEnum value) {
        this.escolaridade = value;
    }

    /**
     * Gets the value of the estado property.
     * 
     * @return
     *     possible object is
     *     {@link EstadosEnum }
     *     
     */
    public EstadosEnum getEstado() {
        return estado;
    }

    /**
     * Sets the value of the estado property.
     * 
     * @param value
     *     allowed object is
     *     {@link EstadosEnum }
     *     
     */
    public void setEstado(EstadosEnum value) {
        this.estado = value;
    }

    /**
     * Gets the value of the estadoCivil property.
     * 
     * @return
     *     possible object is
     *     {@link EstadoCivilEnum }
     *     
     */
    public EstadoCivilEnum getEstadoCivil() {
        return estadoCivil;
    }

    /**
     * Sets the value of the estadoCivil property.
     * 
     * @param value
     *     allowed object is
     *     {@link EstadoCivilEnum }
     *     
     */
    public void setEstadoCivil(EstadoCivilEnum value) {
        this.estadoCivil = value;
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
     * Gets the value of the funcaoBrigadaIncendio property.
     * 
     * @return
     *     possible object is
     *     {@link TipoFuncaoBrigadaEnum }
     *     
     */
    public TipoFuncaoBrigadaEnum getFuncaoBrigadaIncendio() {
        return funcaoBrigadaIncendio;
    }

    /**
     * Sets the value of the funcaoBrigadaIncendio property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoFuncaoBrigadaEnum }
     *     
     */
    public void setFuncaoBrigadaIncendio(TipoFuncaoBrigadaEnum value) {
        this.funcaoBrigadaIncendio = value;
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
     * Gets the value of the historicoPPP property.
     * 
     * @return
     *     possible object is
     *     {@link HistoricoPPP }
     *     
     */
    public HistoricoPPP getHistoricoPPP() {
        return historicoPPP;
    }

    /**
     * Sets the value of the historicoPPP property.
     * 
     * @param value
     *     allowed object is
     *     {@link HistoricoPPP }
     *     
     */
    public void setHistoricoPPP(HistoricoPPP value) {
        this.historicoPPP = value;
    }

    /**
     * Gets the value of the matricula property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatricula() {
        return matricula;
    }

    /**
     * Sets the value of the matricula property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatricula(String value) {
        this.matricula = value;
    }

    /**
     * Gets the value of the naoPossuiCpf property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNaoPossuiCpf() {
        return naoPossuiCpf;
    }

    /**
     * Sets the value of the naoPossuiCpf property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNaoPossuiCpf(Boolean value) {
        this.naoPossuiCpf = value;
    }

    /**
     * Gets the value of the naoPossuiCtps property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNaoPossuiCtps() {
        return naoPossuiCtps;
    }

    /**
     * Sets the value of the naoPossuiCtps property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNaoPossuiCtps(Boolean value) {
        this.naoPossuiCtps = value;
    }

    /**
     * Gets the value of the naoPossuiMatricula property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNaoPossuiMatricula() {
        return naoPossuiMatricula;
    }

    /**
     * Sets the value of the naoPossuiMatricula property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNaoPossuiMatricula(Boolean value) {
        this.naoPossuiMatricula = value;
    }

    /**
     * Gets the value of the naoPossuiPis property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNaoPossuiPis() {
        return naoPossuiPis;
    }

    /**
     * Sets the value of the naoPossuiPis property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNaoPossuiPis(Boolean value) {
        this.naoPossuiPis = value;
    }

    /**
     * Gets the value of the naturalidade property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNaturalidade() {
        return naturalidade;
    }

    /**
     * Sets the value of the naturalidade property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNaturalidade(String value) {
        this.naturalidade = value;
    }

    /**
     * Gets the value of the nomeCooperativa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeCooperativa() {
        return nomeCooperativa;
    }

    /**
     * Sets the value of the nomeCooperativa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeCooperativa(String value) {
        this.nomeCooperativa = value;
    }

    /**
     * Gets the value of the nomeFuncionario property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeFuncionario() {
        return nomeFuncionario;
    }

    /**
     * Sets the value of the nomeFuncionario property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeFuncionario(String value) {
        this.nomeFuncionario = value;
    }

    /**
     * Gets the value of the nomeMae property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeMae() {
        return nomeMae;
    }

    /**
     * Sets the value of the nomeMae property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeMae(String value) {
        this.nomeMae = value;
    }

    /**
     * Gets the value of the nrCtps property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNrCtps() {
        return nrCtps;
    }

    /**
     * Sets the value of the nrCtps property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNrCtps(String value) {
        this.nrCtps = value;
    }

    /**
     * Gets the value of the numeroEndereco property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroEndereco() {
        return numeroEndereco;
    }

    /**
     * Sets the value of the numeroEndereco property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroEndereco(String value) {
        this.numeroEndereco = value;
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
     * Gets the value of the observacaoEstabilidade property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObservacaoEstabilidade() {
        return observacaoEstabilidade;
    }

    /**
     * Sets the value of the observacaoEstabilidade property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObservacaoEstabilidade(String value) {
        this.observacaoEstabilidade = value;
    }

    /**
     * Gets the value of the observacaoPpp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObservacaoPpp() {
        return observacaoPpp;
    }

    /**
     * Sets the value of the observacaoPpp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObservacaoPpp(String value) {
        this.observacaoPpp = value;
    }

    /**
     * Gets the value of the parentescoContatoEmergencia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentescoContatoEmergencia() {
        return parentescoContatoEmergencia;
    }

    /**
     * Sets the value of the parentescoContatoEmergencia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentescoContatoEmergencia(String value) {
        this.parentescoContatoEmergencia = value;
    }

    /**
     * Gets the value of the pis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPis() {
        return pis;
    }

    /**
     * Sets the value of the pis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPis(String value) {
        this.pis = value;
    }

    /**
     * Gets the value of the ramal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRamal() {
        return ramal;
    }

    /**
     * Sets the value of the ramal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRamal(String value) {
        this.ramal = value;
    }

    /**
     * Gets the value of the ramalTelefoneEmergencia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRamalTelefoneEmergencia() {
        return ramalTelefoneEmergencia;
    }

    /**
     * Sets the value of the ramalTelefoneEmergencia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRamalTelefoneEmergencia(String value) {
        this.ramalTelefoneEmergencia = value;
    }

    /**
     * Gets the value of the razaoSocialEmpresaFuncionario property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRazaoSocialEmpresaFuncionario() {
        return razaoSocialEmpresaFuncionario;
    }

    /**
     * Sets the value of the razaoSocialEmpresaFuncionario property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRazaoSocialEmpresaFuncionario(String value) {
        this.razaoSocialEmpresaFuncionario = value;
    }

    /**
     * Gets the value of the regimeRevezamento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegimeRevezamento() {
        return regimeRevezamento;
    }

    /**
     * Sets the value of the regimeRevezamento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegimeRevezamento(String value) {
        this.regimeRevezamento = value;
    }

    /**
     * Gets the value of the regimeTrabalho property.
     * 
     * @return
     *     possible object is
     *     {@link RegimeTrabalhoEnum }
     *     
     */
    public RegimeTrabalhoEnum getRegimeTrabalho() {
        return regimeTrabalho;
    }

    /**
     * Sets the value of the regimeTrabalho property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegimeTrabalhoEnum }
     *     
     */
    public void setRegimeTrabalho(RegimeTrabalhoEnum value) {
        this.regimeTrabalho = value;
    }

    /**
     * Gets the value of the remuneracaoMensal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRemuneracaoMensal() {
        return remuneracaoMensal;
    }

    /**
     * Sets the value of the remuneracaoMensal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRemuneracaoMensal(BigDecimal value) {
        this.remuneracaoMensal = value;
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
     * Gets the value of the rg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRg() {
        return rg;
    }

    /**
     * Sets the value of the rg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRg(String value) {
        this.rg = value;
    }

    /**
     * Gets the value of the rgDataEmissao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRgDataEmissao() {
        return rgDataEmissao;
    }

    /**
     * Sets the value of the rgDataEmissao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRgDataEmissao(String value) {
        this.rgDataEmissao = value;
    }

    /**
     * Gets the value of the rgOrgaoEmissor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRgOrgaoEmissor() {
        return rgOrgaoEmissor;
    }

    /**
     * Sets the value of the rgOrgaoEmissor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRgOrgaoEmissor(String value) {
        this.rgOrgaoEmissor = value;
    }

    /**
     * Gets the value of the rgUf property.
     * 
     * @return
     *     possible object is
     *     {@link EstadosEnum }
     *     
     */
    public EstadosEnum getRgUf() {
        return rgUf;
    }

    /**
     * Sets the value of the rgUf property.
     * 
     * @param value
     *     allowed object is
     *     {@link EstadosEnum }
     *     
     */
    public void setRgUf(EstadosEnum value) {
        this.rgUf = value;
    }

    /**
     * Gets the value of the serieCtps property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerieCtps() {
        return serieCtps;
    }

    /**
     * Sets the value of the serieCtps property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerieCtps(String value) {
        this.serieCtps = value;
    }

    /**
     * Gets the value of the sexo property.
     * 
     * @return
     *     possible object is
     *     {@link SexoEnum }
     *     
     */
    public SexoEnum getSexo() {
        return sexo;
    }

    /**
     * Sets the value of the sexo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SexoEnum }
     *     
     */
    public void setSexo(SexoEnum value) {
        this.sexo = value;
    }

    /**
     * Gets the value of the situacao property.
     * 
     * @return
     *     possible object is
     *     {@link SituacaoFuncionario }
     *     
     */
    public SituacaoFuncionario getSituacao() {
        return situacao;
    }

    /**
     * Sets the value of the situacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link SituacaoFuncionario }
     *     
     */
    public void setSituacao(SituacaoFuncionario value) {
        this.situacao = value;
    }

    /**
     * Gets the value of the telefoneCelular property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelefoneCelular() {
        return telefoneCelular;
    }

    /**
     * Sets the value of the telefoneCelular property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelefoneCelular(String value) {
        this.telefoneCelular = value;
    }

    /**
     * Gets the value of the telefoneComercial property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelefoneComercial() {
        return telefoneComercial;
    }

    /**
     * Sets the value of the telefoneComercial property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelefoneComercial(String value) {
        this.telefoneComercial = value;
    }

    /**
     * Gets the value of the telefoneEmergencia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelefoneEmergencia() {
        return telefoneEmergencia;
    }

    /**
     * Sets the value of the telefoneEmergencia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelefoneEmergencia(String value) {
        this.telefoneEmergencia = value;
    }

    /**
     * Gets the value of the telefoneResidencial property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelefoneResidencial() {
        return telefoneResidencial;
    }

    /**
     * Sets the value of the telefoneResidencial property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelefoneResidencial(String value) {
        this.telefoneResidencial = value;
    }

    /**
     * Gets the value of the telefoneSms property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelefoneSms() {
        return telefoneSms;
    }

    /**
     * Sets the value of the telefoneSms property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelefoneSms(String value) {
        this.telefoneSms = value;
    }

    /**
     * Gets the value of the tipoBuscaEmpresa property.
     * 
     * @return
     *     possible object is
     *     {@link TipoBuscaEmpresaEnum }
     *     
     */
    public TipoBuscaEmpresaEnum getTipoBuscaEmpresa() {
        return tipoBuscaEmpresa;
    }

    /**
     * Sets the value of the tipoBuscaEmpresa property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoBuscaEmpresaEnum }
     *     
     */
    public void setTipoBuscaEmpresa(TipoBuscaEmpresaEnum value) {
        this.tipoBuscaEmpresa = value;
    }

    /**
     * Gets the value of the tipoContratacao property.
     * 
     * @return
     *     possible object is
     *     {@link TipoContratacaoEnum }
     *     
     */
    public TipoContratacaoEnum getTipoContratacao() {
        return tipoContratacao;
    }

    /**
     * Sets the value of the tipoContratacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoContratacaoEnum }
     *     
     */
    public void setTipoContratacao(TipoContratacaoEnum value) {
        this.tipoContratacao = value;
    }

    /**
     * Gets the value of the ufCtps property.
     * 
     * @return
     *     possible object is
     *     {@link EstadosEnum }
     *     
     */
    public EstadosEnum getUfCtps() {
        return ufCtps;
    }

    /**
     * Sets the value of the ufCtps property.
     * 
     * @param value
     *     allowed object is
     *     {@link EstadosEnum }
     *     
     */
    public void setUfCtps(EstadosEnum value) {
        this.ufCtps = value;
    }

    /**
     * Gets the value of the utilizarDescricaoRequisitoCargo property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUtilizarDescricaoRequisitoCargo() {
        return utilizarDescricaoRequisitoCargo;
    }

    /**
     * Sets the value of the utilizarDescricaoRequisitoCargo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUtilizarDescricaoRequisitoCargo(Boolean value) {
        this.utilizarDescricaoRequisitoCargo = value;
    }

    /**
     * Gets the value of the observacaoFuncionario property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObservacaoFuncionario() {
        return observacaoFuncionario;
    }

    /**
     * Sets the value of the observacaoFuncionario property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObservacaoFuncionario(String value) {
        this.observacaoFuncionario = value;
    }

}
