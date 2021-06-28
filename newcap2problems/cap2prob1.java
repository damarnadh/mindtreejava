package newcap2problems;

import java.util.Scanner;

public class cap2prob1 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int len =sc.nextInt();
		int squMat[][]=new int[len][len];
		int flatArr[] =new int[len];
		for(int i=0;i<len;i++) {
			for(int j=0;j<len;j++) {
				squMat[i][j]=sc.nextInt();
			}
		}
		
		for(int i=0;i<len;i++) {
			for(int j=0;j<len;j++) {
				System.out.print(squMat[i][j]+" ");
				flatArr[j]=flatArr[j]+squMat[i][j];
			}
			System.out.println();
		}
		for(int i=0;i<len;i++) {
			System.out.print(flatArr[i]+",");
		}
		sc.close();
	}

}
