
package webservices.modelo2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for situacao.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="situacao">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ATIVO"/>
 *     &lt;enumeration value="INATIVO"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "situacao")
@XmlEnum
public enum Situacao {

    ATIVO,
    INATIVO;

    public String value() {
        return name();
    }

    public static Situacao fromValue(String v) {
        return valueOf(v);
    }

}
