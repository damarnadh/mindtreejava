package set1problems;
import java.util.*;

public class TestUSN {
	
	public static void main(String []args) {
		Scanner scanner =new Scanner(System.in);
		System.out.println("please enter USN :");
		String usn = scanner.nextLine();
		String temp = ""+usn.charAt(5)+usn.charAt(6);
		if(usn.length()!=10) {
			System.out.println("Failure");
		}
		if(usn.charAt(0)!='1' && usn.charAt(0)!='2') {
			System.out.println("Failure");
		}else if(usn.charAt(1)<65 && usn.charAt(1)>90 && usn.charAt(2)<65 && usn.charAt(2)>90) {
			System.out.println("Failure");
		}else if(usn.charAt(3)<48 && usn.charAt(3)>57 && usn.charAt(4)<48 && usn.charAt(4)>57) {
			System.out.println("Failure");
		}else if(!temp.equals("CS") && !temp.equals("IS") && !temp.equals("EC") && !temp.equals("ME")) {
			System.out.println("Failure");
		}else if(usn.charAt(7)<48 && usn.charAt(7)>57 && usn.charAt(8)<48 && usn.charAt(8)>57&& usn.charAt(9)<48 && usn.charAt(9)>57) {
			System.out.println("Failure");
		}else {
			System.out.println("Success");
		}
		scanner.close();
	}
}
