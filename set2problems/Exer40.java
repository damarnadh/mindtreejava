package set2problems;

import java.util.Scanner;

public class Exer40 {
	public static boolean isMagic(int arr[][]) {
		boolean isMagic=true;
		int totalSum=0;
		int diaSum1=0;
		int diaSum2=0;
		for(int i=0;i<arr.length;i++) {
			int rowSum=0;
			int colSum=0;
			for(int j=0;j<arr[0].length;j++) {
				rowSum+=arr[i][j];
				colSum+=arr[j][i];
				if(i==j) {
					diaSum1+=arr[i][j];
				}
				if(i==arr.length-1-j) {
					diaSum2+=arr[i][j];
				}
			}
			if(i==0) {
				totalSum=rowSum;
			}else {
				if(rowSum!=totalSum) {
					System.out.println("rowSum "+colSum+"totalSum "+totalSum);
					isMagic=false;
					break;
				}
				if(colSum!=totalSum) {
					System.out.println("colSum "+colSum+"totalSum "+totalSum);
					isMagic=false;
					break;
				}
			}
		}
		if(diaSum1!=totalSum || diaSum2!= totalSum) {
			System.out.println("diagonals not equal "+diaSum1+" "+diaSum2);
			isMagic=false;
		}
		return isMagic;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of rows : ");
		int m = scanner.nextInt();
		System.out.println("Enter the number of columns : ");
		int n = scanner.nextInt();
		int arr[][] =new int[m][n];
		System.out.println("Enter the elements of matrix : ");
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				arr[i][j]=scanner.nextInt();
				scanner.nextLine();
			}
		}
		if(isMagic(arr)) {
			System.out.println("It is a magic matrix");
		}else {
			System.out.println("It is not a magic matrix");
		}
		scanner.close();
	}
}
