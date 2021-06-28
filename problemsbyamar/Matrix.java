package problemsbyamar;

import java.util.Scanner;

public class Matrix {
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
		for(int i=0;i<len;i++) {
			System.out.print(arr[i]+" ");
		}
	}
		public static void main(String []args) {
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
			
			for(int i=0;i<m;i++) {
				for(int j=0;j<n;j++) {
					System.out.print(arr[i][j]+" ");
				}
				System.out.println();
			}
			int oneDimArr[]=new int[m*n];
			int k=0;
			for(int i=0;i<m;i++) {
				for(int j=0;j<n;j++) {
					oneDimArr[k]=arr[i][j];
					k++;
				}
			}
			for(int i=0;i<m*n;i++) {
				System.out.print(oneDimArr[i]+" ");
			}
			
			int rowColSum[]=new int [m+n];
			for(int i=0;i<m;i++) {
				int colSum=0;
				int rowSum=0;
				int j;
				for(j=0;j<n;j++) {
					rowSum+=arr[i][j];
					colSum+=arr[j][i];
				}
				rowColSum[i]=rowSum;
				rowColSum[i+j]=colSum;
			}
			System.out.println();
			for(int i=0;i<m+n;i++) {
				System.out.print(rowColSum[i]+" ");
			}
			System.out.println();
			sort(rowColSum,m+n);
			scanner.close();
		}
}