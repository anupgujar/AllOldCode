package firstDecPackage;

public class Static3 {
	public static void main(String[] args) {
		
	
	Static2 s3 = new Static2(13, "Aninash");
	Static2 s4 = new Static2(45, "Navenber");
	s3.name = "test";
	Static2.college = "IIt Delhi";
	
	s3.getResult();
	s4.getOutput();
	
	}	
}
