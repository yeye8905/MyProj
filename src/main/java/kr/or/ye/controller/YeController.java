package kr.or.ye.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
@RequestMapping("/kye")
public class YeController {
	
	@GetMapping("/all")
	public String getAll(Model model) {
		log.info("All Access");
		model.addAttribute("accessUser", "All");
		return "allaccess";
	}
	@GetMapping("/admin")
	public String getAdmin(Model model) {
		log.info("Admin Access");
		model.addAttribute("accessUser", "Admin");
		return "adminaccess";
	}
	@GetMapping("/member")
	public String getMember(Model model) {
		log.info("Member Access");
		model.addAttribute("accessUser", "Member");
		return "memberaccess";
	}
	
	
}
