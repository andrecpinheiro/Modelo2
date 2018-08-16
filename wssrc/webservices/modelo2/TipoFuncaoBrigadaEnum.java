
package webservices.modelo2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tipoFuncaoBrigadaEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="tipoFuncaoBrigadaEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="EM_BRANCO"/>
 *     &lt;enumeration value="COORDENADOR_GERAL"/>
 *     &lt;enumeration value="LIDER"/>
 *     &lt;enumeration value="CHEFE_DE_BRIGADA"/>
 *     &lt;enumeration value="BRIGADISTA"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "tipoFuncaoBrigadaEnum")
@XmlEnum
public enum TipoFuncaoBrigadaEnum {

    EM_BRANCO,
    COORDENADOR_GERAL,
    LIDER,
    CHEFE_DE_BRIGADA,
    BRIGADISTA;

    public String value() {
        return name();
    }

    public static TipoFuncaoBrigadaEnum fromValue(String v) {
        return valueOf(v);
    }

}
