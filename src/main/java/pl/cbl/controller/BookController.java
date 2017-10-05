package pl.cbl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import pl.cbl.data.Book;

@Controller
public class BookController {

	@PostMapping("/add")
	public String addArticle(@ModelAttribute Book formBook, Model mod) {
	
		
		if(validNotEmpty(formBook)) {
		mod.addAttribute("book", formBook);	
		return "added";
		}else {
			return "redirect:fail";
		}
	}
	
	
	
	
	private boolean validNotEmpty(Book book) {
		return (book.getAuthor()!=null && book.getAuthor().length()>0) &&(book.getDescription()!=null && book.getDescription().length()>0)&&
				(book.getTitle()!=null && book.getTitle().length()>0);
		
	}
	
	
}
