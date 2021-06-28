package set1problems;
import java.util.*;

public class Exer18 {
	static void generatePassword(String res) {
		String pass="";
		for(int i=0;i<res.length();i++) {
			if(res.charAt(i)<97) {
				pass+=res.charAt(i);
			}
		}
		System.out.println("generated password, "+pass);
	}
	static void getNameAge(){
		Scanner scanner =new Scanner(System.in);
		System.out.println("please enter a first name :");
		String fName = scanner.nextLine();
		System.out.println("please enter a middle name :");
		String mName = scanner.nextLine();
		System.out.println("please enter a last name :");
		String lName = scanner.nextLine();
		System.out.println("please enter age :");
		int age = scanner.nextInt();
		String res =fName+mName+lName+age;
		generatePassword(res);
		scanner.close();
	}
	public static void main(String []args) {
		getNameAge();
	}
}
