package set1problems;
import java.util.*;

public class Exer17 {
	static void printName(){
		Scanner scanner =new Scanner(System.in);
		System.out.println("please enter a name :");
		String name = scanner.nextLine();
		String res="";
		for(int i=0;i<name.length();i++) {
			if(name.charAt(i)<97) {
				res+=name.charAt(i);
			}
		}
		System.out.println("Initials are, "+res);
		scanner.close();
	}
	public static void main(String []args) {
		printName();
	}
}
