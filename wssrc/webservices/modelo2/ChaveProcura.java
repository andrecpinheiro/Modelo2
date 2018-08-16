
package webservices.modelo2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for chaveProcura.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="chaveProcura">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CODIGO"/>
 *     &lt;enumeration value="MATRICULA"/>
 *     &lt;enumeration value="CPF"/>
 *     &lt;enumeration value="DATA_NASCIMENTO"/>
 *     &lt;enumeration value="CPF_PENDENTE"/>
 *     &lt;enumeration value="CPF_ATIVO"/>
 *     &lt;enumeration value="CPF_DATA_ADMISSAO"/>
 *     &lt;enumeration value="CPF_DATA_ADMISSAO_PERIODO"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "chaveProcura")
@XmlEnum
public enum ChaveProcura {

    CODIGO,
    MATRICULA,
    CPF,
    DATA_NASCIMENTO,
    CPF_PENDENTE,
    CPF_ATIVO,
    CPF_DATA_ADMISSAO,
    CPF_DATA_ADMISSAO_PERIODO;

    public String value() {
        return name();
    }

    public static ChaveProcura fromValue(String v) {
        return valueOf(v);
    }

}
