package firstDecPackage;

public class MultilevelInheritance1 extends MultilevelInheritance {
	
	public void Sub(int num1, int num2) {
		a=num1-num2;
		System.out.println("Sub is---->"+a);
	}
	public void div(int num1, int num2) {
		a=num1/num2;
		System.out.println("Div is---->"+a);
	}
	public static void main(String[] args) {
		int x=100; int y = 200;
		MultilevelInheritance1 s1 = new MultilevelInheritance1();
			s1.add(x, y);
			s1.multi(x, y);
			s1.Sub(x, y);
			s1.div(x, y);
	}
}
