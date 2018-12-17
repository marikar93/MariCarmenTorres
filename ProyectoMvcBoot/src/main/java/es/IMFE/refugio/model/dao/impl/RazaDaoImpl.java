package es.IMFE.refugio.model.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import es.IMFE.refugio.model.Raza;
import es.IMFE.refugio.model.dao.DaoException;
import es.IMFE.refugio.model.dao.RazaDao;

/**
 * Implementacion del dao
 * @author Mari
 *
 */
@Repository
public class RazaDaoImpl implements RazaDao{

	@Autowired
	private SessionFactory sessionFactory;
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Raza> findAll() throws DaoException {
		List<Raza> res = null;
		
		try{
			String hql = "FROM Raza";
			res = sessionFactory.getCurrentSession().createQuery(hql).list();
			
		}catch (Exception e) {
			throw new DaoException(e);
		}
		
		return res;
	}
	
	

}
