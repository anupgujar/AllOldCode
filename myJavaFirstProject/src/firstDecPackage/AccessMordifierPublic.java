package firstDecPackage;

public class AccessMordifierPublic {
	public int x = 90;
	public void div() {
		System.out.println("This is public class "+x);
	}
	public static void main(String[] args) {
		AccessMordifierPublic x1 = new AccessMordifierPublic();
		x1.div();
		x1.x=98;
		x1.div();
	}
}
