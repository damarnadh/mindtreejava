package set2problems;
import java.util.*;

public class Exer36 {
	static void printArray(int arr[],int n) {
		for(int i=0;i<n-1;i++) {
			System.out.print(arr[i]+",");
		}
		System.out.println(arr[n-1]);
	}
	static int[] findUnique(int arr1[],int arr2[]) {
		int res[] =new int[arr1.length+arr2.length];
		int position=0;
		for(int i=0;i<arr1.length;i++) {
			boolean notPresent=true;
			for(int j=0;j<arr2.length;j++) {
				if(arr1[i]==arr2[j]) {
					notPresent=false;
				}
			}
			if(notPresent) {
				res[position++]=arr1[i];
			}
		}
		for(int i=0;i<arr2.length;i++) {
			boolean notPresent=true;
			for(int j=0;j<arr1.length;j++) {
				if(arr2[i]==arr1[j]) {
					notPresent=false;
				}
			}
			if(notPresent) {
				res[position++]=arr2[i];
			}
		}
		
		System.out.println("After soring the array is:");
		printArray(res,position);
		return res;
	}
	public static void main(String []args) {
		Scanner scanner =new Scanner(System.in);
		System.out.println("please enter the size of array 1:");
		int m = scanner.nextInt();
		int arr1[]=new int [m];
		System.out.println("please enter the elements of array 1:");
		for(int i=0;i<m;i++) {
			arr1[i]=scanner.nextInt();
		}
		System.out.println("please enter the size of array 2:");
		int n = scanner.nextInt();
		int arr2[]=new int [n];
		System.out.println("please enter the elements of array 2:");
		for(int i=0;i<n;i++) {
			arr2[i]=scanner.nextInt();
		}
		findUnique(arr1,arr2);
		scanner.close();
	}
}
