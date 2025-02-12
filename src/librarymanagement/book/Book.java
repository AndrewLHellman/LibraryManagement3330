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
	}
	
	public Book (String title, String author, String ISBN, double price) {
		this.title = title;
		this.author = author;
		this.ISBN = ISBN;
		this.price = price;
	}
	
	public Book(Book aBook) {
		if (aBook == null) {
			System.err.println("Cannot copy a 'null' object, creating a default book instead.");
			this.title = "Unknown";
			this.author = "Unknown";
			this.ISBN = "Unknown";
			this.price = 0.0;
		}
		else {
			this.title = aBook.title;
			this.author = aBook.author;
			this.ISBN = aBook.ISBN;
			this.price = aBook.price;
		}
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String ISBN) {
		this.ISBN = ISBN;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return this.title + " (ISBN: " + this.ISBN + ", $" + this.price + ")";
	}
	
	@Override
	public boolean equals(Object other) {
		if (other == null)
			return false;
		else if (getClass() != other.getClass())
			return false;
		else 
		{
			Book otherBook = (Book) other;
			return this.ISBN.equals(otherBook.getISBN());
		}
	}
}
