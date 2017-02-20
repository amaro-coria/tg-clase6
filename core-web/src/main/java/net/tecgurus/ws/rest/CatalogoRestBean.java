package net.tecgurus.ws.rest;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import net.tecgurus.business.CatalogoBusiness;
import net.tecgurus.common.dto.CataDTO;

/**
 * Session Bean implementation class CatalogoRestBean
 */
@Stateless
@LocalBean
@Path("/catalogo/")
public class CatalogoRestBean {

	@EJB
	private CatalogoBusiness businessCatalogo;

	@POST
	@Path("/findById/{id}")
	@Produces("application/json" )
	public CataDTO findById(@PathParam("id") int id) {
		List<CataDTO> list = businessCatalogo.findAllDTO_1();
		for (CataDTO d : list) {
			if (d.getIdCat() == id) {
				return d;
			}
		}
		return null;
	}

}
