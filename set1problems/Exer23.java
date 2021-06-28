package set1problems;
import java.util.*;

public class Exer23 {
	
	public static void main(String []args) {
		HashMap<String,Integer>map=new HashMap<>();
		Scanner scanner =new Scanner(System.in);
		System.out.println("please enter a sentence :");
		String input = scanner.nextLine();
		String cons="";
		for(int i=0;i<input.length()-1;i++) {
			if(input.charAt(i)+1==input.charAt(i+1)) {
				if(input.charAt(i)>=97&&input.charAt(i)<=122) {
					cons =""+((char)(input.charAt(i)-32))+((char)(input.charAt(i+1)-32));
				}else {
					cons =""+input.charAt(i)+input.charAt(i+1);
				}
				if(map.containsKey(cons)) {
					map.put(cons,map.get(cons)+1);
				}else {;
					map.put(cons,1);
				}
			}
			
		}
		for (Map.Entry<String,Integer> entry : map.entrySet()) {
	        System.out.println(entry.getKey() + entry.getValue());
		}
		scanner.close();
	}
}
