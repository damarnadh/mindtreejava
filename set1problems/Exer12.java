package set1problems;
import java.util.*;

public class Exer12 {
	static void printArray(int arr[],int n) {
		for(int i=0;i<n-1;i++) {
			System.out.print(arr[i]+",");
		}
		System.out.println(arr[n-1]);
	}
	static void sort(int arr[],int len) {
		for(int i=0;i<len-1;i++) {
			for(int j=i+1;j<len;j++) {
				if(arr[i]>arr[j]) {
					int temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
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
