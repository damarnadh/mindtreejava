package set2problems;

public class Book {
	private String author;
	private String title;
	private String price;
	private int yop;
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public int getYop() {
		return yop;
	}
	public void setYop(int yop) {
		this.yop = yop;
	}
	public Book(String author, String title, String price, int yop) {
		this.author = author;
		this.title = title;
		this.price = price;
		this.yop = yop;
	}
	public Book() {
	}
}
