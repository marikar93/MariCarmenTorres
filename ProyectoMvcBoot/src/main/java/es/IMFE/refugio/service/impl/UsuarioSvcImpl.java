package es.IMFE.refugio.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import es.IMFE.refugio.model.Usuario;
import es.IMFE.refugio.model.dao.UsuarioDao;
import es.IMFE.refugio.service.SvcException;
import es.IMFE.refugio.service.UsuarioSvc;

/**
 * Implementacion del servicio
 * @author Mari
 *
 */
@Service
@Transactional
public class UsuarioSvcImpl implements UsuarioSvc{

	@Autowired
	private UsuarioDao dao;
	
	@Transactional (propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
	@Override
	public void guardar(Usuario usuario) throws SvcException {
		
		try {
			dao.save(usuario);
		} catch (Exception e) {
			throw new SvcException(e);
		}
		
	}

	@Transactional (propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
	@Override
	public void modificar(Usuario usuario) throws SvcException {
		
		try {
			dao.update(usuario);
		} catch (Exception e) {
			throw new SvcException(e);
		}
		
	}

	@Transactional (propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
	@Override
	public void borrar(Usuario usuario) throws SvcException {
		
		try {
			dao.delete(usuario);
		} catch (Exception e) {
			throw new SvcException(e);
		}
		
	}

	@Override
	public Usuario buscarPorId(int id) throws SvcException {
		Usuario res = null;
		
		try {
			res = dao.findById(id);
		} catch (Exception e) {
			throw new SvcException(e);
		}
		
		return res;
	}
	
	@Override
	public Usuario buscarPorDni(String dni) throws SvcException {
		Usuario res = null;
		
		try {
			res = dao.findByDni(dni);
		} catch (Exception e) {
			throw new SvcException(e);
		}
		
		return res;
	}
	
	
	@Override
	public Usuario buscarPorUsserYPass(String user, String pass) throws SvcException {
		Usuario res = null;
		
		try {
			res = dao.findByUserAndPass(user, pass);
		} catch (Exception e) {
			throw new SvcException(e);
		}
		
		return res;
	}

	

}
