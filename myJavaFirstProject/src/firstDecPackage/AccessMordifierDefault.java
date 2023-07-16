package firstDecPackage;

public class AccessMordifierDefault {
	int age;
	void vote() {
		age = 21;
		System.out.println("I am a default class"+age);
	}
	public static void main(String[] args) {
		AccessMordifierDefault obj = new AccessMordifierDefault();
		
		obj.vote(); 
		obj.age=23;
		System.out.println(obj.age);
	}
}
