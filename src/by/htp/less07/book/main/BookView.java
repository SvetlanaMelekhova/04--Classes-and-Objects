package by.htp.less07.book.main;

import java.util.ArrayList;
import java.util.List;

public class BookView {
	
	public void print (Book b) {
		
		System.out.println ("Book: "+ b.toString());
	}
	
	public void printLibrary (BookLibrary books) {
		List <Book> b;
		b = books.getBooks();
		
		for (int i=0; i< b.size(); i++) {
			Book printLibrary = b.get(i);
			System.out.println(printLibrary);
		}

	}
	
	

}
