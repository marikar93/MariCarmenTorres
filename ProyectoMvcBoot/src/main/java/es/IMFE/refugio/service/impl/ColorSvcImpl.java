package es.IMFE.refugio.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import es.IMFE.refugio.model.Color;
import es.IMFE.refugio.model.dao.ColorDao;
import es.IMFE.refugio.service.ColorSvc;
import es.IMFE.refugio.service.SvcException;

/**
 * Implementacion del servicio
 * @author Mari
 *
 */
@Service
@Transactional
public class ColorSvcImpl implements ColorSvc{
	
	@Autowired
	private ColorDao dao;

	@Override
	public List<Color> listar() throws SvcException {
		try {
			return dao.findAll();
		} catch (Exception e) {
			throw new SvcException(e);
		}
	}

}
