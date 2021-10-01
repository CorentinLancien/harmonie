package fr.harmonie.controller;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import fr.harmonie.model.Message;
import fr.harmonie.service.IMessageService;

@Controller
@RequestMapping("/home")
@Transactional
public class HomeController {

	@Autowired
	private IMessageService srvMessage;
	
	@GetMapping
	public String home() {
		
		return "home";
	}
	
	@PostMapping("/add")
	public String ajouter(String messageText) {
		Message monMessage = new Message();
		monMessage.setCorps(messageText);
		this.srvMessage.save(monMessage);
		
		return "redirect:./";
	}
}
