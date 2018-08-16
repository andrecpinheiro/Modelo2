
package webservices.modelo2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for importacaoFuncionario complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="importacaoFuncionario">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Funcionario" type="{http://services.soc.age.com/}funcionarioModelo2WsVo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "importacaoFuncionario", propOrder = {
    "funcionario"
})
public class ImportacaoFuncionario {

    @XmlElement(name = "Funcionario")
    protected FuncionarioModelo2WsVo funcionario;

    /**
     * Gets the value of the funcionario property.
     * 
     * @return
     *     possible object is
     *     {@link FuncionarioModelo2WsVo }
     *     
     */
    public FuncionarioModelo2WsVo getFuncionario() {
        return funcionario;
    }

    /**
     * Sets the value of the funcionario property.
     * 
     * @param value
     *     allowed object is
     *     {@link FuncionarioModelo2WsVo }
     *     
     */
    public void setFuncionario(FuncionarioModelo2WsVo value) {
        this.funcionario = value;
    }

}
