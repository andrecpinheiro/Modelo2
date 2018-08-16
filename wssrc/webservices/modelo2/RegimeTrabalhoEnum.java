
package webservices.modelo2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for regimeTrabalhoEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="regimeTrabalhoEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NORMAL"/>
 *     &lt;enumeration value="TURNO"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "regimeTrabalhoEnum")
@XmlEnum
public enum RegimeTrabalhoEnum {

    NORMAL,
    TURNO;

    public String value() {
        return name();
    }

    public static RegimeTrabalhoEnum fromValue(String v) {
        return valueOf(v);
    }

}
