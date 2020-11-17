package by.htp.less07.book.main;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class BookSorter {
	private BookLibrary bl = new BookLibrary();

	public BookLibrary sortByAutor(BookLibrary books, String autor) {
		List<Book> allBooks;
		allBooks = books.getBooks();
		String nameOfAutor = autor;

		for (Book book : allBooks) {
			String temp = book.getAutor();
			if (nameOfAutor.compareTo(temp) == 0) {
				// System.out.println(book.toString());
				bl.add(book);
			}
		}

		return bl;
	}

	public BookLibrary sortByPublishingHouse(BookLibrary books, String publishingHouse) {
		List<Book> allBooks;
		allBooks = books.getBooks();
		String nameOfPublishingHouse = publishingHouse;

		for (Book book : allBooks) {
			String temp = book.getPublishingHouse();
			if (nameOfPublishingHouse.compareTo(temp) == 0) {
				// System.out.println(book.toString());
				bl.add(book);
			}
		}

		return bl;
	}

	public BookLibrary sortByYearOfPublishing(BookLibrary books, int yearOfPublishing) {
		List<Book> allBooks;
		allBooks = books.getBooks();
		int year = yearOfPublishing;

		for (Book book : allBooks) {
			int temp = book.getYearOfPublishing();
			if (year <= temp) {
				bl.add(book);
			}
		}

		return bl;
	}
}
