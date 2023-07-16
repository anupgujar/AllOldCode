package firstDecPackage;

import java.util.Scanner;

public class StarConsole {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int num = 3; int status = 1;
		if(n>=1) {
			System.out.println("First "+n+" Numbers are =");
			System.out.println(2);
		}
	for (int count=2; count<=n;) {
		for (int i = 2; i <=Math.sqrt(num); i++) {
			if(num%i==0) {
				status = 0;
				break;
			}
		}
		if(status!=0) {
			System.out.println(num);
			count++;
		}
		status=1;
		num++;
	}
		 
	 
}
}	


