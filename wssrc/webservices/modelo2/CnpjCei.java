
package webservices.modelo2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for cnpjCei.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="cnpjCei">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CNPJ"/>
 *     &lt;enumeration value="CEI"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "cnpjCei")
@XmlEnum
public enum CnpjCei {

    CNPJ,
    CEI;

    public String value() {
        return name();
    }

    public static CnpjCei fromValue(String v) {
        return valueOf(v);
    }

}
