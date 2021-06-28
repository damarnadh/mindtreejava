package set2problems;

import java.util.Scanner;

public class Exer31 {
	
	public static void main(String []args) {
		Scanner scanner =new Scanner(System.in);
		int N =scanner.nextInt();
		
		Customer31 feedbackArray[] = new Customer31[N];
		for(int i=0;i<N;i++) {
			scanner.nextLine();
			Customer31 customer =new Customer31();
			customer.setName(scanner.nextLine());
			customer.setMobileNo(scanner.nextLine());
			customer.setFeedbackRating(scanner.nextDouble());
			feedbackArray[i]=customer;
			System.out.println(feedbackArray[i].getName()+", "+feedbackArray[i].getMobileNo()+", "+feedbackArray[i].getFeedbackRating());
		}
		scanner.close();
	}
}
