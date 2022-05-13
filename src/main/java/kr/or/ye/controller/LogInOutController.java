package kr.or.ye.controller;

import java.util.Enumeration;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class LogInOutController {
	
	@GetMapping("/yelogin")
	public String getlogin(HttpSession session) {
		session.setAttribute("guest", "게스트!!");
		log.info("로그인페이지 입니다.");
		return "yelogin";
	}

	@GetMapping("/yelogout")
	public String getlogout() {
		log.info("로그인아웃페이지 입니다.");
		return "yelogout";
	}
	
	
	@GetMapping("/accessError")
	public String getAccessError(HttpServletRequest request, Model model) {
		log.info("접근권한이없는페이지 입니다.");
		 Enumeration<String> reqAttrNames = request.getAttributeNames();
		 
		 while(reqAttrNames.hasMoreElements()) {
			 System.out.println("ck: "+reqAttrNames.nextElement().toString());
		 }
		 
		 
		 model.addAttribute("msg", "접근 권한이 없습니다");
		 //model.getAttribute("accessUser");
		 
		 return "accessError";
	}
	
	
}
