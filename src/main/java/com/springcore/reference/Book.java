package com.springcore.reference;

public class Book {
	
	private String bookName;
	private Author authorName;
	
	
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}


	public String getBookName() {
		return bookName;
	}


	public void setBookName(String bookName) {
		this.bookName = bookName;
	}


	public Author getAuthorName() {
		return authorName;
	}


	public void setAuthorName(Author authorName) {
		this.authorName = authorName;
	}


	@Override
	public String toString() {
		return "Book [bookName=" + bookName + ", authorName=" + authorName + "]";
	}
	
	
	

}
