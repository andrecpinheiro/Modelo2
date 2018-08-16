
package webservices.modelo2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tipoCipaEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="tipoCipaEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="EM_BRANCO"/>
 *     &lt;enumeration value="EFETIVO"/>
 *     &lt;enumeration value="SUPLENTE"/>
 *     &lt;enumeration value="RESPONSAVEL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "tipoCipaEnum")
@XmlEnum
public enum TipoCipaEnum {

    EM_BRANCO,
    EFETIVO,
    SUPLENTE,
    RESPONSAVEL;

    public String value() {
        return name();
    }

    public static TipoCipaEnum fromValue(String v) {
        return valueOf(v);
    }

}
