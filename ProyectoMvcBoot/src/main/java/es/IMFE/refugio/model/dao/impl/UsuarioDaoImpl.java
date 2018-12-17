package es.IMFE.refugio.model.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import es.IMFE.refugio.model.Usuario;
import es.IMFE.refugio.model.dao.DaoException;
import es.IMFE.refugio.model.dao.UsuarioDao;

/**
 * Implementacion del dao
 * @author Mari
 *
 */
@Repository
public class UsuarioDaoImpl implements UsuarioDao{

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public void save(Usuario usuario) throws DaoException {
		try{
			sessionFactory.getCurrentSession().save(usuario);	
		}catch (Exception ex){
			throw new DaoException(ex);
		}
		
	}

	@Override
	public void update(Usuario usuario) throws DaoException {
		try{
			sessionFactory.getCurrentSession().update(usuario);	
		}catch (Exception ex){
			throw new DaoException(ex);
		}
		
	}

	@Override
	public void delete(Usuario usuario) throws DaoException {
		try{
			sessionFactory.getCurrentSession().delete(usuario);	
		}catch (Exception ex){
			throw new DaoException(ex);
		}	
	}

	@Override
	public Usuario findById(int id) throws DaoException {
		Usuario res = null;
		
		try{
			String hql = "FROM Usuario u WHERE u.idusuario = " + id;
			res = (Usuario) sessionFactory.getCurrentSession().createQuery(hql).uniqueResult();
			
		}catch (Exception e) {
			throw new DaoException(e);
		}
		
		return res;
	}

	@Override
	public Usuario findByUserAndPass(String user, String pass) throws DaoException {
		Usuario res = null;
		
		try{					
			String hql = "FROM Usuario u WHERE u.user=:user " +
						 "AND u.pass=:pass";
			res = (Usuario) sessionFactory.getCurrentSession().createQuery(hql).
					setParameter("user", user).
					setParameter("pass", pass).
					uniqueResult();
			
		}catch (Exception e) {
			throw new DaoException(e);
		}
		
		return res;
	}

	@Override
	public Usuario findByDni(String dni) throws DaoException {
		Usuario res = null;
		
		try{					
			String hql = "FROM Usuario u WHERE u.dni=:dni";
			res = (Usuario) sessionFactory.getCurrentSession().createQuery(hql).
					setParameter("dni", dni).
					uniqueResult();
			
		}catch (Exception e) {
			throw new DaoException(e);
		}
		
		return res;
	}

}
