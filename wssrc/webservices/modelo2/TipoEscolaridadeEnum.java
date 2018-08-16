
package webservices.modelo2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tipoEscolaridadeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="tipoEscolaridadeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="EM_BRANCO"/>
 *     &lt;enumeration value="ENSINO_FUNDAMENTAL_INCOMPLETO"/>
 *     &lt;enumeration value="ENSINO_FUNDAMENTAL_COMPLETO"/>
 *     &lt;enumeration value="ENSINO_MEDIO_INCOMPLETO"/>
 *     &lt;enumeration value="ENSINO_MEDIO_COMPLETO"/>
 *     &lt;enumeration value="ENSINO_SUPERIOR_INCOMPLETO"/>
 *     &lt;enumeration value="ENSINO_SUPERIOR_COMPLETO"/>
 *     &lt;enumeration value="PROFISSIONALIZANTE"/>
 *     &lt;enumeration value="TECNICO_INCOMPLETO"/>
 *     &lt;enumeration value="TECNICO_COMPLETO"/>
 *     &lt;enumeration value="TECNOLOGO_INCOMPLETO"/>
 *     &lt;enumeration value="TECNOLOGO_COMPLETO"/>
 *     &lt;enumeration value="POS_GRADUACAO_INCOMPLETA"/>
 *     &lt;enumeration value="POS_GRADUACAO_COMPLETA"/>
 *     &lt;enumeration value="MESTRADO_INCOMPLETO"/>
 *     &lt;enumeration value="MESTRADO_COMPLETO"/>
 *     &lt;enumeration value="DOUTORADO_INCOMPLETO"/>
 *     &lt;enumeration value="DOUTORADO_COMPLETO"/>
 *     &lt;enumeration value="PHD_INCOMPLETO"/>
 *     &lt;enumeration value="PHD_COMPLETO"/>
 *     &lt;enumeration value="NAO_INFORMADO"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "tipoEscolaridadeEnum")
@XmlEnum
public enum TipoEscolaridadeEnum {

    EM_BRANCO,
    ENSINO_FUNDAMENTAL_INCOMPLETO,
    ENSINO_FUNDAMENTAL_COMPLETO,
    ENSINO_MEDIO_INCOMPLETO,
    ENSINO_MEDIO_COMPLETO,
    ENSINO_SUPERIOR_INCOMPLETO,
    ENSINO_SUPERIOR_COMPLETO,
    PROFISSIONALIZANTE,
    TECNICO_INCOMPLETO,
    TECNICO_COMPLETO,
    TECNOLOGO_INCOMPLETO,
    TECNOLOGO_COMPLETO,
    POS_GRADUACAO_INCOMPLETA,
    POS_GRADUACAO_COMPLETA,
    MESTRADO_INCOMPLETO,
    MESTRADO_COMPLETO,
    DOUTORADO_INCOMPLETO,
    DOUTORADO_COMPLETO,
    PHD_INCOMPLETO,
    PHD_COMPLETO,
    NAO_INFORMADO;

    public String value() {
        return name();
    }

    public static TipoEscolaridadeEnum fromValue(String v) {
        return valueOf(v);
    }

}
