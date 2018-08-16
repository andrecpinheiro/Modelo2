package businnes;
/*
 * Created on 08/02/2005
 *
 * To change the template for this generated file go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */


import java.util.ArrayList;
import java.util.List;

import javax.xml.ws.handler.Handler;
import javax.xml.ws.handler.HandlerResolver;
import javax.xml.ws.handler.PortInfo;

import webservices.modelo2.FuncionarioModelo2Ws;
import webservices.modelo2.FuncionarioModelo2WsService;

/**
 * Classe responsável por instanciar um Bean para acesso ao WebService de Entidade
 * @author Andre Pinheiro
 * AGE Technology
 */
public class WebServiceLocator{
	
	FuncionarioModelo2Ws integracaoFuncionario = null;
	private static WebServiceLocator me;
	
	static {
		me = new WebServiceLocator();
	}

	private WebServiceLocator() {

	}

	static public WebServiceLocator getInstance() {
		return me;
	}

	public FuncionarioModelo2Ws getWebServiceModelo2(final String login, final String senha){
		FuncionarioModelo2WsService service = new FuncionarioModelo2WsService();
			service.setHandlerResolver(new HandlerResolver() {
				@Override
				public List<Handler> getHandlerChain(PortInfo portInfo) {
					List<Handler> handlerList = new ArrayList<Handler>();
					handlerList.add(new WSSUsernameTokenSecurityHandler(login,senha));
					return handlerList;
				}
			});
			integracaoFuncionario = service.getFuncionarioModelo2WsPort();
		return integracaoFuncionario;
	}	
	
}