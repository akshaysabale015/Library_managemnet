package com.management;

public class LibraryBook {
	String title;
	String author;
	String isbn;
	static boolean available;

	LibraryBook(String title, String author, String isbn) {
		this.title = title;
		this.author = author;
		this.isbn = isbn;
	}

	LibraryBook() {
		this.available = true;
	}

	void borrowBook() {
		if (available) {
			boolean available = false;
			System.out.println("Book is borrowed Successfully");
		} else {
			System.out.println("Sorry ,Book is already borrowed");
		}
	}

	void returnBook() {
		if (available) {
			boolean available = true;
			System.out.println("Book is borrowed successfully");
		} else {
			System.out.println("book was not borrowed");
		}
	}

	void display() {
		System.out.println("Book name is = " + this.title + " " + this.isbn);
		System.out.println("written by = " + this.author);
	}

	public static void main(String[] args) {
		LibraryBook l = new LibraryBook("Jiwan Ek Sangharsh", "God", "stri788");
		l.display();
		System.out.println("*******");
		l.borrowBook();
		l.returnBook();

		System.out.println("Book  1  Available : " + LibraryBook.available);
	}

}
