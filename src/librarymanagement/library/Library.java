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
		for(int i=0;i<this.count;i++) {
			if(this.books[i] == book) {
				this.books[i] = null;
				return true;
			}
		}
		return false;
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
			System.out.println(this.books[i].toString());
		}
	}
	
}

