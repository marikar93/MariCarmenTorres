package es.IMFE.refugio.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import es.IMFE.refugio.model.TipoUsuario;
import es.IMFE.refugio.model.dao.TipoUsuarioDao;
import es.IMFE.refugio.service.SvcException;
import es.IMFE.refugio.service.TipoUsuarioSvc;

/**
 * Implementacion del servicio
 * @author Mari
 *
 */
@Service
@Transactional
public class TipoUsuarioSvcImpl implements TipoUsuarioSvc{

	@Autowired
	private TipoUsuarioDao dao;
	
	@Override
	public List<TipoUsuario> listar() throws SvcException {
		try {
			return dao.findAll();
		} catch (Exception e) {
			throw new SvcException(e);
		}
	}

}
