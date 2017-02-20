
package net.tecgurus.clienteservice._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para data_cliente complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="data_cliente">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id_cte" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nom_cte" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ape_p_cte" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ape_m_cte" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "data_cliente", propOrder = {
    "idCte",
    "nomCte",
    "apePCte",
    "apeMCte"
})
public class DataCliente {

    @XmlElement(name = "id_cte")
    protected int idCte;
    @XmlElement(name = "nom_cte", required = true)
    protected String nomCte;
    @XmlElement(name = "ape_p_cte", required = true)
    protected String apePCte;
    @XmlElement(name = "ape_m_cte", required = true)
    protected String apeMCte;

    /**
     * Obtiene el valor de la propiedad idCte.
     * 
     */
    public int getIdCte() {
        return idCte;
    }

    /**
     * Define el valor de la propiedad idCte.
     * 
     */
    public void setIdCte(int value) {
        this.idCte = value;
    }

    /**
     * Obtiene el valor de la propiedad nomCte.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomCte() {
        return nomCte;
    }

    /**
     * Define el valor de la propiedad nomCte.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomCte(String value) {
        this.nomCte = value;
    }

    /**
     * Obtiene el valor de la propiedad apePCte.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApePCte() {
        return apePCte;
    }

    /**
     * Define el valor de la propiedad apePCte.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApePCte(String value) {
        this.apePCte = value;
    }

    /**
     * Obtiene el valor de la propiedad apeMCte.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApeMCte() {
        return apeMCte;
    }

    /**
     * Define el valor de la propiedad apeMCte.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApeMCte(String value) {
        this.apeMCte = value;
    }

}
