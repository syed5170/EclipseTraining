package training;

import java.io.Serializable;

public class Book implements Serializable
{
	private int bookid;
	private String title;
	private String author;
	private double price = 500.50 ;
	
	public Book(int bid, String t, String a, double p)
	{
		this.bookid=bid;
		this.title=t;
		this.author=a;
		this.price=p;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getBookid() {
		return bookid;
	}

	public void setBookid(int bookid) {
		this.bookid = bookid;
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

	@Override
	public String toString() {
		return "Book [bookid=" + bookid + ", title=" + title + ", author=" + author + ", price=" + price
				+ ", getPrice()=" + getPrice() + ", getBookid()=" + getBookid() + ", getTitle()=" + getTitle()
				+ ", getAuthor()=" + getAuthor() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
	

}
