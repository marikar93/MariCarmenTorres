package es.IMFE.refugio.model.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import es.IMFE.refugio.model.Sexo;
import es.IMFE.refugio.model.dao.DaoException;
import es.IMFE.refugio.model.dao.SexoDao;

/**
 * Implementacion del dao
 * @author Mari
 *
 */
@Repository
public class SexoDaoImpl implements SexoDao{

	@Autowired
	private SessionFactory sessionFactory;
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Sexo> findAll() throws DaoException {
		List<Sexo> res = null;
		
		try{
			String hql = "FROM Sexo";
			res = sessionFactory.getCurrentSession().createQuery(hql).list();
			
		}catch (Exception e) {
			throw new DaoException(e);
		}
		
		return res;
	}

}
