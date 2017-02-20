package net.tecgurus.dao.impl;

import java.util.List;
import java.util.UUID;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import net.tecgurus.dao.CatalogoGeneralDAO_1;
import net.tecgurus.entities.CatalogoGeneral;

/**
 * Session Bean implementation class CatalogoGeneralDAOBean_1
 */
@Stateless
public class CatalogoGeneralDAOBean_1 implements CatalogoGeneralDAO_1 {

	@PersistenceContext
	private EntityManager em;
	@EJB
	private CatalogoGeneralDAO_1 thisBean;

	/*
	 * 1 - Find all 1.1 - Query 1.2 - Typed Query 1.3 - NAmed Query 1.4 NAtive
	 * Query 2 - findByXXX RCUD
	 */
	@Override
	public List<CatalogoGeneral> findAllByQuery() {
		// 1 Definimos el query en jpql
		String jpql = "Select c From CatalogoGeneral c";
		Query query = em.createQuery(jpql);
		List<CatalogoGeneral> list = query.getResultList();
		return list;
	}

	@Override
	public List<CatalogoGeneral> findAllByTypedQuery() {
		// 1 Definimos el query en jpql
		String jpql = "Select c From CatalogoGeneral c";
		TypedQuery<CatalogoGeneral> query = em.createQuery(jpql, CatalogoGeneral.class);
		List<CatalogoGeneral> list = query.getResultList();
		return list;
	}

	@Override
	public List<CatalogoGeneral> findAllByNamedQuery() {
		String queryName = "CatalogoGeneral.findAll";
		TypedQuery<CatalogoGeneral> tquery = em.createNamedQuery(queryName, CatalogoGeneral.class);
		List<CatalogoGeneral> list = tquery.getResultList();
		return list;
	}

	@Override
	public List<CatalogoGeneral> findAllByNativeQuery() {
		String sql = "select * from Catalogo_General";
		Query q = em.createNativeQuery(sql);
		List<CatalogoGeneral> list = q.getResultList();
		return list;
	}
	
	//Finaliza el paso 1
	//Paso 2
	
	@Override
	public List<CatalogoGeneral> findByDscComCat(String param){
		String jpsql = "SELECT c FROM CatalogoGeneral c WHERE c.dscComCat like :param1";
		TypedQuery<CatalogoGeneral> tq = em.createQuery(jpsql, CatalogoGeneral.class);
		tq.setParameter("param1", param);
		List<CatalogoGeneral> list = tq.getResultList();
		return list;
	}
	
	@Override
	public CatalogoGeneral findById(Integer id){
		CatalogoGeneral entity = em.find(CatalogoGeneral.class, id);
		return entity;
	}
	
	@Override
	@TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
	public void createCatalogoGeneral(CatalogoGeneral c){
		//primer metodo transaccional
		c.setDscComCat(c.getDscComCat() + "_00");
		c.setDscCorCat(c.getDscCorCat() + "_00");
		thisBean.metodoTransaccionalAnidado(c);
		//segundo metodo transaccional, si ocurre error aqui debe dar rollback
		int numRandom = UUID.randomUUID().clockSequence();
		if(numRandom %2 == 0){
			throw new RuntimeException("RollbackException");
		}
		em.persist(c);
	}
	
	@Override
	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	public void metodoTransaccionalAnidado(CatalogoGeneral c){
		em.persist(c);
	}
	
	@Override
	public void updateCatalogoGeneral(CatalogoGeneral c){
		em.merge(c);
	}
	
	@Override
	public void removeCatalogoGeneral(CatalogoGeneral c){
		em.remove(c);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
