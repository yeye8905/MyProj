package kr.or.ye.security;

import java.io.IOException;
import java.util.Iterator;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CustomAuthenticationSuccessHandler implements AuthenticationSuccessHandler{
	@Override
		public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response,
				Authentication authentication) throws IOException, ServletException {
		
			Iterator<? extends GrantedAuthority> myIter = authentication.getAuthorities().iterator();
			log.info("name: "+authentication.getName());
			log.info("credential: "+authentication.getCredentials());
			log.info("details: "+authentication.getDetails());
			log.info("principal"+authentication.getPrincipal());
			
			while (myIter.hasNext()) {
				String authName = myIter.next().toString();
				log.info("auth: "+authName);
				if(authName.equals("ROLE_ADMIN")) {
					response.sendRedirect(request.getContextPath()+"/kye/admin");
				}
				if(authName.equals("ROLE_MEMBER")) {
					response.sendRedirect(request.getContextPath()+"/kye/member");
					
				}
			
			}
	
	}
}
