package firstDecPackage;

public class PatternHollowButterfly {
	public static void main(String[] args) {
		int n = 4;
		//Uppar part 1st half
		for (int i = 1; i <=n; i++) {
			for (int j = 1; j <=i; j++) {
				if(j==1 || i==j) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			//print spaces
			for (int j = 1; j <=2*(n-i); j++) {
				System.out.print(" ");
			}//2nd half
			for (int j = 1; j<=i; j++) {
				if(j==n || j==1 || i==j) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();		
		}
		//Uppar part 1st half
			for (int i = n; i>=1; i--) {
				for (int j = 1; j <=i; j++) {
					if(j==1 || i==j) {
						System.out.print("*");
					}else {
						System.out.print(" ");
					}
				}//print spaces
				for (int j = 1; j <=2*(n-i); j++) {
					System.out.print(" ");
				}//2nd half
				for (int j = 1; j<=i; j++) {
					if(j==n || j==1 || i==j) {
						System.out.print("*");
					}else {
						System.out.print(" ");
					}
					}
				
				System.out.println();		
			}
	}	
}
	