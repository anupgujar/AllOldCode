package firstDecPackage;

public class SingleInheritance {
	int rollNumber = 1;
	
	public void methodA() {
		rollNumber = 65;
		System.out.println(rollNumber);
		int a = 12; int b = 2;
		int Sum = a+b;
		System.out.println("Sum of a and b is =" +Sum);
	}
	 public static void main(String[] args) {
		 SingleInheritance s1 = new SingleInheritance();
		System.out.println(s1.rollNumber);
	}
}
