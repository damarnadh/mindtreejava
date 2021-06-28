package set1problems;
import java.util.*;

public class Exer15 {
	static void printArray(int arr[],int n) {
		for(int i=0;i<n-1;i++) {
			System.out.print(arr[i]+",");
		}
		System.out.println(arr[n-1]);
	}
	static void sort(int arr[],int len) {
		for(int i=1;i<len;i++) {
			int key= arr[i];
			
			int j=i-1;
			while(j>=0&&arr[j]>key) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=key;
		}
		System.out.println("After soring the array is:");
		printArray(arr,len);
		
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
		printArray(arr,n);
		sort(arr,n);
		scanner.close();
	}
}
