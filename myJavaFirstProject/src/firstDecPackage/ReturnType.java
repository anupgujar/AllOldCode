package firstDecPackage;

public class ReturnType {
	public static void main(String[] args) {
		boolean data = castVote(9);
		if(data) {
			System.out.println("I am able to castVote");
		}else {
			System.out.println("I am not able to castVote");
		}
	}
	public static boolean castVote(int age) {
		if(age>18) {
			return true;
		}else {
			return false;
		}
		
	}
}
