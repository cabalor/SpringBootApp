package pl.cbl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import pl.cbl.data.Book;

@Controller
public class MainController {

	
	@GetMapping("/")
	public String start(Model m) {
		return "start";
	}
	
	
	
	@GetMapping("/index")
	public String main(Model m) {
		m.addAttribute("welcome", "first thymeleaf site");
		m.addAttribute("formBook", new Book());
		return "index";
	}
	
	@GetMapping("/loginform")
	public String loginForm() {
	    return "loginForm";
	}
	
	
}
