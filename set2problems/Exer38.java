package set2problems;

import java.util.Scanner;

public class Exer38 {
	static int[][] sumMatrix(int[][] arr1,int[][] arr2){
		int res[][]=new int[arr1.length][arr1.length];
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr1.length;j++) {
				res[i][j]=arr1[i][j]+arr2[i][j];
			}
		}
		return res;
	}
	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		System.out.println("please enter the size of array:");
		int n = scanner.nextInt();
		int arr1[][]=new int [n][n];
		System.out.println("please enter the elements of array 1:");
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				arr1[i][j]=scanner.nextInt();
			}
		}
		int arr2[][]=new int [n][n];
		System.out.println("please enter the elements of array 2:");
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				arr2[i][j]=scanner.nextInt();
			}
		}
		int res[][]=sumMatrix(arr1,arr2);
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(res[i][j]+", ");
			}
			System.out.println();
		}
		scanner.close();
	}

}
