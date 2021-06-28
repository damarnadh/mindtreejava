package set1problems;
import java.util.*;

public class Exer20 {
	
	public static void main(String []args) {
		Scanner scanner =new Scanner(System.in);
		System.out.println("please enter string 1 :");
		String str1 = scanner.nextLine();
		System.out.println("please enter string 2 :");
		String str2 = scanner.nextLine();
		System.out.println(str1.compareTo(str2));
		scanner.close();
	}
}
