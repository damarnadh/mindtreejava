package set1problems;
import java.util.*;

public class Exer22 {
	static String reverseString(String temp) {
		String rev="";
		for(int i=temp.length()-1;i>=0;i--) {
			rev+=temp.charAt(i);
		}
		return rev;
	}
	public static void main(String []args) {
		Scanner scanner =new Scanner(System.in);
		System.out.println("please enter a sentence :");
		String input = scanner.nextLine();
		String res="";
		String temp="";
		for(int i=0;i<input.length();i++) {
			if(input.charAt(i)>=65 && input.charAt(i)<=90 || input.charAt(i)>=97 && input.charAt(i)<=122) {
				temp+=""+input.charAt(i);
				if(i==input.length()-1) {
					res+=reverseString(temp);
				}
			}else {
				res+=reverseString(temp);
				res+=""+input.charAt(i);
				temp="";
			}
			
		}
		System.out.println(res);
		scanner.close();
	}
}
