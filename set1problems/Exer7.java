package set1problems;
import java.util.*;

public class Exer7 {
	static int getMax(int a,int b,int c) {
		if(a>b && a>c) {
			return a;
		}else if(b>a && b>c) {
			return b;
		}else {
			return c;
		}
	}
	public static void main(String []args) {
		Scanner scanner =new Scanner(System.in);
		System.out.println("please enter a 3 numbers :");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		System.out.println("The maximum of three numbers is:"+getMax(a,b,c));
		scanner.close();
	}
}
