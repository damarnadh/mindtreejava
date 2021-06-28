package newcap3problems;

import java.util.Scanner;

public class cap3prob2 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int len =sc.nextInt();
		int flatArr[] =new int[len];
		for(int i=0;i<len;i++) {
			flatArr[i]=sc.nextInt();
		}
		int key =sc.nextInt();
		sc.close();	
		for(int x=0;x<len;x++) {
			if(flatArr[x]==key) {
				System.out.println("found at index "+x);
				return;
			}
		}
		System.out.println("not found !!");
		
	}
}
