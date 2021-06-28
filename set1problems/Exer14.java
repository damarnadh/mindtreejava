package set1problems;
import java.util.*;

public class Exer14 {
	static boolean searchInteger(int arr[], int l, int r, int key){
        if (r >= l) {
            int mid = l + (r - l) / 2;
            if (arr[mid] == key) {
            	System.out.println("true");
            	return true;
            }
            if (arr[mid] > key) {
                return searchInteger(arr, l, mid - 1, key);
            }
            return searchInteger(arr, mid + 1, r, key);
        }
 
        System.out.println(false);
        return false;
    }
	static boolean searchString(String arr[], int l, int r, String key){
        if (r >= l) {
            int mid = l + (r - l) / 2;
            if (arr[mid].equals(key)) {
            	System.out.println("true");
            	return true;
            }
            if (arr[mid].charAt(0) > key.charAt(0)) {
                return searchString(arr, l, mid - 1, key);
            }
            return searchString(arr, mid + 1, r, key);
        }
 
        System.out.println(false);
        return false;
    }
	static void searchString(String arr[],String key,int len) {
		for(int i=0;i<len;i++) {
			if(arr[i].equals(key)) {
				System.out.println("true");
				return;
			}
		}
		System.out.println("false");
	}
	static int[] sortBubbleInteger(int arr[],int len) {
		for(int i=0;i<len-1;i++) {
			for(int j=i+1;j<len;j++) {
				if(arr[i]>arr[j]) {
					int temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		return arr;
	}
	static String[] sortBubbleString(String arr[],int len) {
		for(int i=0;i<len-1;i++) {
			for(int j=i+1;j<len;j++) {
				if(arr[i].charAt(0)>arr[j].charAt(0)) {
					String temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		return arr;
	}
	static void binarySearchInteger() {
		Scanner scanner =new Scanner(System.in);
		System.out.println("please enter the size of array :");
		int n = scanner.nextInt();
		int arr[]=new int [n];
		System.out.println("please enter the elements of array :");
		for(int i=0;i<n;i++) {
			arr[i]=scanner.nextInt();
		}
		System.out.println("please enter key to search :");
		int key =scanner.nextInt();
		arr=sortBubbleInteger(arr,n);
		searchInteger(arr,0,n,key);
		scanner.close();
	}
	static void binarySearchString() {
		Scanner scanner =new Scanner(System.in);
		System.out.println("please enter the size of array :");
		int n = scanner.nextInt();
		scanner.nextLine();
		String arr[]=new String [n];
		System.out.println("please enter the elements of array :");
		for(int i=0;i<n;i++) {
			arr[i]=scanner.nextLine();
		}
		arr=sortBubbleString(arr,n);
		System.out.println("please enter key to search :");
		String key =scanner.nextLine();
		searchString(arr,0,n,key);
		scanner.close();
	}
	static void showMenu() {
		System.out.println("Menu :");
		System.out.println("1. Binary search for integer elements :");
		System.out.println("2. Binary search for string elements :");
		System.out.println("3. Exit :");
	}
	public static void main(String []args) {
		showMenu();
		Scanner scanner =new Scanner(System.in);
		int n = scanner.nextInt();
		switch(n) {
		case 1:binarySearchInteger();break;
		case 2:binarySearchString();break;
		default:break;
		}
		scanner.close();
		return;
	}
}
