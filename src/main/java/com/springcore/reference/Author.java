package com.springcore.reference;

public class Author {
	
	private String authorName;
	
	

	public Author() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Author(String authorName) {
		this.authorName = authorName;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	@Override
	public String toString() {
		return "Author [authorName=" + authorName + "]";
	}
	
	
	

}
