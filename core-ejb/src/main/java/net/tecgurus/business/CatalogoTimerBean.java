package net.tecgurus.business;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Schedule;
import javax.ejb.Stateless;

import net.tecgurus.common.dto.CataDTO;

/**
 * Session Bean implementation class CatalogoTimerBean
 */
@Stateless
@LocalBean
public class CatalogoTimerBean {

	@EJB
	private CatalogoBusiness businessCatalogo;

	@Schedule(second="*/3" , persistent = false)
	public void invocacion() {
		for (CataDTO d : businessCatalogo.findAllDTO_1()) {
			System.out.println(d.toString());
		}
	}

}
