package set1problems;
import java.util.*;

public class Exer5 {
	public static void main(String []args) {
		Scanner scanner =new Scanner(System.in);
		System.out.println("please enter the size of 1st array :");
		int m = scanner.nextInt();
		double arr1[]=new double [m];
		System.out.println("please enter the elements of 1st array :");
		for(int i=0;i<m;i++) {
			arr1[i]=scanner.nextDouble();
		}
		System.out.println("please enter the size of 2nd array :");
		int n = scanner.nextInt();
		double arr2[]=new double [n];
		System.out.println("please enter the elements of 2nd array :");
		for(int i=0;i<n;i++) {
			arr2[i]=scanner.nextDouble();
		}
		System.out.println("The result array is:");
		if(m>n) {
			int res[]=new int[m];
			for(int i=0;i<n;i++) {
				res[i]=(int) (arr1[i]+arr2[i]);
			}
			for(int i=n;i<m;i++) {
				res[i]=(int) arr1[i];
			}
			for(int i=0;i<m;i++) {
				System.out.println(res[i]);
			}
		}else {
			int res[]=new int[n];
			for(int i=0;i<m;i++) {
				res[i]=(int)(arr1[i]+arr2[i]);
			}
			for(int i=m;i<n;i++) {
				res[i]=(int)arr2[i];
			}
			for(int i=0;i<n;i++) {
				System.out.println(res[i]);
			}
		}
		scanner.close();
	}
}
