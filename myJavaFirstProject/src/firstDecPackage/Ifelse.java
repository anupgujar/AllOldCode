package firstDecPackage;

import java.util.Scanner;

public class Ifelse {
	public static void main(String[] args) {
		/*
		 * Scanner sc = new Scanner(System.in); System.out.println("Enter Lenght =");
		 * int a = sc.nextInt(); System.out.println("Enter breathe ="); int b =
		 * sc.nextInt(); if(a == b) { System.out.println("its a Square"); }else {
		 * System.out.println("Its a rectangle"); }
		 */
		/*
		 * Scanner sc = new Scanner(System.in); int x = sc.nextInt(); int y
		 * =sc.nextInt(); if(x>y) { System.out.println("x is greater than y"); }else {
		 * System.out.println("y is greater than x"); }
		 */
		/*
		 * Scanner sc = new Scanner(System.in); int quantity = sc.nextInt();
		 * if(quantity*100>=1000) {
		 * System.out.println("You will get 10% discount and your total cost is " +
		 * ((quantity*100)/100)*90); }else {
		 * System.out.println("cost of purchased qun is = " +quantity*100); }
		 */
		
		
		  Scanner sc = new Scanner(System.in); 
		  
		  System.out.println("Enter your year of experience = ");
		  int e = sc.nextInt(); 
		  if(e>=5) {
			  System.out.println("Congrats..YES..! your total year of services more than 5 years");
			  System.out.println("Enter your salary ");
			  int s = sc.nextInt(); 
			  System.out.println("Your salary is =" +s);
			  System.out.println("YOUR 5% BONUS  IS..> " +s*0.05);
			  System.out.println("YOUR NET BONUS WITH SALARY IS..> "+(s+(s*0.05)));
		  }
		 	  
	}
}
	

