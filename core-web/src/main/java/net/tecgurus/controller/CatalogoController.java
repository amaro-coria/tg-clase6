package net.tecgurus.controller;

import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import org.primefaces.event.SelectEvent;

import net.tecgurus.MessageConstants;
import net.tecgurus.business.CatalogoBusiness;
import net.tecgurus.common.dto.CataDTO;

@ManagedBean(name = "catalogoCtrl")
public class CatalogoController  extends GenericController{

	private List<CataDTO> listElements;
	@EJB
	private CatalogoBusiness business;

	private String descCorta;
	private String descComp;
	private Date fchCrea;
	private Date fchModi;
	private Integer idEstatus;
	private CataDTO currentElement;
	// inputs para campos de edicion
	private String editDescCorta;
	private String editDescComp;
	private Date editFecha;

	@PostConstruct
	private void init() {
		currentElement = new CataDTO();
		listElements = business.findAllDTO_1();
	}

	public void onSelect(SelectEvent evt) {
		CataDTO dto = (CataDTO) evt.getObject();
		System.out.println(dto);
	}

	public String validate(){
		System.out.println("validate");
		return "";
	}
	
	public String save() {
		// Llenar el DTO y enviarlo al metodo de guardado en el negocio
		CataDTO dto = new CataDTO();
		dto.setDscComCat(descComp);
		dto.setDscCorCat(descCorta);
		dto.setFchCre(fchCrea);
		business.createNewRecord(dto);
		// Enviar notificacion
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Guardado exitoso"));
		listElements = business.findAllDTO_1();
		return "";
	}

	public String edit() {
		System.out.println("A punto de enviar actualizacion");
		System.out.println(currentElement);
		System.out.println(editDescComp);
		System.out.println(editDescCorta);
		System.out.println(editFecha);
		return "";
	}
	
	public String delete(){
		System.out.println("Delete presionado");
		return "";
	}

	public String cancel() {
		super.addInfoMessage(MessageConstants.MENSAJE_CANCELADO_PARA_INFO);
		super.addWarningMessage(MessageConstants.MENSAJE_CANCELADO_PARA_INFO);
		//FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Accion cancelada"));
		return "";
	}

	// GETTERS & SETTERS

	public List<CataDTO> getListElements() {
		return listElements;
	}

	public void setListElements(List<CataDTO> listElements) {
		this.listElements = listElements;
	}

	public String getDescCorta() {
		return descCorta;
	}

	public void setDescCorta(String descCorta) {
		this.descCorta = descCorta;
	}

	public String getDescComp() {
		return descComp;
	}

	public void setDescComp(String descComp) {
		this.descComp = descComp;
	}

	public Date getFchCrea() {
		return fchCrea;
	}

	public void setFchCrea(Date fchCrea) {
		this.fchCrea = fchCrea;
	}

	public Date getFchModi() {
		return fchModi;
	}

	public void setFchModi(Date fchModi) {
		this.fchModi = fchModi;
	}

	public Integer getIdEstatus() {
		return idEstatus;
	}

	public void setIdEstatus(Integer idEstatus) {
		this.idEstatus = idEstatus;
	}

	public CataDTO getCurrentElement() {
		return currentElement;
	}

	public void setCurrentElement(CataDTO currentElement) {
		this.currentElement = currentElement;
	}

	public String getEditDescCorta() {
		return editDescCorta;
	}

	public void setEditDescCorta(String editDescCorta) {
		this.editDescCorta = editDescCorta;
	}

	public String getEditDescComp() {
		return editDescComp;
	}

	public void setEditDescComp(String editDescComp) {
		this.editDescComp = editDescComp;
	}

	public Date getEditFecha() {
		return editFecha;
	}

	public void setEditFecha(Date editFecha) {
		this.editFecha = editFecha;
	}

}
