package set1problems;
import java.util.*;

public class Exer25 {
	
	public static void main(String []args) {
		
		Scanner scanner =new Scanner(System.in);
		System.out.println("please enter the size of array :");
		int n = scanner.nextInt();
		int arr[]=new int [n];
		System.out.println("please enter the elements of array :");
		for(int i=0;i<n;i++) {
			arr[i]=scanner.nextInt();
		}
		for(int i=0;i<n-2;i++) {
			for(int j=i+1;j<n-1;j++) {
				for(int k=j+1;k<n;k++) {
					if(arr[i]+arr[j]==arr[k]) {
						System.out.println("<"+arr[i]+","+arr[j]+","+arr[k]+">");
					}
				}
			}
		}
		
		scanner.close();
	}
}
