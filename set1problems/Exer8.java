package set1problems;
import java.util.*;

public class Exer8 {
	static int getReversed(int a) {
		int sum=0;
		while(a!=0) {
			sum=(sum*10)+(a%10);
			a=a/10;
		}
		return sum;
	}
	public static void main(String []args) {
		Scanner scanner =new Scanner(System.in);
		System.out.println("please enter a number :");
		int a = scanner.nextInt();
		System.out.println("The reverse order of  number is:"+getReversed(a));
		scanner.close();
	}
}
