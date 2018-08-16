
package webservices.modelo2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for historicoPPP.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="historicoPPP">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="EXIBIR"/>
 *     &lt;enumeration value="NAO_EXIBIR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "historicoPPP")
@XmlEnum
public enum HistoricoPPP {

    EXIBIR,
    NAO_EXIBIR;

    public String value() {
        return name();
    }

    public static HistoricoPPP fromValue(String v) {
        return valueOf(v);
    }

}
