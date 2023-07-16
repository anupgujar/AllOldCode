package firstDecPackage;

import java.util.Iterator;
import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		
		int matrix[][] = new int[m][n];
		System.out.println("enter the elements of matrix");
		for (int i = 0; i<m; i++)
			for (int j = 0; j<n; j++) 
				matrix[i][j] = sc.nextInt();
				
		int transpose[][] = new int[n][m];
		
		for (int i = 0; i <m; i++) {
			for (int j = 0; j <n; j++) 
				transpose[j][i] = matrix[i][j];
		}
		System.out.println("Transpose of matrix :--->");
		
		for (int i = 0; i < m; i++) {
			for (int j = 0; j <n; j++)
				System.out.print(transpose[i][j]+"\t");
				System.out.println();
			
		}
	}
		
}
	
 
