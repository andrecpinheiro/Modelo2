
package webservices.modelo2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tipoBuscaCentroCustoEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="tipoBuscaCentroCustoEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CODIGO"/>
 *     &lt;enumeration value="CODIGO_RH"/>
 *     &lt;enumeration value="NOME"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "tipoBuscaCentroCustoEnum")
@XmlEnum
public enum TipoBuscaCentroCustoEnum {

    CODIGO,
    CODIGO_RH,
    NOME;

    public String value() {
        return name();
    }

    public static TipoBuscaCentroCustoEnum fromValue(String v) {
        return valueOf(v);
    }

}
