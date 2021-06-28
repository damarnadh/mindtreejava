package set2problems;

public class Exer28 {
	
	public static void main(String []args) {
		Book book1 =new Book("Daniel Defoe","RobinsonCruse","$15.50",1719);
		System.out.println(book1.getAuthor()+", "+book1.getTitle()+", "+book1.getPrice()+", "+book1.getYop());
		Book book2 =new Book("Joseph Conrad","Heart of Darkness","$12.80",1902);
		System.out.println(book2.getAuthor()+", "+book2.getTitle()+", "+book2.getPrice()+", "+book2.getYop());
		Book book3 =new Book("Pat Conroy","Beach Music","$9.50",1996);
		System.out.println(book3.getAuthor()+", "+book3.getTitle()+", "+book3.getPrice()+", "+book3.getYop());
	}
}
