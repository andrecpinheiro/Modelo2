
package webservices.modelo2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for estadoCivilEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="estadoCivilEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SOLTEIRO"/>
 *     &lt;enumeration value="CASADO"/>
 *     &lt;enumeration value="SEPARADO"/>
 *     &lt;enumeration value="DIVORCIADO"/>
 *     &lt;enumeration value="VIUVO"/>
 *     &lt;enumeration value="OUTROS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "estadoCivilEnum")
@XmlEnum
public enum EstadoCivilEnum {

    SOLTEIRO,
    CASADO,
    SEPARADO,
    DIVORCIADO,
    VIUVO,
    OUTROS;

    public String value() {
        return name();
    }

    public static EstadoCivilEnum fromValue(String v) {
        return valueOf(v);
    }

}
