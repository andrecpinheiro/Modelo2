package businnes;

import webservices.modelo2.ChaveProcura;
import webservices.modelo2.CnpjCei;
import webservices.modelo2.EstadoCivilEnum;
import webservices.modelo2.FuncionarioCargoWsVo;
import webservices.modelo2.FuncionarioModelo2Ws;
import webservices.modelo2.FuncionarioModelo2WsVo;
import webservices.modelo2.FuncionarioSetorWsVo;
import webservices.modelo2.FuncionarioUnidadeWsVo;
import webservices.modelo2.FuncionarioWsVo;
import webservices.modelo2.IdentificacaoUsuarioWsVo;
import webservices.modelo2.RegimeTrabalhoEnum;
import webservices.modelo2.RetornoWsVo;
import webservices.modelo2.SexoEnum;
import webservices.modelo2.Situacao;
import webservices.modelo2.SituacaoFuncionario;
import webservices.modelo2.TipoBuscaCargoEnum;
import webservices.modelo2.TipoBuscaEmpresaEnum;
import webservices.modelo2.TipoBuscaSetorEnum;
import webservices.modelo2.TipoBuscaUnidadeEnum;
import webservices.modelo2.TipoContratacaoEnum;

/**
 * Classe responsável por exemplificar a integração funcionario Modelo2
 * @author Andre Pinheiro
 * AGE & Make Technology
 */
public class FuncionarioWsClient {
	
	private static final String USUARIO = "";
	private static final String RESPONSAVEL = "";
	private static final String CODIGO_EMPRESA_PRINCIPAL = "";
	private static final String SENHA = "";
	private static final String LOGIN = "";
	
	private String codigo;
	private String chaveAcesso;
	
	public FuncionarioWsClient(String codigo, String chaveAcesso){
		this.codigo = codigo;
		this.chaveAcesso = chaveAcesso;
	}

	public static void main(String[] args) {
		FuncionarioWsClient client = new FuncionarioWsClient(LOGIN, SENHA);
		client.importacaoFuncionario();
	}
	
	private void importacaoFuncionario(){
		
		long l = System.currentTimeMillis();
		try {
			WebServiceLocator 		locator 		= WebServiceLocator.getInstance();
			FuncionarioModelo2Ws    integracao		= locator.getWebServiceModelo2(String.valueOf(codigo),chaveAcesso);
			FuncionarioModelo2WsVo funcionario = new FuncionarioModelo2WsVo();
			funcionario.setIdentificacaoWsVo(getIdentificacaoVo());
			funcionario.setFuncionarioWsVo(getFuncionarioWsVo());
			funcionario.setAtualizarFuncionario(true);
			funcionario.setCriarFuncionario(true);
			funcionario.setCriarCargo(true);
			funcionario.setCriarUnidade(true);
			funcionario.setCriarSetor(true);
			funcionario.setAtualizarUnidade(true);
			
			FuncionarioCargoWsVo cargoWs = new FuncionarioCargoWsVo();
			cargoWs.setCodigo("1");
			cargoWs.setTipoBusca(TipoBuscaCargoEnum.CODIGO);
			cargoWs.setNome("cargo");
			funcionario.setCargoWsVo(cargoWs);
			
			FuncionarioSetorWsVo setorWs = new FuncionarioSetorWsVo();
			setorWs.setCodigo("1");
			setorWs.setTipoBusca(TipoBuscaSetorEnum.CODIGO);
			setorWs.setNome("setor");
			funcionario.setSetorWsVo(setorWs);
			
			FuncionarioUnidadeWsVo unidadeWs = new FuncionarioUnidadeWsVo();
			unidadeWs.setCodigo("1");
			unidadeWs.setTipoBusca(TipoBuscaUnidadeEnum.CODIGO);
			unidadeWs.setNome("unidade");
			unidadeWs.setCnpjCei(CnpjCei.CNPJ);
			unidadeWs.setCodigoCnpjCei("92185476000162");
			unidadeWs.setStatus(Situacao.ATIVO);
			funcionario.setUnidadeWsVo(unidadeWs);
			
			
			
			
			RetornoWsVo importacaoFuncionario = integracao.importacaoFuncionario(funcionario);
			
			if(importacaoFuncionario.getDescricaoErro().equals("")){
				System.out.println("Efetuado com sucesso da thread numero "+ codigo + "tempo : "+ (System.currentTimeMillis()-l));
			}else{
				System.out.println("Descricao Erro "+ importacaoFuncionario.getDescricaoErro());
			}
			
		}catch (Exception e) {
			System.out.println("Falha da thread numero "+ codigo + "tempo : "+ (System.currentTimeMillis()-l));
			e.printStackTrace();
		}
		
	}

	private FuncionarioWsVo getFuncionarioWsVo() {
		FuncionarioWsVo value = new FuncionarioWsVo();
		value.setCodigo("1");
		value.setCodigoEmpresa(String.valueOf(codigo));
		value.setTipoBuscaEmpresa(TipoBuscaEmpresaEnum.CODIGO_SOC);
		value.setChaveProcuraFuncionario(ChaveProcura.CODIGO);
		value.setSexo(SexoEnum.MASCULINO);
		value.setNomeFuncionario("Sky");
		value.setDataNascimento("11/05/1981");
		value.setDataAdmissao("16/06/2015");
		value.setCpf("74342935864");
		value.setPis("12088522648");
		value.setMatricula("111111");
		value.setTipoContratacao(TipoContratacaoEnum.CLT);
		value.setRegimeTrabalho(RegimeTrabalhoEnum.NORMAL);
		value.setEstadoCivil(EstadoCivilEnum.SOLTEIRO);
		value.setSituacao(SituacaoFuncionario.ATIVO);
		return value;
	}

	private IdentificacaoUsuarioWsVo getIdentificacaoVo() {
		IdentificacaoUsuarioWsVo value = new IdentificacaoUsuarioWsVo();
		value.setCodigoEmpresaPrincipal(CODIGO_EMPRESA_PRINCIPAL);
		value.setCodigoResponsavel(RESPONSAVEL);
		value.setCodigoUsuario(USUARIO);
		value.setChaveAcesso(SENHA);
		return value;
	}

}
