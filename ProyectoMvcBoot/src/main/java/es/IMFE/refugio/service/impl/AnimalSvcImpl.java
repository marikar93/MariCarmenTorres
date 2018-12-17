package es.IMFE.refugio.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import es.IMFE.refugio.model.Animal;
import es.IMFE.refugio.model.TipoAnimal;
import es.IMFE.refugio.model.dao.AnimalDao;
import es.IMFE.refugio.service.AnimalSvc;
import es.IMFE.refugio.service.SvcException;

/**
 * Implementacion del servicio
 * @author Mari
 *
 */
@Service
@Transactional
public class AnimalSvcImpl implements AnimalSvc{
	
	@Autowired
	private AnimalDao dao;

	@Transactional (propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
	@Override
	public void guardar(Animal animal) throws SvcException {
		try {
			dao.save(animal);
		} catch (Exception e) {
			throw new SvcException(e);
		}
		
	}

	@Transactional (propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
	@Override
	public void modificar(Animal animal) throws SvcException {
		try {
			dao.update(animal);
		} catch (Exception e) {
			throw new SvcException(e);
		}
		
	}

	@Transactional (propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
	@Override
	public void borrar(Animal animal) throws SvcException {
		try {
			dao.delete(animal);
		} catch (Exception e) {
			throw new SvcException(e);
		}
		
	}

	@Override
	public List<Animal> listar() throws SvcException {
		try {
			return dao.findAll();
		} catch (Exception e) {
			throw new SvcException(e);
		}
	}
	
	@Override
	public List<Animal> listarSinAdop() throws SvcException {
		try {
			return dao.findAllWithoutAdop();
		} catch (Exception e) {
			throw new SvcException(e);
		}
	}
	
	@Override
	public List<Animal> listarAdop() throws SvcException {
		try {
			return dao.findAllWithAdop();
		} catch (Exception e) {
			throw new SvcException(e);
		}
	}

	

	@Override
	public List<Animal> buscarPorTipo(TipoAnimal tipo) throws SvcException {
		try {
			return dao.findByTipo(tipo);
		} catch (Exception e) {
			throw new SvcException(e);
		}
	}

	@Override
	public Animal buscarPorId(int id) throws SvcException {
		try {
			return dao.findById(id);
		} catch (Exception e) {
			throw new SvcException(e);
		}
	}

	
	

}
