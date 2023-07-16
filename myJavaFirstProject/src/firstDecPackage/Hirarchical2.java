package firstDecPackage;

public class Hirarchical2 extends Hirarchical{
	
	public void modulo(int num1, int num2) {
		a=num1%num2;
		System.out.println("Modulo is---->" +a);
	}
	
	public static void main(String[] args) {
		int x = 4; int y = 7;
		Hirarchical2 H2 = new Hirarchical2();
		H2.multi(x, y);
		H2.modulo(x, y);
	}

}
