package newcap2problems;

import java.util.Scanner;

public class cap2prob2 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int len =sc.nextInt();
		int squMat[][]=new int[len][len];
		for(int i=0;i<len;i++) {
			for(int j=0;j<len;j++) {
				squMat[i][j]=sc.nextInt();
			}
		}
		
		for(int i=0;i<len;i++) {
			for(int j=0;j<len;j++) {
				System.out.print(squMat[i][j]+" ");
			}
			System.out.println();
		}
		for(int i=0;i<len;i++) {
			for(int j=0;j<len;j++) {
				if(i<=j) {
					squMat[i][j]=0;
				}
				System.out.print(squMat[i][j]+" ");
			}
			System.out.println();
		}
		sc.close();
	}

}
