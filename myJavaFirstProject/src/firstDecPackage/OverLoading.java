package firstDecPackage;

public class OverLoading {
	int sum;
	public void sum(int a, int b) {
		sum = a+b;
		System.out.println(sum);
	}
	public void sum(int a, int b, int c) {
		sum = a+b+c;
		System.out.println(sum);
	}
	
}
