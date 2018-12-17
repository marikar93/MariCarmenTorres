package esIMFE.refugio.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import es.IMFE.refugio.model.Usuario;

public class LoginInterceptor extends HandlerInterceptorAdapter{
	
	private final static String INDEX = "index.jsp";
	
	@Override
	public boolean preHandle(HttpServletRequest request,
						HttpServletResponse response, Object handler) throws Exception {
		String uri = request.getRequestURI();
		Usuario usuario = (Usuario) request.getSession().getAttribute("sessionUser");
		
		if(usuario == null) {
			if(!uri.endsWith("/login") && !uri.endsWith("/acceder")
					&& !uri.endsWith("/registro")) { //Autorizadas sin autenticar (Solo controladores)
				
				//Redirigir al inicio en caso de acceso prohibido
				response.sendRedirect(request.getContextPath() + INDEX);
				return false;
			}
		}
		return true;
		
	}

}
