package firstDecPackage;

import java.util.Scanner;

public class Palindrome {
	 public static void main(String args[]) {  
		    Scanner sc = new Scanner(System.in);
		    String reverse = "";
		    System.out.println("Enter String or Number to check for palindrome");
		    String a = sc.nextLine();
		    int lenght = a.length();
		    
		    for (int i = lenght-1; i>=0; i--) {
				reverse = reverse + a.charAt(i);
			}
		    if(a.equals(reverse)) {
		    	System.out.println("Its an palindrome");
		    }else {System.out.println("Its not");}
		}
}
