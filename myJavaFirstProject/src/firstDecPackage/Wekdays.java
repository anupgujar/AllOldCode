package firstDecPackage;

import java.util.Scanner;

public class Wekdays {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		switch(num) {
		case 1 : System.out.println("Day of week is Sunday");
		break;
		case 2 : System.out.println("Day of week is Monday");
		break;
		case 3 : System.out.println("Day of week is Tuesday");
		break;
		case 4 : System.out.println("Day of week is Wednesday");
		break;
		case 5 : System.out.println("Day of week is Thuraday");
		break;
		case 6 : System.out.println("Day of week is Friday");
		break;
		case 7 : System.out.println("Day of week is Satirday");
		break;
		default : System.out.println("Invalid Input");
		}
	}
}
