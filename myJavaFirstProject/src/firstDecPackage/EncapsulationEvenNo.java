package firstDecPackage;

public class EncapsulationEvenNo {
	private int n = 9;
	
	
	public int getN() {
		return n;
	}


	public void setN(int n) {
		if(n%2==0) {
			System.out.println(n+" Its an even Number");
		}else {
			System.err.println(n+" Its and odd number");
		}
		this.n = n;
	}


	public static void main(String[] args) {
		
	}
}
