package firstDecPackage;

public class LearnString {

	public static void main(String[] args) {
		String q = "Selenium Class";
		String p = "Selenium Class";
		String r = new String("Selenium Class");
		String s = new String("Selenium Class");
		if(p == q) {
			System.out.println("First");
		}
		if(p == r) {
			System.out.println("Second");
		}
		if(p == s) {
			System.out.println("Third");
		}
		if(r == s) {
			System.out.println("Forth");
		}
		if(r.equals(s)) {
			System.out.println("Fifth");
		}

	}

}
