package newcap2problems;

import java.util.Scanner;

public class cap2prob3 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		String data =sc.nextLine();
		String res="";
		String temp="";
		for(int i=0;i<data.length();i++) {
			if(data.charAt(i)==' ') {
				res += temp.charAt(0)+""+temp.length()+" ";
				temp="";
			}else {
				temp += data.charAt(i);
			}
		}
		res += temp.charAt(0)+""+temp.length();
		System.out.println(res);
		sc.close();
	}

}
