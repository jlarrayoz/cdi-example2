package uy.org.cdi.example;

public class Main {

	public static void main(String[] args) {
		BookService service = new BookService();
		Book book = service.createBook("Java EE7", 500f, "Curso JEE 7 BSE");
		System.out.println(book);
	}
}
