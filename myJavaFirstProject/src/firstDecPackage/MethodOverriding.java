package firstDecPackage;

public class MethodOverriding {
	int sum;
	public void sum(int num1, int num2) {
		sum = num1+num2;
		System.out.println(sum);
	}
	public void sum(String num1, int num2) {
		System.out.println(num1+num2);
	}
	public static void main(String[] args) {
		MethodOverriding m1 = new MethodOverriding();
		m1.sum(1, 3);
		m1.sum("Java",  34);
	}
}
