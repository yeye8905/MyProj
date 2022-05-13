package kr.or.ye.security;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.web.access.AccessDeniedHandler;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CustomAccessDeniedHandler implements AccessDeniedHandler {
	@Override
		public void handle(HttpServletRequest request, HttpServletResponse response,
				AccessDeniedException accessDeniedException) throws IOException, ServletException {
			
			log.info("엑세스거부핸들러로 온 표식!");
			log.info("error: "+accessDeniedException.getMessage());
			
			//에러페이지로
			response.sendRedirect(request.getContextPath()+"/accessError");
		
		}
}
