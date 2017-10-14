package pl.cbl.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import pl.cbl.dao.BookDataStore;
import pl.cbl.data.Book;

@Controller
public class BookController {
	
	@Autowired
	private BookDataStore ads;
	
	
	@PostMapping("/add")
	public String addArticle(@ModelAttribute Book formBook, Model mod) { 
		if(validNotEmpty(formBook)) {
		mod.addAttribute("book", formBook);	
		ads.addBook(formBook);
		return "added";
		} else {
			return "redirect:error";
		}
	}
	
	@RequestMapping("/books")
	public String showBooks(Model mod) {
		List<Book> lista = ads.getList();
		mod.addAttribute("books", lista);
		return "books";
		
	}
	
	
	
	
	private boolean validNotEmpty(Book book) {
		return (book.getAuthor()!=null && book.getAuthor().length()>0) &&(book.getDescription()!=null && book.getDescription().length()>0)&&
				(book.getTitle()!=null && book.getTitle().length()>0);
		
	}
	
	
}
