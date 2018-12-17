package es.IMFE.refugio.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Controlador para redirigir a la página de inicio
 * @author Mari
 *
 */
@Controller
public class Inicio {
	
	private static final String SUCCESSADM = "homeAdm";
	private static final String SUCCESSUSER = "homeUser";

	@RequestMapping(value="/inicioAdm", method=RequestMethod.GET)
    public String inicioAdm(Model model){
		return SUCCESSADM;
    }
	
	@RequestMapping(value="/inicioUser", method=RequestMethod.GET)
    public String inicioUser(Model model){
		return SUCCESSUSER;
    }

}
