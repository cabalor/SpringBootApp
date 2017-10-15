package pl.cbl.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import pl.cbl.data.MusicAlbum;
import pl.cbl.repository.AlbumRepo;

@Controller
public class AlbumController {

	@Autowired
	private AlbumRepo albumR;	
	
	
	@GetMapping("/album")
    public String home(Model model) {
        model.addAttribute("album", new MusicAlbum());
        return "album";
    }
	
	@PostMapping("/saveAlbum")
    public String saveTime(@ModelAttribute MusicAlbum album) {
        albumR.save(album);
        return "album";
    }
	
	 @GetMapping("/showAlbum")
	    public String showAll(Model model) {
	        List<MusicAlbum> albums = albumR.findAll();
	        model.addAttribute("all", albums);
	        return "allAlbums";
	    }
	
}
