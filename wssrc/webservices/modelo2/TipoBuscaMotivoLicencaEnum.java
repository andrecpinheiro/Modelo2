
package webservices.modelo2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tipoBuscaMotivoLicencaEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="tipoBuscaMotivoLicencaEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CODIGO"/>
 *     &lt;enumeration value="CODIGO_INTEGRACAO"/>
 *     &lt;enumeration value="NOME"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "tipoBuscaMotivoLicencaEnum")
@XmlEnum
public enum TipoBuscaMotivoLicencaEnum {

    CODIGO,
    CODIGO_INTEGRACAO,
    NOME;

    public String value() {
        return name();
    }

    public static TipoBuscaMotivoLicencaEnum fromValue(String v) {
        return valueOf(v);
    }

}
