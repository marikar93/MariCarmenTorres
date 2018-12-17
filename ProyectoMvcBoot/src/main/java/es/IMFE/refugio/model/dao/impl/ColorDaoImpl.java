package es.IMFE.refugio.model.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import es.IMFE.refugio.model.Color;
import es.IMFE.refugio.model.dao.ColorDao;
import es.IMFE.refugio.model.dao.DaoException;

/**
 * Implementacion del dao
 * @author Mari
 *
 */
@Repository
public class ColorDaoImpl implements ColorDao{

	@Autowired
	private SessionFactory sessionFactory;
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Color> findAll() throws DaoException {
		List<Color> res = null;
		
		try{
			String hql = "FROM Color";
			res = sessionFactory.getCurrentSession().createQuery(hql).list();
			
		}catch (Exception e) {
			throw new DaoException(e);
		}
		
		return res;
	}

}
