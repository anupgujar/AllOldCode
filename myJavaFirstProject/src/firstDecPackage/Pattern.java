package firstDecPackage;

public class Pattern {
	public static void main(String[] args) {
		int n = 4;
		int m = 5;
		
		for(int i=1; i<=n; i++) { //Outer Loop
			
			for(int j=1; j<=m; j++) {  //Inner Loop
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
