package es.IMFE.refugio.controller;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import es.IMFE.refugio.model.Usuario;
import es.IMFE.refugio.service.UsuarioSvc;

/**
 * Controlador para validacion y acceso
 * @author Mari
 *
 */
@Controller
public class Acceder {
	
	public static final String SUCCESS1 = "homeAdm";
	public static final String SUCCESS2 = "homeUser";
	public static final String ERROR = "error";
	public static final String LOGIN = "login";
	
	@Autowired
	private UsuarioSvc svc;
	
	@RequestMapping(value = "/acceder", method=RequestMethod.POST)
    public String execute(@Valid Usuario usuario, BindingResult result, Model model, HttpSession session) {
		try {
			
			//Comprobar si hay errores de entrada
			if (result.getFieldError("user") != null || //Mira los errores en esos campos especificos
					result.getFieldError("pass") != null){
				//Mostrar sobre el propio formulario relleno
				return LOGIN;
				
			}else{	
			//Obtenemos el usuario y contraseña del formulario
			String user =  usuario.getUser();
			String pass = usuario.getPass();
			//Buscamos aquel usuario cuyo usuario y contraseña sean los pasados
			
			usuario = svc.buscarPorUsserYPass(user, pass);
			
				if(usuario==null) {
					//Asignamos el error al id del usuario para filtrado en formulario 
					result.rejectValue("idusuario", "mensaje.errorAcceso");
					return LOGIN;
				}else {
					if (usuario.getTipoUsuario().getTipo().equals("administrador")){ //Usuario administrador
						
						//Metemos el usuario en la sesion
						session.setAttribute("sessionUser", usuario);
						return SUCCESS1;
					}else{ //Usuario voluntario/adoptante
						
						model.addAttribute("usuario", usuario);
						//Metemos el usuario en la sesion
						session.setAttribute("sessionUser", usuario);
						return SUCCESS2;
					}
				}
			}
				
		}catch (Exception e) {
			model.addAttribute("error", e);
			return ERROR;
		}
    }

}
