package set2problems;

public class Exer29 {
	
	public static void main(String []args) {
		Customer customer1 =new Customer(1001,"Kumar","Rajajinagar Bangalore-10");
		System.out.println(customer1.getCustId()+", "+customer1.getCustName()+", "+customer1.getCustAddress());
		Customer customer2 =new Customer(1002,"Raja");
		System.out.println(customer2.getCustId()+", "+customer2.getCustName());
		Customer customer3 =new Customer(1003,"Shanthi","Jayanagar Bangalore-20","SB",1500);
		System.out.println(customer3.getCustId()+", "+customer3.getCustName()+", "+customer3.getCustAddress()+", "+customer3.getAccType()+", "+customer3.getCustBalance());
	}
}
