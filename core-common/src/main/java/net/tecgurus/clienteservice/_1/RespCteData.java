
package net.tecgurus.clienteservice._1;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="status_ope" type="{http://www.tecgurus.net/clienteService/1.0}status_operation"/>
 *         &lt;element name="todos_clientes" type="{http://www.tecgurus.net/clienteService/1.0}data_cliente" maxOccurs="unbounded"/>
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
    "statusOpe",
    "todosClientes"
})
@XmlRootElement(name = "resp_cte_data")
public class RespCteData {

    @XmlElement(name = "status_ope", required = true)
    protected StatusOperation statusOpe;
    @XmlElement(name = "todos_clientes", required = true)
    protected List<DataCliente> todosClientes;

    /**
     * Obtiene el valor de la propiedad statusOpe.
     * 
     * @return
     *     possible object is
     *     {@link StatusOperation }
     *     
     */
    public StatusOperation getStatusOpe() {
        return statusOpe;
    }

    /**
     * Define el valor de la propiedad statusOpe.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusOperation }
     *     
     */
    public void setStatusOpe(StatusOperation value) {
        this.statusOpe = value;
    }

    /**
     * Gets the value of the todosClientes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the todosClientes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTodosClientes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DataCliente }
     * 
     * 
     */
    public List<DataCliente> getTodosClientes() {
        if (todosClientes == null) {
            todosClientes = new ArrayList<DataCliente>();
        }
        return this.todosClientes;
    }

	public void setTodosClientes(List<DataCliente> todosClientes) {
		this.todosClientes = todosClientes;
	}

}
