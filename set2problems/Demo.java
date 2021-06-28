package set2problems;

import java.util.Scanner;

public class Demo {
	static Scanner scanner =new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		while(true) {
			System.out.println("Enter Id of student :");
			int studentId = scanner.nextInt();
			scanner.nextLine();
			System.out.println("Enter Name of student :");
			String studentName = scanner.nextLine();
			System.out.println("Is this 2 nd attempt of student ?");
			boolean secondChance = scanner.nextBoolean();
			
			Student student1 = new Student(studentId,studentName,secondChance);
			if(student1.isSecondChance()) {
				System.out.println("Enter 1 st attempt marks of student");
				float marks1=scanner.nextFloat();
				System.out.println("Enter 2 nd attempt marks of student");
				float marks2=scanner.nextFloat();
				student1.identifyMarks(marks1,marks2);
			}else {
				System.out.println("Enter marks of student");
				float marks1=scanner.nextFloat();
				student1.identifyMarks(marks1);
			}
			System.out.println(student1.getStudentId()+", "+student1.getStudentName()+", "+student1.getMarks()+", "+student1.isSecondChance());
		}
	}

}
