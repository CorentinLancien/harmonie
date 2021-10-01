package fr.harmonie.controller;


import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import fr.harmonie.model.Message;
import fr.harmonie.service.IGroupeService;
import fr.harmonie.service.IMessageService;
import fr.harmonie.service.IUserService;
import fr.harmonie.session.UserSession;

@Controller
@RequestMapping("/home")
@Transactional
public class HomeController {

	@Autowired
	private IMessageService srvMessage;

	@Autowired
	private IUserService srvUser;

	@Autowired
	private IGroupeService srvGroupe;
	
	@Autowired
	UserSession userSession;
	
	@GetMapping
	public String home(Model model) {
		
		model.addAttribute("user", userSession);
		return "home";
	}
	
	@PostMapping("/add")
	public String ajouter(String messageText) {
		Message monMessage = new Message();

		monMessage.setCorps(messageText);
		monMessage.setUser(this.srvUser.findByPseudo(this.userSession.getUsername()));
		
		this.srvMessage.save(monMessage);
		
		return "redirect:./";
	}
}
