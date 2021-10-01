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
import fr.harmonie.session.UserSession;

@Controller
@RequestMapping("/login")
public class LoginController {

	@Autowired
	UserService srvUser;
	
	@Autowired
	UserSession userSession;
	
	@GetMapping
	public String login() {
		return "login";
	}
	
	@PostMapping()
	public String signIn(User user) {
		
		User myUser = this.srvUser.findByPseudo(user.getPseudo());
		this.userSession.setId(myUser.getId());
		this.userSession.setUsername(myUser.getPseudo());
		
		return "redirect:/home";
	}
}
