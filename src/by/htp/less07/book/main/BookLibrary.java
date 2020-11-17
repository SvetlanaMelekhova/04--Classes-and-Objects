package by.htp.less07.book.main;

import java.util.ArrayList;
import java.util.List;
public class BookLibrary {
	
	private List<Book> books;
	
	public BookLibrary () {
		books = new ArrayList<Book>();	
	}
	
	public List<Book> getBooks() {
		
		 return books;	
	}
	 
	public Book getBooks(int index) {
		if(index >= books.size()) {
			return null;
		}
		
		return books.get(index);
	}
	
	public void add (Book b) {
		books.add(b);
	}
	
	public int size () {
		return books.size();
		
	}

	public void remove(int i) {
		books.remove(i);

	}
	
	public void remove (Book b) {
		books.remove(b);
	}

	public void add(int i, Book b) {
		books.add(i, b);
		
	}
	

	
}
