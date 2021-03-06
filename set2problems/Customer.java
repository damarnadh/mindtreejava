package set2problems;

public class Customer {
	private int custId;
	private String custName;
	private String custAddress;
	private String accType;
	private double custBalance;
	public Customer(int custId, String custName, String custAddress, String accType, double custBalance) {
		super();
		this.custId = custId;
		this.custName = custName;
		this.custAddress = custAddress;
		this.accType = accType;
		this.custBalance = custBalance;
	}
	public Customer(int custId, String custName) {
		super();
		this.custId = custId;
		this.custName = custName;
	}
	public Customer(int custId, String custName, String custAddress) {
		super();
		this.custId = custId;
		this.custName = custName;
		this.custAddress = custAddress;
	}
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getCustAddress() {
		return custAddress;
	}
	public void setCustAddress(String custAddress) {
		this.custAddress = custAddress;
	}
	public String getAccType() {
		return accType;
	}
	public void setAccType(String accType) {
		this.accType = accType;
	}
	public double getCustBalance() {
		return custBalance;
	}
	public void setCustBalance(double custBalance) {
		this.custBalance = custBalance;
	}
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
}
