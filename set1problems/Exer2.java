package set1problems;
import java.util.*;

public class Exer2 {
	public static void main(String []args) {
		Scanner scanner =new Scanner(System.in);
		System.out.println("please enter a number :");
		int n = scanner.nextInt();
		System.out.println("The table of "+n+" is :");
		for(int i=1;i<=12;i++) {
			System.out.println(n+" * "+i+" = "+n*i);
		}
		scanner.close();
	}
}
