package firstDecPackage;

public class Break1 {
	public static void main(String[] args) {
		for (int i = 1; i <4; i++) {
			for (int j = 1; j <4; j++) {
				if(i==2 && j==2) {
					//break;
					continue;
				}System.out.println(i+"......"+j);
			}System.out.println("Outer Loop Body");
		}
	}
}