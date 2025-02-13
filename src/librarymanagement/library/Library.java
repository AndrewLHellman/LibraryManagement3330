package librarymanagement.library;
import librarymanagement.book.Book;

/**
 * Represents a Library as a collection of Books
 */
public class Library {
	
	private Book[] books;
	private int count;
	
	/**
	 * This is a default constructor, that will create
	 * a new library containing an empty Book array
	 * of size 5.
	 */
	public Library () {
		this.books = new Book[5];
		this.count = 0;
	}
	
	/**
	 * This method adds the given Book object to the
	 * first empty slot of the library books array
	 * if there is space available.
	 * 
	 * @param book
	 * 				This argument is the Book object to add.
	 * @return
	 * 				Returns true if space is available and the book is added. Returns false if library is full.
	 */
	public boolean addBook(Book book) {
		if(this.count<5) {
			this.books[this.count++] = book;
			return true;
		}
		return false;
	}
	
	/**
	 * This method removes the first instance in the
	 * books array of an equivalent book to the one
	 * provided. Books are equivalent if their ISBN
	 * numbers are equivalent.
	 * 
	 * @param book
	 * 				This is the Book object to check to remove.
	 * @return
	 * 				Returns true if the book was found and removed. Returns false if the book could not be found.
	 */
	public boolean removeBook(Book book) {
		boolean bookFound = false;
		for(int i=0;i<this.count;i++) {
			if(bookFound || this.books[i].equals(book)) {
				if (i < 4)
					this.books[i] = this.books[i+1];
				else
					this.books[i] = null;
				bookFound = true;
			}
		}
		if (bookFound)
			this.count--;
		else
			System.err.println("Cannot remove book \"" + book.toString() + "\" book does not exist in library.");
		return bookFound;
	}
	
	/**
	 * This method returns the reference to the first
	 * Book object in the books array with a given ISBN.
	 * 
	 * @param iSBN
	 * 				This is the ISBN to check against.
	 * @return
	 * 				The reference to the Book object with the given ISBN if found. Null otherwise.
	 */
	public Book searchByISBN(String iSBN) {
		for(int i=0;i<this.count;i++) {
			if(this.books[i].getISBN() == iSBN) {
				return this.books[i];
			}
		}
		return null;
	}
	
	/**
	 * This method displays an enumerated list of the
	 * string representations of Book objects in the books array.
	 */
	public void displayBooks() {
		for(int i=0;i<this.count;i++) {
			System.out.println((i+1) + ". " + this.books[i].toString());
		}
	}
	
}

