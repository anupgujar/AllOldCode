package firstDecPackage;

public class AccessMordifierPrivate {
	private int a=6;
	
	private void sum() {
		a=1;
		System.out.println(a+"Its a provate method and variable");
		
	}
	public static void main(String[] args) {
		AccessMordifierPrivate obj = new AccessMordifierPrivate();
		
		obj.sum();
		obj.a=23;
		System.out.println(obj.a);
	}
}
