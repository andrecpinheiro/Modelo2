
package webservices.modelo2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for importacaoFuncionarioResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="importacaoFuncionarioResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FuncionarioRetorno" type="{http://services.soc.age.com/}retornoWsVo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "importacaoFuncionarioResponse", propOrder = {
    "funcionarioRetorno"
})
public class ImportacaoFuncionarioResponse {

    @XmlElement(name = "FuncionarioRetorno")
    protected RetornoWsVo funcionarioRetorno;

    /**
     * Gets the value of the funcionarioRetorno property.
     * 
     * @return
     *     possible object is
     *     {@link RetornoWsVo }
     *     
     */
    public RetornoWsVo getFuncionarioRetorno() {
        return funcionarioRetorno;
    }

    /**
     * Sets the value of the funcionarioRetorno property.
     * 
     * @param value
     *     allowed object is
     *     {@link RetornoWsVo }
     *     
     */
    public void setFuncionarioRetorno(RetornoWsVo value) {
        this.funcionarioRetorno = value;
    }

}
