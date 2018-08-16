
package webservices.modelo2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tipoCategoriaEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="tipoCategoriaEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="EM_BRANCO"/>
 *     &lt;enumeration value="CONTRIB_INDIVIDUAL_AUTONOMO_CONTRATADO_EMPRESAS_GERAL"/>
 *     &lt;enumeration value="CONTRIB_INDIVIDUAL_AUTONOMO_CONTRATADO_CONTRIB_INDIVIDUAL_PESSOA_FISICA_OU_MISSAO_DIPLOMATICA_E_REPARTICAO_CONSULAR_ESTRANGEIRAS"/>
 *     &lt;enumeration value="CONTRIB_INDIVIDUAL_AUTONOMO_CONTRATADO_ENTIDADE_BENEFICENTE_ISENTA_COTA_PATRONAL"/>
 *     &lt;enumeration value="EXCLUIDO"/>
 *     &lt;enumeration value="CONTRIB_INDIVIDUAL_TRANSPORTADOR_AUTONOMO_CONTRATADO_EMPRESAS_GERAL"/>
 *     &lt;enumeration value="CONTRIB_INDIVIDUAL_TRANSPORTADOR_AUTONOMO_CONTRATADO_CONTRIB_INDIVIDUAL_PESSOA_FISICA_OU_MISSAO_DIPLOMATICA_E_REPARTICAO_CONSULAR_ESTRANGEIRAS"/>
 *     &lt;enumeration value="CONTRIB_INDIVIDUAL_TRANSPORTADOR_AUTONOMO_CONTRATADO_ENTIDADE_BENEFICENTE_ISENTA_COTA_PATRONAL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "tipoCategoriaEnum")
@XmlEnum
public enum TipoCategoriaEnum {

    EM_BRANCO,
    CONTRIB_INDIVIDUAL_AUTONOMO_CONTRATADO_EMPRESAS_GERAL,
    CONTRIB_INDIVIDUAL_AUTONOMO_CONTRATADO_CONTRIB_INDIVIDUAL_PESSOA_FISICA_OU_MISSAO_DIPLOMATICA_E_REPARTICAO_CONSULAR_ESTRANGEIRAS,
    CONTRIB_INDIVIDUAL_AUTONOMO_CONTRATADO_ENTIDADE_BENEFICENTE_ISENTA_COTA_PATRONAL,
    EXCLUIDO,
    CONTRIB_INDIVIDUAL_TRANSPORTADOR_AUTONOMO_CONTRATADO_EMPRESAS_GERAL,
    CONTRIB_INDIVIDUAL_TRANSPORTADOR_AUTONOMO_CONTRATADO_CONTRIB_INDIVIDUAL_PESSOA_FISICA_OU_MISSAO_DIPLOMATICA_E_REPARTICAO_CONSULAR_ESTRANGEIRAS,
    CONTRIB_INDIVIDUAL_TRANSPORTADOR_AUTONOMO_CONTRATADO_ENTIDADE_BENEFICENTE_ISENTA_COTA_PATRONAL;

    public String value() {
        return name();
    }

    public static TipoCategoriaEnum fromValue(String v) {
        return valueOf(v);
    }

}
