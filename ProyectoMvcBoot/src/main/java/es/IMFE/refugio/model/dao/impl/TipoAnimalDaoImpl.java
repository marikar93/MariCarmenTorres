package es.IMFE.refugio.model.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import es.IMFE.refugio.model.TipoAnimal;
import es.IMFE.refugio.model.dao.DaoException;
import es.IMFE.refugio.model.dao.TipoAnimalDao;

/**
 * Implementacion del dao
 * @author Mari
 *
 */
@Repository
public class TipoAnimalDaoImpl implements TipoAnimalDao{
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@SuppressWarnings("unchecked")
	@Override
	public List<TipoAnimal> findAll() throws DaoException {
		List<TipoAnimal> res = null;
		
		try{
			String hql = "FROM TipoAnimal";
			res = sessionFactory.getCurrentSession().createQuery(hql).list();
			
		}catch (Exception e) {
			throw new DaoException(e);
		}
		
		return res;
	}

}
