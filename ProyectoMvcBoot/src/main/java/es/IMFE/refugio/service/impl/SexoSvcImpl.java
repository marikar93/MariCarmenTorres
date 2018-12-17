package es.IMFE.refugio.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import es.IMFE.refugio.model.Sexo;
import es.IMFE.refugio.model.dao.SexoDao;
import es.IMFE.refugio.service.SexoSvc;
import es.IMFE.refugio.service.SvcException;

/**
 * Implementacion del servicio
 * @author Mari
 *
 */
@Service
@Transactional
public class SexoSvcImpl implements SexoSvc{

	@Autowired
	private SexoDao dao;
	
	@Override
	public List<Sexo> listar() throws SvcException {
		try {
			return dao.findAll();
		} catch (Exception e) {
			throw new SvcException(e);
		}
	}

}
