package pl.cbl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import pl.cbl.data.MusicAlbum;



@Controller
public class AlbumController {

	@GetMapping("/")
	public String start(Model m) {
		m.addAttribute("album", new MusicAlbum());
		return "start";
	}
	
	
	
	
}
