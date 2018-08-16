
package webservices.modelo2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for origemDeficienciaEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="origemDeficienciaEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="EM_BRANCO"/>
 *     &lt;enumeration value="ACIDENTE_DE_TRABALHO"/>
 *     &lt;enumeration value="CONGENITA"/>
 *     &lt;enumeration value="ACIDENTE_COMUM"/>
 *     &lt;enumeration value="DOENCA"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "origemDeficienciaEnum")
@XmlEnum
public enum OrigemDeficienciaEnum {

    EM_BRANCO,
    ACIDENTE_DE_TRABALHO,
    CONGENITA,
    ACIDENTE_COMUM,
    DOENCA;

    public String value() {
        return name();
    }

    public static OrigemDeficienciaEnum fromValue(String v) {
        return valueOf(v);
    }

}
