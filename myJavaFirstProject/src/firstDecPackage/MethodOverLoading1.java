package firstDecPackage;

public class MethodOverLoading1 {
	public static void main(String[] args) {
		MethodOverloading m1 = new MethodOverloading();
		int a = 9, b =8, c=7,d=6;
		m1.sum(c, d);
		m1.sum(a, b, c, d);
		m1.sum(b, c, d);
		
	}
}
