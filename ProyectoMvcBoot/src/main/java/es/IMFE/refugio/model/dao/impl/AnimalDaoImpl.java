package es.IMFE.refugio.model.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import es.IMFE.refugio.model.Animal;
import es.IMFE.refugio.model.TipoAnimal;
import es.IMFE.refugio.model.dao.AnimalDao;
import es.IMFE.refugio.model.dao.DaoException;

/**
 * Implementacion del dao
 * @author Mari
 *
 */
@Repository
public class AnimalDaoImpl implements AnimalDao{

	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public void save(Animal animal) throws DaoException {
		try{
			sessionFactory.getCurrentSession().save(animal);	
		}catch (Exception e){
			throw new DaoException(e);
		}
		
	}

	@Override
	public void update(Animal animal) throws DaoException {
		try{
			sessionFactory.getCurrentSession().update(animal);
		}catch (Exception e) {
			throw new DaoException(e);
		}
		
	}

	@Override
	public void delete(Animal animal) throws DaoException {
		try{
			sessionFactory.getCurrentSession().delete(animal);
		}catch (Exception e) {
			throw new DaoException(e);
		}
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Animal> findAll() throws DaoException {
		List<Animal> res = null;
		
		try{
			String hql = "FROM Animal";
			res = sessionFactory.getCurrentSession().createQuery(hql).list();
			
		}catch (Exception e) {
			throw new DaoException(e);
		}
		
		return res;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Animal> findAllWithoutAdop() throws DaoException {
		List<Animal> res = null;
		
		try{
			String hql = "FROM Animal a WHERE a.fechaAdopcion is null AND a.usuario is null";
			res = sessionFactory.getCurrentSession().createQuery(hql).list();
			
		}catch (Exception e) {
			throw new DaoException(e);
		}
		
		return res;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Animal> findAllWithAdop() throws DaoException {
		List<Animal> res = null;
		
		try{
			String hql = "FROM Animal a WHERE not (a.fechaAdopcion is null) AND not (a.usuario is null)";
			res = sessionFactory.getCurrentSession().createQuery(hql).list();
			
		}catch (Exception e) {
			throw new DaoException(e);
		}
		
		return res;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Animal> findByTipo(TipoAnimal tipo) throws DaoException {
		List<Animal> res = null;
		
		try{
			String hql = "FROM Animal a WHERE a.tipo = " + tipo;
			res = sessionFactory.getCurrentSession().createQuery(hql).list();
			
		}catch (Exception e) {
			throw new DaoException(e);
		}
		
		return res;
		
	}

	@Override
	public Animal findById(int id) throws DaoException {
		Animal res = null;
		
		try{
			String hql = "FROM Animal a WHERE a.idanimales = " + id;
			res = (Animal) sessionFactory.getCurrentSession().createQuery(hql).uniqueResult();
			
		}catch (Exception e) {
			throw new DaoException(e);
		}
		
		return res;
	}

}
