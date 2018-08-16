
package webservices.modelo2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for parecerLaudoEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="parecerLaudoEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="EM_BRANCO"/>
 *     &lt;enumeration value="APTO_PARA_FUNCAO"/>
 *     &lt;enumeration value="INAPTO_PARA_FUNCAO"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "parecerLaudoEnum")
@XmlEnum
public enum ParecerLaudoEnum {

    EM_BRANCO,
    APTO_PARA_FUNCAO,
    INAPTO_PARA_FUNCAO;

    public String value() {
        return name();
    }

    public static ParecerLaudoEnum fromValue(String v) {
        return valueOf(v);
    }

}
