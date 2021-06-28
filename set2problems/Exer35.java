package set2problems;

import java.util.Scanner;

public class Exer35 {
	static Scanner scanner = new Scanner(System.in);
	
	static Student35 createRecord() {
		Student35 student = new Student35();
		System.out.println("enter student id");
		int id = scanner.nextInt();
		scanner.nextLine();
		student.setStudentId(id);
		System.out.println("enter student name");
		String name = scanner.nextLine();
		student.setStudentName(name);
		System.out.println("enter student branch");
		String branch = scanner.nextLine();
		student.setStudentBranch(branch);
		System.out.println("enter student score");
		int score = scanner.nextInt();
		scanner.nextLine();
		student.setStudentScore(score);
		return student;
	}
	static Student35 findHighestScore(Student35 arr[],int len) {
		int max=0;
		Student35 maxStudent = arr[0];
		for(int i=0;i<len;i++) {
			if(arr[i].getStudentScore()>max) {
				max=arr[i].getStudentScore();
				maxStudent = arr[i];
			}
		}
		return maxStudent;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter number of students");
		int n =scanner.nextInt();
		Student35 studArr[]=new Student35[n];
		for(int i=0;i<n;i++) {
			studArr[i]=createRecord();
		}
		Student35 student =findHighestScore(studArr,n);
		System.out.println("Details of student who scored highest marks:");
		System.out.println("student id:"+student.getStudentId());
		System.out.println("student name:"+student.getStudentName());
		System.out.println("student branch:"+student.getStudentBranch());
		System.out.println("student score:"+student.getStudentScore());
		
	}

}
