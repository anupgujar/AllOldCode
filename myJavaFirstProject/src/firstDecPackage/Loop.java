package firstDecPackage;

import java.util.Scanner;

public class Loop {
	public static void main(String[] args) {
  //Classname objname = new Classname(parameter);	
	Scanner sc = new Scanner(System.in); //input you want to take at runtime
	System.out.println("Enter the number of rows");
	int rows = sc.nextInt();
	System.out.println("Enter the number of column");
	int col = sc.nextInt();
	for (int i = 1; i <=rows; i++) {
		for (int j = 1; j <= col; j++) {
			System.out.print("*");
		}System.out.println();
	}
	}
}
