package firstDecPackage;

public class Pattern1 {
	public static void main(String[] args) {
		int n = 4;
		int m = 5;
		for(int i=1; i<=n; i++) {
			
			for(int j=1; j<=m; j++) {
				
				if(i==1 || j==1 || i==n || j==m) {
					
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}System.out.println();
		}
		
		int p = 5;
		int q = 4;
		for(int i=0; i<p; i++) {
			for(int j=0; j<q; j++) {
			if(i == 0 || i == p-1 || j == 0 || j == q-1) {
			System.out.print("*");
			} else {
			System.out.print(" ");
			}
			}
			System.out.println();

	
	}
		int r = 5;
		int s = 4;
		for(int i=1; i<=r; i++) {
			
			for(int j=1; j<=s; j++) {
				
				if(i==1 || j==1 || i==r || j==s) {
					
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}System.out.println();
		}
	
	}
}
