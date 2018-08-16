
package webservices.modelo2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for classificacaoDeficienciaEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="classificacaoDeficienciaEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DEFICIENCIA_FISICA"/>
 *     &lt;enumeration value="DEFICIENCIA_AUDITIVA"/>
 *     &lt;enumeration value="DEFICIENCIA_VISUAL"/>
 *     &lt;enumeration value="DEFICIENCIA_MENTAL"/>
 *     &lt;enumeration value="DEFICIENCIA_MULTIPLA"/>
 *     &lt;enumeration value="REABILITACAO"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "classificacaoDeficienciaEnum")
@XmlEnum
public enum ClassificacaoDeficienciaEnum {

    DEFICIENCIA_FISICA,
    DEFICIENCIA_AUDITIVA,
    DEFICIENCIA_VISUAL,
    DEFICIENCIA_MENTAL,
    DEFICIENCIA_MULTIPLA,
    REABILITACAO;

    public String value() {
        return name();
    }

    public static ClassificacaoDeficienciaEnum fromValue(String v) {
        return valueOf(v);
    }

}
