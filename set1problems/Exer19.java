package set1problems;
import java.util.*;

public class Exer19 {
	static void getNewNames(String res) {
		String names[]=new String[4];
		int j=0;
		String name="";
		for(int i=0;i<res.length();i++) { 
			if(res.charAt(i)!=' ') {		
				name+=res.charAt(i);
			}else {
				names[j]=name;
				name="";
				j++;
			}
		}
		names[3]=name;
		System.out.println("new names are, "+names[0]+" "+names[3]+", "+names[2]+" "+names[1]);
	}
	static void getNames(){
		Scanner scanner =new Scanner(System.in);
		System.out.println("please enter a first name :");
		String fName = scanner.nextLine();
		System.out.println("please enter a second name :");
		String sName = scanner.nextLine();
		String res =fName+" "+sName;
		getNewNames(res);
		scanner.close();
	}
	public static void main(String []args) {
		getNames();
	}
}
