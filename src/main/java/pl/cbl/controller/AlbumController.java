package pl.cbl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import pl.cbl.data.MusicAlbum;

@Controller
public class AlbumController {

	
	@GetMapping
    public String home(Model model) {
        model.addAttribute("timeData", new MusicAlbum();
        return "album";
    }
	
	
}
