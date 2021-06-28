package set2problems;

import java.util.Scanner;

public class Exer34 {
	static Scanner scanner = new Scanner(System.in);
	static void showMenu() {
		System.out.println("1. create student record");
		System.out.println("2. display student name based on branch(alphabatical order)");
		System.out.println("3. display student ID in ascending sorted order");
	}
	static Student34 createRecord() {
		Student34 student = new Student34();
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
		return student;
	}
	static void displayStudentNames(Student34 arr[],int len) {
		for(int i=0;i<len-1;i++) {
			for(int j=i+1;j<len;j++) {
				if(arr[i].getStudentBranch().charAt(0)>arr[j].getStudentBranch().charAt(0)) {
					Student34 temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("After soring the array student Names are:");
		for(int i=0;i<len;i++) {
			System.out.println(arr[i].getStudentName());
		}
	}
	static void displayStudentIds(Student34 arr[],int len) {
		for(int i=0;i<len-1;i++) {
			for(int j=i+1;j<len;j++) {
				if(arr[i].getStudentId()>arr[j].getStudentId()) {
					Student34 temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("After soring the array student ids are:");
		for(int i=0;i<len;i++) {
			System.out.println(arr[i].getStudentId());
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter number of students");
		int n =scanner.nextInt();
		Student34 studArr[]=new Student34[n];
		while(true) {
			showMenu();
			
			System.out.println("Enter your choice");
			int choice =scanner.nextInt();
			switch(choice){
				case 1:{
					
					for(int i=0;i<n;i++) {
						studArr[i]=createRecord();
					}
					
					break;
				}
				case 2:{
					
					displayStudentNames(studArr,n);
					break;
				}
				case 3:{
					displayStudentIds(studArr,n);
					break;
				}
				default:{
					break;
				}
			}
		}

	}

}
