package pl.cbl.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import pl.cbl.data.Book;
import pl.cbl.data.MusicAlbum;

@Component
public class BookDataStore {

	
	private List<Book> list = new ArrayList<>();
		
	
	public List<Book> getList() {
		return list;
	}

	public void setList(List<Book> list) {
		this.list = list;
	}

	
	public void addBook(Book bk) {
		list.add(bk);
			
			
		}
		
	
}
