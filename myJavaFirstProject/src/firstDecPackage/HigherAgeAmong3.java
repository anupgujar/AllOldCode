package firstDecPackage;

import java.util.Scanner;

public class HigherAgeAmong3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first person age =");
		int Age1 = sc.nextInt();
		System.out.println("Enter second person age =");
		int Age2 = sc.nextInt();
		System.out.println("Enter Third person age =");
		int Age3 = sc.nextInt();	
		if(Age1>Age2 && Age1>Age3) {
			System.out.println("First person in oldest");
		}else if(Age2>Age1 && Age2>Age3) {
			System.out.println("Second person in oldest");
		}else if(Age3>Age1 && Age3>Age1) {
			System.out.println("Third person in oldest");
		}else {
			System.out.println("all with same ages");
		}
	}
}
