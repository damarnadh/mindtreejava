package set1problems;
import java.util.*;

public class Exer4 {
	
	public static void main(String []args) {
		
		Scanner scanner =new Scanner(System.in);
		System.out.println("please enter the size of array :");
		int n = scanner.nextInt();
		int arr[]=new int [n];
		int sum =0;
		System.out.println("please enter the elements of array :");
		for(int i=0;i<n;i++) {
			arr[i]=scanner.nextInt();
			sum+=arr[i];
		}
		System.out.print("The total sum of array is :"+sum);
		scanner.close();
	}
}
