
package br.com.senior.services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de opListaTurnoOutConsultar complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="opListaTurnoOutConsultar">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="desTrb" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="turTrb" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "opListaTurnoOutConsultar", propOrder = {
    "desTrb",
    "turTrb"
})
public class OpListaTurnoOutConsultar {

    @XmlElementRef(name = "desTrb", type = JAXBElement.class, required = false)
    protected JAXBElement<String> desTrb;
    @XmlElementRef(name = "turTrb", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> turTrb;

    /**
     * Obtém o valor da propriedade desTrb.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDesTrb() {
        return desTrb;
    }

    /**
     * Define o valor da propriedade desTrb.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDesTrb(JAXBElement<String> value) {
        this.desTrb = value;
    }

    /**
     * Obtém o valor da propriedade turTrb.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getTurTrb() {
        return turTrb;
    }

    /**
     * Define o valor da propriedade turTrb.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setTurTrb(JAXBElement<Integer> value) {
        this.turTrb = value;
    }

}
