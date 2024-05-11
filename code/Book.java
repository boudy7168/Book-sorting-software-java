package Assignment_2;

import java.io.Serializable;

public class Book implements Serializable{
	
	String title, authors, isbn, genre;
	int year;
	double price;
	
	public Book() {
		
	}
	
	public Book(String title, String authors, String isbn, String genre, int year, double price) {
		this.title=title;
		this.authors=authors;
		this.isbn=isbn;
		this.genre=genre;
		this.year=year;
		this.price=price;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthors() {
		return authors;
	}
	public void setAuthors(String authors) {
		this.authors = authors;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
	public String toString() {
		return "the book's title is "+title+", the author is "+authors+", the price is "+price+
				", the ISBN is "+isbn+", the genre is "+genre+" and the year is "+year;
	}
	
	public boolean equals(Book x) {
		 return year == x.year && x.price==price &&
				 title.equals(x.title) && authors.equals(x.authors) && 
				 isbn.equals(x.isbn) && genre.equals(x.genre);
	}
}
