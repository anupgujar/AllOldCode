package firstDecPackage;

public class Encapsulation {
	private int ageForVote=29; //data + method 	merge
	
	
	
	public int getAgeForVote() {
		return ageForVote;
	}

	public void setAgeForVote(int ageForVote) {
		if(ageForVote<18) {
			System.out.println("Age should be more that 18");
		}else {
			
		}
		this.ageForVote = ageForVote;
	}

	public static void main(String[] args) {
		
	}
}
