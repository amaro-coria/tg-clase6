package net.tecgurus.ws.impl;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.jws.WebService;

import net.tecgurus.business.CatalogoBusiness;
import net.tecgurus.catservice._1.CatGralAltaRequest;
import net.tecgurus.catservice._1.CatGralAltaResponse;
import net.tecgurus.catservice._1.CatGralData;
import net.tecgurus.catservice._1.CatGralModiRequest;
import net.tecgurus.catservice._1.CatGralModiResponse;
import net.tecgurus.catservice._1.CatGralRequest;
import net.tecgurus.catservice._1.CatGralResponse;
import net.tecgurus.catservice._1.CatServicePortType;
import net.tecgurus.catservice._1.StatusResponse;
import net.tecgurus.common.dto.CataDTO;

@WebService(serviceName = "catService", endpointInterface = "net.tecgurus.catservice._1.CatServicePortType", targetNamespace = "http://www.tecgurus.net/catService/1.0")
public class CatWSImpl implements CatServicePortType {
	
	@EJB
	private CatalogoBusiness businessCata;

	@Override
	public CatGralResponse listarCatalogoOperation(CatGralRequest catGralRequest) {
		CatGralResponse response = new CatGralResponse();
		StatusResponse st = new StatusResponse();
		st.setStatus("00");
		response.setStatus(st);
		
		List<CataDTO> list = businessCata.findAllDTO_1();
		List<CatGralData> listaAEntregar = new ArrayList<>();
		for(CataDTO d : list){
			CatGralData catalogo = new CatGralData();
			catalogo.setDescComp(d.getDscComCat());
			catalogo.setDescCort(d.getDscCorCat());
			catalogo.setIdCat(d.getIdCat());
			catalogo.setIdEstCat(d.getIdEstCat());
			listaAEntregar.add(catalogo);
		}
		
		response.setCatGralInfo(listaAEntregar);
		
		return response;
	}

	@Override
	public CatGralAltaResponse altaCatalogoOperation(CatGralAltaRequest catGralAltaRequest) {
		StatusResponse st = new StatusResponse();
		st.setStatus("00");
		CatGralAltaResponse response = new CatGralAltaResponse();
		response.setStatus(st);
		return response;
	}

	@Override
	public CatGralModiResponse modificacionCatalogoOperation(CatGralModiRequest catGralModiRequest) {
		StatusResponse st = new StatusResponse();
		st.setStatus("00");
		CatGralModiResponse response = new CatGralModiResponse();
		response.setStatus(st);
		return response;
	}

}
