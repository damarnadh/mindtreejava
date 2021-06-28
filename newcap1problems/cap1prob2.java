package newcap1problems;

import java.util.Scanner;

public class cap1prob2 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		Double num =sc.nextDouble();
		String numStr=""+num;
		int strlen=numStr.length();
		String resStr="";
		for(int i=0;i<strlen;i++) {
			if(numStr.charAt(i)=='.') {
				String revStr="";
				for(int j=resStr.length()-1;j>=0;j--) {
					revStr+=resStr.charAt(j);
				}
				resStr=revStr;
			}
			resStr += numStr.charAt(i);
			
		}
		System.out.println(resStr);
		sc.close();
	}

}
