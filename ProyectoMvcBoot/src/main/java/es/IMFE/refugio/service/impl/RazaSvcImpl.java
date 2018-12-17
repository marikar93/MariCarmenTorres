package es.IMFE.refugio.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import es.IMFE.refugio.model.Raza;
import es.IMFE.refugio.model.dao.RazaDao;
import es.IMFE.refugio.service.RazaSvc;
import es.IMFE.refugio.service.SvcException;

/**
 * Implementacion del servicio
 * @author Mari
 *
 */
@Service
@Transactional
public class RazaSvcImpl implements RazaSvc {

	@Autowired
	private RazaDao dao;

	@Override
	public List<Raza> listar() throws SvcException {
		try {
			return dao.findAll();
		} catch (Exception e) {
			throw new SvcException(e);
		}
	}

	
}
