package firstDecPackage;

public class MethodA {
	public static void main(String[] args) {
		int i = sum(10,30);
		System.out.println(i);
		int j = sum(20,30);
		System.out.println(j);
	}

	public static int sum(int num1 , int num2) {
		int sum = num1 + num2;
//		System.out.println(sum);
		return sum;
	}
}
