package uy.org.cdi.example;

import java.util.Date;

public class BookService {

	private IsbnGenerator numberGenerator = new IsbnGenerator();
	private Date instanciationDate;

	public BookService() {
		instanciationDate = new Date();
	}

	public Book createBook(String title, Float price, String description) {
		Book book = new Book(title, price, description);
		book.setIsbn(numberGenerator.generateNumber());
		book.setInstanciationDate(instanciationDate);
		return book;
	}
}