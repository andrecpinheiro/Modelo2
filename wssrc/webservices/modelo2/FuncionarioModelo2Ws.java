
package webservices.modelo2;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.3-b02-
 * Generated source version: 2.0
 * 
 */
@WebService(name = "FuncionarioModelo2Ws", targetNamespace = "http://services.soc.age.com/")
public interface FuncionarioModelo2Ws {


    /**
     * 
     * @param funcionario
     * @return
     *     returns webservices.modelo2.RetornoWsVo
     * @throws WSException_Exception
     */
    @WebMethod
    @WebResult(name = "FuncionarioRetorno", targetNamespace = "")
    @RequestWrapper(localName = "importacaoFuncionario", targetNamespace = "http://services.soc.age.com/", className = "webservices.modelo2.ImportacaoFuncionario")
    @ResponseWrapper(localName = "importacaoFuncionarioResponse", targetNamespace = "http://services.soc.age.com/", className = "webservices.modelo2.ImportacaoFuncionarioResponse")
    public RetornoWsVo importacaoFuncionario(
        @WebParam(name = "Funcionario", targetNamespace = "")
        FuncionarioModelo2WsVo funcionario)
        throws WSException_Exception
    ;

}
