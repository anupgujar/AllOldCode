package firstDecPackage;

import java.util.Scanner;

public class SubstringOfAString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String sub;
		System.out.println("Enter a string for which need substring");
		String a = sc.nextLine();
		
		for (int i = 0; i <a.length(); i++) {
			for (int j = 1; j<=a.length()-i; j++) {
				sub = a.substring(i, i+j);
			System.out.println(sub);
			}
		}
	}
}
