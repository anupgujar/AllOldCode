package firstDecPackage;

public class Relational1 {

	public static void main(String[] args) {
		int age=59;
		
		if(age>18) {
			System.out.println("Ypu need to pay full bus ticket");
			if(age>60) {
				System.out.println("You are senior citizen tou need to pay 50%");
			}
		}
	
		else {
			System.out.println("You need to pay 25% of bus ticket");
		}
	

}
}
