package firstDecPackage;

import java.util.Scanner;

public class Loop1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String input : ");
		String data = sc.nextLine();
		System.out.println("Enter the float value : ");
		float data1 = sc.nextFloat();
		System.out.println("Enter the Double value : ");
		double data2 = sc.nextDouble();
		System.out.println("Enter the number of rows in int");
		int rows = sc.nextInt();
		System.out.println("Enter the number of column in int");
		int col = sc.nextInt();
		
		for (int i = 1; i <= rows ; i++) {
			for (int j = 1; j <= col; j++) {
				System.out.print("*");
			}System.out.println();
		}
		
	}
}
