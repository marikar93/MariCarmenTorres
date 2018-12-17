package es.IMFE.refugio.controller;

import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import es.IMFE.refugio.model.Animal;
import es.IMFE.refugio.model.Usuario;
import es.IMFE.refugio.service.AnimalSvc;

/**
 * Para poder adoptar un animal
 * @author usuario
 *
 */
@Controller
public class Adoptar {
	
	public static final String SUCCESS = "pregunta";
	public static final String ERROR = "error";
	
	@Autowired
	private AnimalSvc svc;
	
	@RequestMapping(value = "/adoptar", method=RequestMethod.GET)
	public String execute(@RequestParam int id, Model model, HttpSession session, Locale locale){
    	try {	
    		
    		//Animal que se quiere adoptar, buscado por id
    		Animal animal = svc.buscarPorId(id);
    		animal.setFechaAdopcion(new Date()); //Asignamos fecha
    		
    		Usuario usuario = (Usuario) session.getAttribute("sessionUser");//Recogemos usuario de la sesion
    		animal.setUsuario(usuario);//Asignamos usuario
    		
    		svc.modificar(animal);
    		
    		//Refrescamos el usuario de la sesion
    		session.setAttribute("sessionUser", usuario);
    		
			return SUCCESS;
			
		} catch (Exception e) {
			model.addAttribute("error", e);
			return ERROR;
		}
    }

}
