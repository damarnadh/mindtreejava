package newcap4problems;

public class Contact {
	private int id;
	private String name;
	private String contactnumber;
	
	
	
	public Contact(int id, String name, String contactnumber) {
		super();
		this.id = id;
		this.name = name;
		this.contactnumber = contactnumber;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContactnumber() {
		return contactnumber;
	}
	public void setContactnumber(String contactnumber) {
		this.contactnumber = contactnumber;
	}
	
	
}
