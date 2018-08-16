
package webservices.modelo2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for corEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="corEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="EM_BRANCO"/>
 *     &lt;enumeration value="BRANCO"/>
 *     &lt;enumeration value="NEGRO"/>
 *     &lt;enumeration value="AMARELO"/>
 *     &lt;enumeration value="PARDO"/>
 *     &lt;enumeration value="INDIGENA"/>
 *     &lt;enumeration value="MULATO"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "corEnum")
@XmlEnum
public enum CorEnum {

    EM_BRANCO,
    BRANCO,
    NEGRO,
    AMARELO,
    PARDO,
    INDIGENA,
    MULATO;

    public String value() {
        return name();
    }

    public static CorEnum fromValue(String v) {
        return valueOf(v);
    }

}
