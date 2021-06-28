package set2problems;

public class Employee {
	int empId;
	String empName;
	String empDesig;
	String empDept;
	public Employee(int empId, String empName, String empDesig, String empDept) {
		this.empId = empId;
		this.empName = empName;
		this.empDesig = empDesig;
		this.empDept = empDept;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		if(empName.equals(null)||empName.equals("")) {
			System.out.println("Error : employee name is invalid");
			return ;
		}
		this.empName = empName;
	}
	public String getEmpDesig() {
		return empDesig;
	}
	public void setEmpDesig(String empDesig) {
		if(!empDesig.equals("developer") && !empDesig.equals("tester") && !empDesig.equals("Lead") && !empDesig.equals("manager")) {
			System.out.println("Error : Invalid Designation");
			return ;
		}
		this.empDesig = empDesig;
	}
	public String getEmpDept() {
		return empDept;
	}
	public void setEmpDept(String empDept) {
		if(!empDept.equals("TTH") && !empDept.equals("RCM") && !empDept.equals("Digital") && !empDept.equals("DevOps")) {
			System.out.println("Error : Invalid Dept");
			return ;
		}
		this.empDept = empDept;
	}
	public Employee() {
	}
}
