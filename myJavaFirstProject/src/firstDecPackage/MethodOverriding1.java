package firstDecPackage;

public class MethodOverriding1 {
	public static void main(String[] args) {
		MethodOverriding o1 = new MethodOverriding();
		int a=1, b =2;
		String S="Selenium", D="Automation";
		o1.sum(D, b);
		o1.sum(a, b);
	}
}
