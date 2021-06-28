package set2problems;
import java.util.*;

public class Exer27 {
	
	public static void main(String []args) {
		Employee employee =new Employee();
	
		Scanner scanner =new Scanner(System.in);

		System.out.println("please enter employee id :");
		int id = scanner.nextInt();
		scanner.nextLine();
		employee.setEmpId(id);
		System.out.println("please enter employee name :");
		String name = scanner.nextLine();
		employee.setEmpName(name);
		System.out.println("please enter employee desig :");
		String desig = scanner.nextLine();
		employee.setEmpDesig(desig);
		System.out.println("please enter employee dept :");
		String dept = scanner.nextLine();
		employee.setEmpDept(dept);
		scanner.close();
	}
}
