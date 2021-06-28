package problemsbyamar;

import java.util.Scanner;

public class StringGender {
	public static String modify(String name) {
		String res="";
		String temp="";
		for(int i=0;i<name.length();i++) {
			temp+=""+name.charAt(i);
			if(name.charAt(i)==' ') {
				res+=temp.charAt(0)+" ";
				temp="";
			}
		}
		res+=temp;
		return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter gender :");
		String gender = scanner.nextLine();
		System.out.println("Enter name :");
		String name = scanner.nextLine();
		if(gender.equals("Male")) {
			name=modify(name);
			System.out.println("Mr."+name);
		}else {
			name=modify(name);
			System.out.println("Ms."+name);
		}
		scanner.close();
	}

}
