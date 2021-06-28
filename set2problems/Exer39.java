package set2problems;

import java.util.Scanner;

public class Exer39 {
	public static boolean rowMagic(int arr[][]) {
		boolean rowMagic=true;
		int rowSumMain=0;
		for(int i=0;i<arr.length;i++) {
			int rowSum=0;
			for(int j=0;j<arr[0].length;j++) {
				rowSum+=arr[i][j];
			}
			if(i==0) {
				rowSumMain=rowSum;
			}else {
				if(rowSum!=rowSumMain) {
					rowMagic=false;
					break;
				}
			}
		}
		return rowMagic;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of rows : ");
		int m = scanner.nextInt();
		System.out.println("Enter the number of rows : ");
		int n = scanner.nextInt();
		int arr[][] =new int[m][n];
		System.out.println("Enter the elements of matrix : ");
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				arr[i][j]=scanner.nextInt();
				scanner.nextLine();
			}
		}
		if(rowMagic(arr)) {
			System.out.println("It is a row magic matrix");
		}else {
			System.out.println("It is not a row magic matrix");
		}
		scanner.close();
	}
}
