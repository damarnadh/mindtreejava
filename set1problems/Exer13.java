package set1problems;
import java.util.*;

public class Exer13 {
	static void search(int arr[],int key,int len) {
		for(int i=0;i<len;i++) {
			if(arr[i]==key) {
				System.out.println("true");
				return;
			}
		}
		System.out.println("false");
	}
	public static void main(String []args) {
		
		Scanner scanner =new Scanner(System.in);
		System.out.println("please enter the size of array :");
		int n = scanner.nextInt();
		int arr[]=new int [n];
		System.out.println("please enter the elements of array :");
		for(int i=0;i<n;i++) {
			arr[i]=scanner.nextInt();
		}
		int key =scanner.nextInt();
		search(arr,key,n);
		scanner.close();
	}
}
