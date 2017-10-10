package pl.cbl.controller;

import java.util.Arrays;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import pl.cbl.data.MusicAlbum;



@Controller
public class AlbumController {

	@GetMapping("/")
	public String start(Model m) {
		m.addAttribute("album", new MusicAlbum());
		return "start";
	}
	
	
	@PostMapping("/addAlbum")
	public String added(@ModelAttribute MusicAlbum album, Model mod) {
		mod.addAttribute("msg", "Album "+album + " was added to db");
		return "start";
	}
	
	@GetMapping("/albums")
	public String albums(Model m) {
		m.addAttribute("albums", Arrays.asList(new MusicAlbum()));
		return "albums";
	}
	
	
}
