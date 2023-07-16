package firstDecPackage;

public class SuperDog extends SuperAnimal{
	String color = "Brown";
	
	public void printColor() {
		super.printColor();
		System.out.println(super.color);
		System.out.println("Child class ");
	}
	public static void main(String[] args) {
		SuperDog s1 = new SuperDog();
		System.out.println(s1.color);
		s1.printColor();
		
		
	}
}
