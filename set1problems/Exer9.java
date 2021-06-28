package set1problems;
import java.util.*;

public class Exer9 {
	static boolean isPrime(long n) {
		boolean flag = true;
		if(n==0||n==1) {
			return false;
		}
		for(long i=2;i<=n/2;i++) {
			if(n%i==0) {
				flag = false;
				break;
			}
		}
		return flag;
	}
	public static void main(String []args) {
		Scanner scanner =new Scanner(System.in);
		System.out.println("please enter a number :");
		long n = scanner.nextLong();
		if(isPrime(n)) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		scanner.close();
	}
}
