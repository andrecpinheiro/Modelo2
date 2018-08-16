
package webservices.modelo2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for situacaoFuncionario.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="situacaoFuncionario">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ATIVO"/>
 *     &lt;enumeration value="AFASTADO"/>
 *     &lt;enumeration value="PENDENTE"/>
 *     &lt;enumeration value="FERIAS"/>
 *     &lt;enumeration value="INATIVO"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "situacaoFuncionario")
@XmlEnum
public enum SituacaoFuncionario {

    ATIVO,
    AFASTADO,
    PENDENTE,
    FERIAS,
    INATIVO;

    public String value() {
        return name();
    }

    public static SituacaoFuncionario fromValue(String v) {
        return valueOf(v);
    }

}
