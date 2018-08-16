
package webservices.modelo2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tipoCnae.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="tipoCnae">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CNAE"/>
 *     &lt;enumeration value="CNAE_2"/>
 *     &lt;enumeration value="CNAE_7"/>
 *     &lt;enumeration value="CNAE_LIVRE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "tipoCnae")
@XmlEnum
public enum TipoCnae {

    CNAE,
    CNAE_2,
    CNAE_7,
    CNAE_LIVRE;

    public String value() {
        return name();
    }

    public static TipoCnae fromValue(String v) {
        return valueOf(v);
    }

}
