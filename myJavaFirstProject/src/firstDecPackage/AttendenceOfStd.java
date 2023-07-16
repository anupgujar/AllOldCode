package firstDecPackage;

import java.util.Scanner;
public class AttendenceOfStd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number of classes held = ");
		int i = sc.nextInt();
		System.out.println("Enter Number of classes attended = ");
		int j = sc.nextInt();
		int Percentage;
		System.out.println("percentage of class attended = " + ( Percentage = (j*100)/i) +"%" );
		if(Percentage>=75) {
			System.out.println("Student is allowed to sit in exam");
		}else {
			System.out.println("Student is not allowed to sit in exam.");
		}
		
	}
}
