package firstDecPackage;

public class FinalKeyword {
	String a = "Java";
	int b = 20;
	final int c=98;
	
	public void date(int b) {
	this.b =b;
	}
	public FinalKeyword(String a, int b) {
		this.a = a;
		this.b = b;
	}
	public final void test() {
		System.out.println("This is final method");
	}
	
	public static void main(String[] args) {
		FinalKeyword s1 = new FinalKeyword("Anup", 21);
		s1.a="Automation";
		s1.b = 21;
		System.out.println(s1.c);		
		
	}
	
}
