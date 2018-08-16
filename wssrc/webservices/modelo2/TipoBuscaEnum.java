
package webservices.modelo2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tipoBuscaEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="tipoBuscaEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CODIGO"/>
 *     &lt;enumeration value="NOME"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "tipoBuscaEnum")
@XmlEnum
public enum TipoBuscaEnum {

    CODIGO,
    NOME;

    public String value() {
        return name();
    }

    public static TipoBuscaEnum fromValue(String v) {
        return valueOf(v);
    }

}
