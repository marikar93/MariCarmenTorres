package es.IMFE.refugio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import es.IMFE.refugio.service.AnimalSvc;

/**
 * Controlador para listar animales no adoptados
 * @author Mari
 *
 */
@Controller
public class ListarNoAdoptados {
	
	public static final String SUCCESS_ADM = "listaNoAdopt";
	public static final String SUCCESS_USER = "listaParaAdopt";
	
	public static final String ERROR = "error";
	
	@Autowired
	private AnimalSvc svc;
	
	@RequestMapping(value = "/listarNoAdopt", method=RequestMethod.GET)
	public String execute(Model model){
    	try {
			//Lista de animales no adoptados
			model.addAttribute("lista", svc.listarSinAdop());
			
			return SUCCESS_ADM;
			
		} catch (Exception e) {
			model.addAttribute("error", e);
			return ERROR;
		}
    }
	
	@RequestMapping(value = "/listarParaAdopt", method=RequestMethod.GET)
	public String executes(Model model){
    	try {
			//Lista de animales para adopcion
			model.addAttribute("lista", svc.listarSinAdop());
			
			return SUCCESS_USER;
			
		} catch (Exception e) {
			model.addAttribute("error", e);
			return ERROR;
		}
    }

}
