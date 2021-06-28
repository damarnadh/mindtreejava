package set1problems;
import java.util.*; 

public class Exer16 {
	static void printArray(String arr[],int n) {
		for(int i=0;i<n-1;i++) {
			System.out.print(arr[i]+",");
		}
		System.out.println(arr[n-1]);
	}
	static void sortBubble(String arr[],int len) {
		for(int i=0;i<len-1;i++) {
			for(int j=i+1;j<len;j++) {
				if(arr[i].charAt(0)>arr[j].charAt(0)) {
					String temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("After soring the array in bubble sort is:");
		printArray(arr,len);
	}
	static void sortInsertion(String arr[],int len) {
		for(int i=1;i<len;i++) {
			String key= arr[i];
			
			int j=i-1;
			while(j>=0&&arr[j].charAt(0)>key.charAt(0)) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=key;
		}
		System.out.println("After soring the array in insertion sort is:");
		printArray(arr,len);
	}
	public static void main(String []args) {
		Scanner scanner =new Scanner(System.in);
		System.out.println("please enter the size of array :");
		int n = scanner.nextInt();
		String arr[]=new String [n];
		scanner.nextLine();
		System.out.println("please enter the elements of array :");
		for(int i=0;i<n;i++) {
			arr[i]=scanner.nextLine();
		}
		printArray(arr,n);
		sortBubble(arr,n);
		sortInsertion(arr,n);
		scanner.close();
	}
}
