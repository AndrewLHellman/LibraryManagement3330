package librarymanagement.libraryapp;
import librarymanagement.book.Book;
import librarymanagement.library.Library;

public class LibraryApp {

	public static void main(String[] args) {
		Library library = new Library();
		
		Book book1 = new Book();
		book1.setTitle("Clean Code");
		book1.setAuthor("Robert C. Martin");
		book1.setISBN("978-0135166307");
		book1.setPrice(40.99);
		
		Book book2 = new Book();
		book2.setTitle("Design Patterns");
		book2.setAuthor("Erich Gamma");
		book2.setISBN("978-0201633610");
		book2.setPrice(50.99);
		
		Book book3 = new Book();
		book3.setTitle("The Pragmattic Programmer");
		book3.setAuthor("Andrew Hunt");
		book3.setISBN("989-0135957059");
		book3.setPrice(45.99);
		
		System.out.println("Adding Books...");
		
		library.addBook(book1);
		library.addBook(book2);
		library.addBook(book3);
		
	}
}
