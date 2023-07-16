package firstDecPackage;

import java.util.Scanner;

public class EncapsulationOddNo {
	Scanner sc = new Scanner(System.in);
	private int n=23;
	
	
	public int getN() {
		return n;
	}


	public void setN(int n) {
		if(n%2!=0) {
			System.out.println(n+" Its an Odd Number");
		}else {
			System.out.println(n+" Its an even number");
		}
		this.n = n;
	}


	public static void main(String[] args) {
		
	}
}
