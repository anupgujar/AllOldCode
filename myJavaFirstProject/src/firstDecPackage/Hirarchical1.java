package firstDecPackage;

public class Hirarchical1 extends Hirarchical{
	
	public void Sub(int num1, int num2) {
		a=num1-num2;
		System.out.println("Sub is---->"+a);
	}
	public static void main(String[] args) {
		int x =1; int y = 3;
		Hirarchical1 H1 = new Hirarchical1();
		H1.add(x, y);
		H1.Sub(x, y);
	}
	
}
