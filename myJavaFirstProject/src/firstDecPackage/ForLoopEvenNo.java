package firstDecPackage;

import java.util.Scanner;

public class ForLoopEvenNo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		/*
		 * for(int i=1; i<n; i++) { if(i%2!=0) { System.out.println(i +
		 * " Its an even number"); } }
		 */
		int j=1;
		while(j<=n) {
			if(j%2!=0) {
				System.out.println(j + " Its an even number");
			}j++;
		}
	}
}
