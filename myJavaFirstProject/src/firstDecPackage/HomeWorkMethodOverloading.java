package firstDecPackage;
	
public class HomeWorkMethodOverloading {
		int sum;
	public void sum(int num1, int num2) {
		sum=num1+num2;
		System.out.println(sum);
	}
	public void sum(int num1, int num2,int num3, int num4) {
		sum=num1+num2+num3+num4;
		System.out.println(sum);
	}
}
