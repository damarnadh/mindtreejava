package set1problems;
import java.util.*;

public class Exer6 {
	static void printName(){
		Scanner scanner =new Scanner(System.in);
		System.out.println("please enter a name :");
		String name = scanner.nextLine();
		System.out.println("Hello, "+name+"!");
		scanner.close();
	}
	public static void main(String []args) {
		printName();
	}
}
