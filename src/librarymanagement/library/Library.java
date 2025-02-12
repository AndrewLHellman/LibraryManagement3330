package librarymanagement.library;
import librarymanagement.book.Book;

public class Library {
	
	private Book[] books;
	private int count;
	
	
	public Library () {
		this.books = new Book[5];
		this.count = 0;
	}
	
	public boolean addBook(Book book) {
		if(this.count<5) {
			this.books[this.count++] = book;
			return true;
		}
		return false;
	}
	
	public boolean removeBook(Book book) {
		boolean bookFound = false;
		for(int i=0;i<this.count;i++) {
			if(bookFound || this.books[i] == book) {
				if (i < 4)
					this.books[i] = this.books[i+1];
				else
					this.books[i] = null;
				bookFound = true;
			}
		}
		if (bookFound)
			this.count--;
		return bookFound;
	}
	
	public Book searchByISBN(String ISBN) {
		for(int i=0;i<this.count;i++) {
			if(this.books[i].getISBN() == ISBN) {
				return this.books[i];
			}
		}
		return null;
	}
	
	public void displayBooks() {
		for(int i=0;i<this.count;i++) {
			System.out.println((i+1) + ". " + this.books[i].toString());
		}
	}
	
}

