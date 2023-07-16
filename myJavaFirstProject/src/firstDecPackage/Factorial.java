package firstDecPackage;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to get factorial");
		int n = sc.nextInt();
		int factorial=1;
		if(n<0) {
			System.out.println("Number should not be Negative--> Try again");
		}else {
			for (int i = 1; i<=n; i++) {
				factorial = factorial*i;
			}
			System.out.println("Factorial of "+n+" is = "+factorial);
		}
}
}
