package firstDecPackage;

public class AbstractClass1 extends AbstractClass {

	@Override
	public void data() {
		System.out.println("Thos is Abstsct method");
		
	}
	public static void main(String[] args) {
		AbstractClass1 a1 = new AbstractClass1();
		
		a1.data();
		a1.sum();
		a1.play();
	}
	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("This is Abstsct method");
		
	}

}
