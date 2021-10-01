package fr.harmonie.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import fr.harmonie.session.UserSession;

@Controller
@RequestMapping("/home")
public class HomeController {

	@Autowired
	UserSession userSession;
	
	@GetMapping
	public String home(Model model) {
		
		model.addAttribute("user", userSession);
		return "home";
	}
}
