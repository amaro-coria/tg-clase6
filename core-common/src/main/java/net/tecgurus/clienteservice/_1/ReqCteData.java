
package net.tecgurus.clienteservice._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="status_init" type="{http://www.tecgurus.net/clienteService/1.0}status_operation"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "statusInit"
})
@XmlRootElement(name = "req_cte_data")
public class ReqCteData {

    @XmlElement(name = "status_init", required = true)
    protected StatusOperation statusInit;

    /**
     * Obtiene el valor de la propiedad statusInit.
     * 
     * @return
     *     possible object is
     *     {@link StatusOperation }
     *     
     */
    public StatusOperation getStatusInit() {
        return statusInit;
    }

    /**
     * Define el valor de la propiedad statusInit.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusOperation }
     *     
     */
    public void setStatusInit(StatusOperation value) {
        this.statusInit = value;
    }

}
