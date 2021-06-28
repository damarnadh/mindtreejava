package set2problems;

public class Student {
	private int studentId;
	private String studentName;
	private float marks;
	public Student(int studentId, String studentName, boolean secondChance) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.secondChance = secondChance;
	}
	private boolean secondChance;	
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public float getMarks() {
		return marks;
	}
	public void setMarks(float marks) {
		this.marks = marks;
	}
	public boolean isSecondChance() {
		return secondChance;
	}
	public void setSecondChance(boolean secondChance) {
		this.secondChance = secondChance;
	}
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	public void identifyMarks(float marks){
		this.setMarks(marks);
	}
	
	public void identifyMarks(float marks1, float marks2) {
		if(marks1>marks2) {
			this.setMarks(marks1);
		}else {
			this.setMarks(marks2);
		}
	}
}
