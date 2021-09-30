package fr.harmonie.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.annotation.SessionScope;

import fr.harmonie.model.User;
import fr.harmonie.service.UserService;

@Controller
@RequestMapping("/login")
public class LoginController {

	@Autowired
	UserService srvUser;
	
	@GetMapping
	public String login() {
		return "login";
	}
	
	@PostMapping()
	public String signIn(User user, Model model) {
		
		model.addAttribute("user", this.srvUser.findByPseudo(user.getPseudo()));
		System.out.println("coucou");
		
		return "home";
	}
}
