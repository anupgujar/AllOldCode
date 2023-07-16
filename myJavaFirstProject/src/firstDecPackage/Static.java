package firstDecPackage;

public class Static{
		int a = 100;
		String p = "Hello World"; //Global variable
		static int y = 50; 		  //Static + Global Variable
		String data = "Bye";	
	public static void methodA(){	//Static method
		String data = "Hi";			//Local Variable
	System.out.println(y);
	}
	public void methodB() {		//Non Static method
		String data = "Hello";
		System.out.println(data);//java always prefer to local variable first	
		System.out.println(y);
	}
	public static void main(String[] args) {
		Static s1 = new Static();
		s1.methodB();
		methodA();
	
	}
}

