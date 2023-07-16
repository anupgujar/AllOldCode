package firstDecPackage;

import java.util.Scanner;

public class CompareToString {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		if(s1.compareTo(s2)>0) {
			System.out.println("1st is larger than 2nd");
		}else if(s2.compareTo(s1)>00) {
			System.out.println("1st is smaller than 2nd");
		}else {
			System.out.println("Both are equal");
		}
	}
}
