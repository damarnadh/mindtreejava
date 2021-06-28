package set1problems;
import java.util.*;

public class Exer10 {
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
	static List<Long> getPrimes(long start,long end) {
		List<Long>list=new ArrayList<>();
		for(long i=start;i<end;i++) {
			if(isPrime(i)) {
				list.add(i);
			}
		}
		return list;
	}
	public static void main(String []args) {
		List<Long>res=new ArrayList<>();
		Scanner scanner =new Scanner(System.in);
		System.out.println("please enter a start number :");
		long start = scanner.nextLong();
		System.out.println("please enter a end number :");
		long end = scanner.nextLong();
		res=getPrimes(start,end);
		System.out.print(res);
		scanner.close();
	}
}
