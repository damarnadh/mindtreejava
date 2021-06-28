package set1problems;
import java.util.*;

public class Exer3 {
	public static void main(String []args) {
		Scanner scanner =new Scanner(System.in);
		System.out.println("please enter a number :");
		int n = scanner.nextInt();
		
		int count =0;
		while(n!=1) {
			if(n%2==0) {
				System.out.print(n+" is even so i take half :");
				n=n/2;
				System.out.println(n);
			}else {
				System.out.print(n+" is odd so i make 3n+1 :");
				n=(3*n)+1;
				System.out.println(n);
			}
			count++;
		}
		System.out.print("There are total "+count+" steps to reach 1");
		scanner.close();
	}
}
