package firstDecPackage;

public class AccessMordifierProtected {
	protected int b = 23;
	
	protected void sum() {
	System.out.println("This is protected class "+b);
	}
	
	public static void main(String[] args) {
		AccessMordifierProtected sc= new AccessMordifierProtected();
		sc.b=34;
		sc.sum();
	}
}
