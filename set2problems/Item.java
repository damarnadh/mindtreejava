package set2problems;

public final class Item{
	private int id;
	private int price;
	public Item() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Item(int id, int price) {
		super();
		this.id = id;
		this.price = price;
	}
	public int getId() { // retrive purpose
		return id;
	}
	public void setId(int id) {//manipulating purpose
		this.id = id;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
}
