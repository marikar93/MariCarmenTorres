package es.IMFE.refugio.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import es.IMFE.refugio.model.Usuario;

/**
 * Controlador que envia a un usuario a un formulario de registro
 * @author Mari
 */
@Controller
public class Registrarse {
	
	private static final String SUCCESS = "registro";
	private static final String ERROR = "error";
	
	@RequestMapping(value = "/registro", method=RequestMethod.GET)
	public String view(@ModelAttribute Usuario usuario, Model model) {
		try {
			return SUCCESS;
		} catch (Exception e) {
			model.addAttribute("error", e);
			return ERROR;
		}
	}

}
