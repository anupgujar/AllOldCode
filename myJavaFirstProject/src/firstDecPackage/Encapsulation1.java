package firstDecPackage;

public class Encapsulation1 {
	public static void main(String[] args) {
		Encapsulation s1 = new Encapsulation();
		//s1.ageForVote=2;
		s1.setAgeForVote(28);
		System.out.println(s1.getAgeForVote());
	}
}
