package co.grandcircus.assessment6b.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import co.grandcircus.assessment6b.model.Jellybean;
import co.grandcircus.assessment6b.repository.JellybeanRepository;


@Controller
public class jellybeanController {

	@Autowired
	private JellybeanRepository repo;
	
	
	@RequestMapping("/")
	public String home(Model model) {

		List<Jellybean> jellybean;
		jellybean = repo.findAll();
		model.addAttribute("jellybeans", jellybean);
		
		return "home";		
	}
	
	
	@PostMapping("/create-jelly")
	public String createJellyBean(Jellybean jellybean,
			@RequestParam String style,
			@RequestParam Integer rating
			) {
		
			repo.save(jellybean);
			
			return "redirect:/";
		
	}
	
}

