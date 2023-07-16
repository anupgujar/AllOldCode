package secondDec;

import firstDecPackage.AccessMordifierProtected;

public class AccessMordifierProtected2 extends AccessMordifierProtected {
	
	public static void main(String[] args) {
		AccessMordifierProtected2 s3 = new AccessMordifierProtected2();
		s3.b=27;
		s3.sum();
		System.out.println(s3.b);
		
	}
}
