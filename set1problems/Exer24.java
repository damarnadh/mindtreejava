package set1problems;
import java.util.*;

public class Exer24 {
	
	public static void main(String []args) {
		Scanner scanner =new Scanner(System.in);
		System.out.println("please enter a name :");
		String name = scanner.nextLine();
		int count=0;
		char tempMain=name.charAt(0);
		String res="";
		for(int i=0;i<name.length();i++) {
			char temp=name.charAt(i);
			if(name.charAt(i)>=65 && name.charAt(i)<=90) {//capital letter
				temp=(char) (name.charAt(i)+32);
			}
			if(temp==tempMain) {
				count++;
			}else {
				res+=""+tempMain+count;
				tempMain=temp;
				count=1;
			}
		}
		res+=""+tempMain+count;
		System.out.println(res);
		scanner.close();
	}
}
