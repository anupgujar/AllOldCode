package firstDecPackage;

public class HomeWorkMethodOverloading1 extends HomeWorkMethodOverloading{
	public void sum(String num1, String num2) {
		
		System.out.println(num1+num2);
	}
	public void sum(int num1, int num2,int num3) {
		sum=num1+num2+num3;
		System.out.println(sum);
	}
	public static void main(String[] args) {
		int x = 1; int y = 2; int z = 3; int w = 5;
		String a = "Data"; String b = "Beta";
		HomeWorkMethodOverloading1 r1 = new HomeWorkMethodOverloading1();
		r1.sum(y, z);
		r1.sum(a, b);
		r1.sum(x, y, z, w);
		
	}
}
