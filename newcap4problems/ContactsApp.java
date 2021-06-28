package newcap4problems;

import java.util.Scanner;

public class ContactsApp {
	static Scanner sc=new Scanner(System.in);
	
	
	private static void updatePhoneNumber(Contact[] list) {
		System.out.println("Please enter id of contact:");
		int id = sc.nextInt();
		sc.nextLine();
		for(int i=0;i<list.length;i++) {
			if(list[i].getId()==id) {
				System.out.println("please enter new phone number");
				String newnum = sc.nextLine();
				list[i].setContactnumber(newnum);
			}
		}
	}

	private static void searchByName(Contact[] list) {
		System.out.println("Please enter name to search");
		String name = sc.nextLine();
		for(int i=0;i<list.length;i++) {
			if(list[i].getName().equals(name)) {
				System.out.println("The position of "+name+" is:"+i);
			}
		}
	}

	private static void sortByName(Contact[] list) {
		for(int i=0;i<list.length-1;i++) {
			for(int j=i+1;j<list.length;j++) {
				
				if(list[i].getName().charAt(0)>list[j].getName().charAt(0)) {
					Contact temp =list[i];
					list[i]=list[j];
					list[j]=temp;
				}
				
			}
		}
		System.out.println("after sorting:");
		displayContacts(list);
		
	}

	private static void displayContacts(Contact[] list) {
		System.out.println("Contacts :");
		System.out.println("===================");
		for(Contact contact:list) {
			System.out.println("id :"+contact.getId());
			System.out.println("name :"+contact.getName());
			System.out.println("phone number :"+contact.getContactnumber());
			System.out.println();
		}
		
	}
	private static void showMenu() {
		System.out.println("Menu:");
		System.out.println("==========================");
		System.out.println("1.Disply Contacts");
		System.out.println("2.Sort Contacts List");
		System.out.println("3.Search for contacts");
		System.out.println("4.Update phone number");
		System.out.println("5.exit");
		System.out.println("Please enter an option:");
		
	}
	private static void callMenu(Contact[] list) {
		showMenu();
		int option = sc.nextInt();
		sc.nextLine();
		switch(option) {
			case 1:{
				displayContacts(list);
				break;
			}
			case 2:{
				sortByName(list);
				break;
			}
			case 3:{
				searchByName(list);
				break;
			}
			case 4:{
				updatePhoneNumber(list);
				break;
			}
			case 5:{
				return;
			}
			default:{
				System.out.println("Please enter valid option");
				break;
			}
		}
		callMenu(list);
	}



	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter number of contacts:");
		int n = sc.nextInt();
		sc.nextLine();
		Contact contactArr[]=new Contact[n];
		for(int i=0;i<n;i++) {
			System.out.println("Enter name of contact:");
			String name = sc.nextLine();
			System.out.println("Enter phone number of contact:");
			String phonenum = sc.nextLine();
			Contact contactObj=new Contact(i,name,phonenum);
			contactArr[i]=contactObj;
		}
		callMenu(contactArr);
		
	}
}