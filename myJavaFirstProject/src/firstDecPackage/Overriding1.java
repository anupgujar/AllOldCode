package firstDecPackage;

public class Overriding1 extends Overriding{
	public void speak(){
		System.out.println("Hindi English,German");
	}	
	public static void main(String[] args) {
		Overriding s1 = new Overriding();
		s1.speak();
	}
}

