package es.IMFE.refugio.model.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import es.IMFE.refugio.model.TipoUsuario;
import es.IMFE.refugio.model.dao.DaoException;
import es.IMFE.refugio.model.dao.TipoUsuarioDao;

/**
 * Implementacion del dao
 * @author Mari
 *
 */
@Repository
public class TipoUsuarioDaoImpl implements TipoUsuarioDao{
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@SuppressWarnings("unchecked")
	@Override
	public List<TipoUsuario> findAll() throws DaoException {
		List<TipoUsuario> res = null;
		
		try{
			String hql = "FROM TipoUsuario";
			res = sessionFactory.getCurrentSession().createQuery(hql).list();
			
		}catch (Exception e) {
			throw new DaoException(e);
		}
		
		return res;
	}

}
