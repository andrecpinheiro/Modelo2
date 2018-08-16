
package webservices.modelo2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tipoContratacaoEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="tipoContratacaoEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CLT"/>
 *     &lt;enumeration value="COOPERADO"/>
 *     &lt;enumeration value="TERCERIZADO"/>
 *     &lt;enumeration value="AUTONOMO"/>
 *     &lt;enumeration value="TEMPORARIO"/>
 *     &lt;enumeration value="PESSOA_JURIDICA"/>
 *     &lt;enumeration value="ESTAGIARIO"/>
 *     &lt;enumeration value="MENOR_APRENDIZ"/>
 *     &lt;enumeration value="ESTATUTARIO"/>
 *     &lt;enumeration value="COMISSIONADO_INTERNO"/>
 *     &lt;enumeration value="COMISSIONADO_EXTERNO"/>
 *     &lt;enumeration value="APOSENTADO"/>
 *     &lt;enumeration value="APOSENTADO_INATIVO_PREFEITURA"/>
 *     &lt;enumeration value="PENSIONISTA"/>
 *     &lt;enumeration value="SERVIDOR_PUBLICO_EFETIVO"/>
 *     &lt;enumeration value="EXTRANUMERARIO"/>
 *     &lt;enumeration value="AUTARQUICO"/>
 *     &lt;enumeration value="INATIVO"/>
 *     &lt;enumeration value="TITULO_PRECARIO"/>
 *     &lt;enumeration value="SERVIDOR_ADM_CENTRALIZADA_OU_DESCENTRALIZADA"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "tipoContratacaoEnum")
@XmlEnum
public enum TipoContratacaoEnum {

    CLT,
    COOPERADO,
    TERCERIZADO,
    AUTONOMO,
    TEMPORARIO,
    PESSOA_JURIDICA,
    ESTAGIARIO,
    MENOR_APRENDIZ,
    ESTATUTARIO,
    COMISSIONADO_INTERNO,
    COMISSIONADO_EXTERNO,
    APOSENTADO,
    APOSENTADO_INATIVO_PREFEITURA,
    PENSIONISTA,
    SERVIDOR_PUBLICO_EFETIVO,
    EXTRANUMERARIO,
    AUTARQUICO,
    INATIVO,
    TITULO_PRECARIO,
    SERVIDOR_ADM_CENTRALIZADA_OU_DESCENTRALIZADA;

    public String value() {
        return name();
    }

    public static TipoContratacaoEnum fromValue(String v) {
        return valueOf(v);
    }

}
