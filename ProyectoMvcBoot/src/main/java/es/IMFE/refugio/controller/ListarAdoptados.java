package es.IMFE.refugio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import es.IMFE.refugio.service.AnimalSvc;

/**
 * Controlador para listar los animales adoptados
 * @author usuario
 *
 */
@Controller
public class ListarAdoptados {
	
	public static final String SUCCESS = "listaAdopt";
	public static final String ERROR = "error";
	
	@Autowired
	private AnimalSvc svc;
	
	@RequestMapping(value = "/listarAdopt", method=RequestMethod.GET)
	public String execute(Model model){
    	try {
			//Lista de animales adoptados
			model.addAttribute("lista", svc.listarAdop());
			
			return SUCCESS;
			
		} catch (Exception e) {
			model.addAttribute("error", e);
			return ERROR;
		}
    }

}
