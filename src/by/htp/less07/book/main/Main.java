package by.htp.less07.book.main;

import java.util.List;

/*2. Создать класс Book, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и 
метод toString(). Создать второй класс, агрегирующий массив типа Book, с подходящими конструкторами и методами. 
Задать критерии выбора данных и вывести эти данные на консоль.
Book: id, название, автор(ы), издательство, год издания, количество страниц, цена, тип переплета.
Найти и вывести:
a) список книг заданного автора;
b) список книг, выпущенных заданным издательством;
c) список книг, выпущенных после заданного года.*/
public class Main {

	public static void main(String[] args) {
		
		Book book1 = new Book(58, "Джейн Эйр", "Шарлота Бронте", "Эсмо", 2017, 350, 43, "книга");
		Book book2 = new Book(59, "British Englih", "Шарлота Бронте", "Айрис-пресс", 2017, 350, 65, "книга");
		Book book3 = new Book(60, "Изучаем Java", "Кэти Сьера", "O'REILLY", 2018, 720, 43, "книга");
		Book book4 = new Book(61, "Тестирование dot Com", "Роман Савин", "Дело", 2006, 311, 43, "книга");
		Book book5 = new Book(62, "Джейн Эйр", "Шарлота Бронте", "Эсмо", 2009, 340, 43, "книга");
		Book book6 = new Book(63, "Философия Java", "Брюс Эккель", "Питер", 2019, 1165, 43, "книга");
		Book book7 = new Book(64, "Java. Руководство для начинающих", "Герберт Шилд", "Oracle Press", 2004, 712, 43, "книга");
		Book book8 = new Book(65, "Java. Полное руководство", "Герберт Шилд", "Oracle Press", 2008, 1565, 43, "книга");
		
		BookLibrary books = new BookLibrary();
		books.add(book1);
		books.add(book2);
		books.add(book3);
		books.add(book4);
		books.add(book5);
		books.add(book6);
		books.add(book7);
		books.add(book8);
		
		
		
		BookView view = new BookView ();
		
		BookSorter sorter = new BookSorter();
	
		
		books.getBooks();
	
		
		
		view.printLibrary(books);
		BookLibrary books1;
		
		//books1 = sorter.sortByAutor(books, "Герберт Шилд");
		//books1.size();
		//view.printLibrary(books1);	
		//view.printLibrary(books);
		//books1 = sorter.sortByYearOfPublishing(books, 2010 );
		//view.printLibrary(books1);
		
		//System.out.println(books.size());	
		
		//books1.add(new Book(63, "Философия Java", "Брюс Эккель", "Питер", 2019, 1165, 43, "книга"));
		//view.printLibrary(books1);
		
	}

}
