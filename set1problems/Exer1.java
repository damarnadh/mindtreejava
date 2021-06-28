package set1problems;
import java.util.*;

public class Exer1 {
	public static void main(String []args) {
		Scanner scanner =new Scanner(System.in);
		System.out.println("please enter a number :");
		int n = scanner.nextInt();
		System.out.println("The factorial of "+n+" is :");
		long temp =1;
		for(int i=1;i<=n;i++) {
			temp = temp*i;
		}
		System.out.print(temp);
		scanner.close();
	}
}
