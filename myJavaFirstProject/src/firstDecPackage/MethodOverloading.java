package firstDecPackage;

public class MethodOverloading {
	int sum;
	public void sum(int num1, int num2) {
		sum = num1+num2;
		System.out.println(sum);
	}
	public void sum(int num1, int num2, int num3) {
		sum = num1+num2+num3;
		System.out.println(sum);
	}
	public void sum(int num1, int num2, int num3, int num4) {
		sum = num1+num2+num3+num4;
		System.out.println(sum);
	}
	public static void main(String[] args) {
		int x=1; int y =2; int z=3; int a=4;
		MethodOverloading n1 = new MethodOverloading();
		n1.sum(z, a);
		n1.sum(x, y, z, a);
		n1.sum(x,y);
	}
}
