package fr.afpa.formation.mecanique.application.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import fr.afpa.formation.mecanique.persistence.entity.Client;



@Controller
public class ClientController {

	@GetMapping("/")
	public String start(Model model) throws Exception {
		List<Client> listClient = new ArrayList<>();
		listClient.add(new Client("Gontrand", "Jean-eude", "0605040708", "123@g.com", "CL001", "ABC123", new Date(), "monStatus"));
		
		model.addAttribute("clients", listClient);
		return "listClient";
	}
}
