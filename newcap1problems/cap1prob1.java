package newcap1problems;

import java.util.Scanner;

public class cap1prob1 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int num =sc.nextInt();
		String numStr=""+num;
		int newNum=0;
		int strlen=numStr.length();
		for(int i=strlen-1;i>=0;i--) {
			
			newNum = (newNum*10)+(numStr.charAt(i))-48;
			if(strlen%2==0 && i==strlen/2) {
				newNum =(newNum*10);
			}
			
		}
		System.out.println(newNum);
		sc.close();
	}

}
