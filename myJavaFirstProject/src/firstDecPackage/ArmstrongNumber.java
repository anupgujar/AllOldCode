package firstDecPackage;

import java.util.Scanner;

public class ArmstrongNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int z, count=0; int sum =0;
		z=n;
		while(z>0) {
			z=z/10;
			count++;
		}System.out.println(count);
		z=n;
		while(z>0) {
			int prod=1,digit;
			digit=z%10;
			for (int i = 1; i <=count; i++) {
				prod = prod*digit;
			}
			sum = sum+prod;
			z=z/10;
		}System.out.println(sum);
	if(sum==n) {
		System.out.println("Its an Armstrong Number");
	}else {System.out.println("Its not an Armstrong Number");}
	
	}
}
