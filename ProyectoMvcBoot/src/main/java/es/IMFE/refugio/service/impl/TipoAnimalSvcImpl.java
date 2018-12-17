package es.IMFE.refugio.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import es.IMFE.refugio.model.TipoAnimal;
import es.IMFE.refugio.model.dao.TipoAnimalDao;
import es.IMFE.refugio.service.SvcException;
import es.IMFE.refugio.service.TipoAnimalSvc;

/**
 * Implementacion del servicio
 * @author Mari
 *
 */
@Service
@Transactional
public class TipoAnimalSvcImpl implements TipoAnimalSvc{

	@Autowired
	private TipoAnimalDao dao;
	
	@Override
	public List<TipoAnimal> listar() throws SvcException {
		try {
			return dao.findAll();
		} catch (Exception e) {
			throw new SvcException(e);
		}
	}
	

}
