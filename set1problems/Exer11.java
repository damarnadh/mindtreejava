package set1problems;
import java.util.*;

public class Exer11 {
	
	static double getTriangleArea() {
		Scanner scanner =new Scanner(System.in);
		System.out.println("please enter base of triangle :");
		long base = scanner.nextLong();
		System.out.println("please enter height of triangle :");
		long height = scanner.nextLong();
		double area= 0.5 * base *height;
		scanner.close();
		return area;
	}
	static double getSquareArea() {
		Scanner scanner =new Scanner(System.in);
		System.out.println("please enter side of square :");
		long side = scanner.nextLong();
		double area= side*side;
		scanner.close();
		return area;
	}
	static double getRectangleArea() {
		Scanner scanner =new Scanner(System.in);
		System.out.println("please enter length of rectangle :");
		long length = scanner.nextLong();
		System.out.println("please enter breadth of rectangle :");
		long breadth = scanner.nextLong();
		double area= length*breadth;
		scanner.close();
		return area;
	}
	static double getCircleArea() {
		Scanner scanner =new Scanner(System.in);
		System.out.println("please enter a radius of circle :");
		long radius = scanner.nextLong();
		double area = (22/7)*radius*radius;
		scanner.close();
		return area;
	}
	static double getArea(String shape) {
		switch(shape) {
		case  "triangle":return getTriangleArea();
		case  "square":return getSquareArea();
		case  "rectangle":return getRectangleArea();
		case  "circle":return getCircleArea();
		default:System.out.println("please enter a valid shape:");return -1;
			
		}
	}
	public static void main(String []args) {
		Scanner scanner =new Scanner(System.in);
		System.out.println("please enter shape :");
		String shape = scanner.nextLine();
		double area = getArea(shape);
		area = area*100;
		area =(double)((int)area);
		area =area/100;
		System.out.printf("area of"+shape+"is :"+area);
		scanner.close();
	}
}
