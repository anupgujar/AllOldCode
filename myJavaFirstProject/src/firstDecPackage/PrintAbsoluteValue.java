package firstDecPackage;

import java.util.Scanner;

public class PrintAbsoluteValue {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		if(i<0) {
			System.out.println("Absolute Value = "+i*(-1));			
		}else {
			System.out.println("Abolute value = "+i);	
	}
}
}
