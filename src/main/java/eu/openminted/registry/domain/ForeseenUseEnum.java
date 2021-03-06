
package eu.openminted.registry.domain;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for null.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;maxLength value="30"/&gt;
 *     &lt;enumeration value="humanUse"/&gt;
 *     &lt;enumeration value="nlpApplications"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "")
@XmlEnum
public enum ForeseenUseEnum {

    @XmlEnumValue("humanUse")
    HUMAN_USE("humanUse"),
    @XmlEnumValue("nlpApplications")
    NLP_APPLICATIONS("nlpApplications");
    private final String value;

    ForeseenUseEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ForeseenUseEnum fromValue(String v) {
        for (ForeseenUseEnum c: ForeseenUseEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
