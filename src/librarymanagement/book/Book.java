package librarymanagement.book;

public class Book {
	
	private String title;
	private String author;
	private String ISBN;
	private double price;
	
	public Book () {
		this.title = "Unknown";
		this.author = "Unknown";
		this.ISBN = "Unknown";
		this.price = 0.0;
	};
	
	public Book (String title, String author, String ISBN, double price) {
		this.title = title;
		this.author = author;
		this.ISBN = ISBN;
		this.price = price;
	};
}
