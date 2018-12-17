package es.IMFE.refugio.service;

import es.IMFE.refugio.model.Usuario;

public interface UsuarioSvc {
	
	/**
	 * Metodo para registrar un usuario
	 * @param usuario El usuario que se guarda
	 * @throws SvcException
	 */
	public void guardar(Usuario usuario) throws SvcException;
	
	
	/**
	 * Metodo para modificar los datos de un usuario
	 * @param usuario El usuario que modificamos
	 * @throws SvcException
	 */
	public void modificar(Usuario usuario) throws SvcException;
	
	
	/**
	 * Metodo para eliminar un usuario
	 * @param usuario
	 * @throws SvcException
	 */
	public void borrar(Usuario usuario) throws SvcException;
	
	/**
	 * Metodo para buscar un usuario por su id
	 * @param id Id del usuario que queremos buscar
	 * @return Devuelve un usuario
	 * @throws SvcException
	 */
	public Usuario buscarPorId(int id) throws SvcException;
	
	/**
	 * Metodo para buscar un usuario por dni
	 * @param dni Dni del usuario que queremos buscar
	 * @return Devuelve un usuario
	 * @throws SvcException 
	 */
	public Usuario buscarPorDni(String dni) throws SvcException;
	
	/**
	 * Metodo para encontrar un usuario	por usuario y contrase�a
	 * @param user nick del usuario
	 * @param pass pasword del usuario
	 * @return Devuelve el usuario con el correspondiente nick y pass
	 * @throws SvcException
	 */
	public Usuario buscarPorUsserYPass(String user, String pass) throws SvcException;

}
