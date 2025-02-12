package librarymanagement.book;

/**
 * Represents a book in a library system
 */
public class Book {
	
	private String title;
	private String author;
	private String ISBN;
	private double price;
	
	/**
	 * This is a default constructor, that will
	 * allow you to create a Book object with 
	 * default or "placeholder" values.
	 */
	public Book () {
		this.title = "Unknown";
		this.author = "Unknown";
		this.ISBN = "Unknown";
		this.price = 0.0;
	}
	
	/**
	 * This is a parameterized constructor, that will
	 * allow you to create a Book object with a given
	 * title, author, ISBN, and price.
	 * 
	 * @param title
	 * 					This argument is the title of the book
	 * @param author
	 * 					This argument is the author of the book
	 * @param ISBN
	 * 					This argument is the ISBN of the book
	 * @param price
	 * 					This argument is the price of the book
	 * 
	 */
	public Book (String title, String author, String ISBN, double price) {
		this.title = title;
		this.author = author;
		this.ISBN = ISBN;
		this.price = price;
	}
	
	/**
	 * This is a copy constructor, that will
	 * allow you to create a Book object which
	 * copies a given book's title, author,
	 * ISBN, and price.
	 * 
	 * @param aBook
	 * 					This argument is the Book object to copy
	 * 
	 */
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

	/**
	 * This is a getter for the title
	 * attribute of the Book object.
	 * 
	 * @return 
	 * 				Returns the String title of the Book object.
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * This is a setter for the title
	 * attribute of the Book object.
	 * 
	 * @param title
	 * 				This argument is the String title to give the book object.
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * This is a getter for the author
	 * attribute of the Book object.
	 * 
	 * @return 
	 * 				Returns the String author of the Book object.
	 */
	public String getAuthor() {
		return author;
	}

	/**
	 * This is a setter for the author
	 * attribute of the Book object.
	 * 
	 * @param author
	 * 				This argument is the String author to give the book object.
	 */
	public void setAuthor(String author) {
		this.author = author;
	}

	/**
	 * This is a getter for the ISBN
	 * attribute of the Book object.
	 * 
	 * @return 
	 * 				Returns the String ISBN of the Book object.
	 */
	public String getISBN() {
		return ISBN;
	}

	/**
	 * This is a setter for the ISBN
	 * attribute of the Book object.
	 * 
	 * @param ISBN
	 * 				This argument is the String ISBN to give the book object.
	 */
	public void setISBN(String ISBN) {
		this.ISBN = ISBN;
	}

	/**
	 * This is a getter for the price
	 * attribute of the Book object.
	 * 
	 * @return 
	 * 				Returns the double price of the Book object.
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * This is a setter for the price
	 * attribute of the Book object.
	 * 
	 * @param price
	 * 				This argument is the double price to give the book object.
	 */
	public void setPrice(double price) {
		this.price = price;
	}
	
	/**
	 * Returns a string representation of the Book object.
	 * 
	 * @return
	 * 				String representation of book object in format "this.title (ISBN: this.ISBN, $this.price)".
	 */
	@Override
	public String toString() {
		return this.title + " (ISBN: " + this.ISBN + ", $" + this.price + ")";
	}
	
	/**
	 * This method will check if two Book objects are equal by checking the
	 * equality of their ISBNs.
	 * 
	 * @param other
	 * 				Object with which to compare.
	 * 
	 * @return
	 * 				Return false if other is null, not a Book object, or both objects have different ISBNs.
	 * 				Return true if both objects are books with equivalent ISBNs.
	 */
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
