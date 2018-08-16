
package webservices.modelo2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tipoBuscaEmpresaEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="tipoBuscaEmpresaEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CODIGO_SOC"/>
 *     &lt;enumeration value="CODIGO_CLIENTE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "tipoBuscaEmpresaEnum")
@XmlEnum
public enum TipoBuscaEmpresaEnum {

    CODIGO_SOC,
    CODIGO_CLIENTE;

    public String value() {
        return name();
    }

    public static TipoBuscaEmpresaEnum fromValue(String v) {
        return valueOf(v);
    }

}
