package doweb.store.nanogear.interceptor;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.HandlerInterceptor;

import doweb.store.nanogear.been.SessionService;
import doweb.store.nanogear.entity.User;

@Service
public class SecurityInterceptor implements HandlerInterceptor{
	
	@Autowired
	SessionService session;
	
	@Override
	public boolean preHandle(HttpServletRequest request, 
			HttpServletResponse response, Object handler)	throws Exception {
		HttpSession session = request.getSession();
		String uri = request.getRequestURI();
		User user = (User) session.getAttribute("userss");
		if(user == null){
			response.sendRedirect(request.getContextPath() + "/formlogin");
			return false;
		}else if(!user.isRole() == true && uri.startsWith("/admin/") ) {
			response.sendRedirect(request.getContextPath() + "/noadmin");
			return false;
		}
		return true;
	}
}
