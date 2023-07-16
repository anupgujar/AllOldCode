package firstDecPackage;

public class OverLoading2 extends OverLoading {

	public void sum(int a, int b) {
		sum = a+b;
		System.out.println(sum);
	}
	public void sum(int a, int b, int c) {
		sum = a+b+c;
		System.out.println(sum);
	}
	
	public static void main(String[] args) {
		OverLoading s1 = new OverLoading();
		int x=1; int y = 2; int z=3;
		s1.sum(y, z);
		s1.sum(x, y, z);
		
	}
}
