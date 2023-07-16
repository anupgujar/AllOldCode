package firstDecPackage;

public class Static2 {
	int roll;
	String name;
	static String college = "IIT Mumbai";
	
	public Static2(int roll, String name) {
		this.roll = roll;
		this.name = name;
		System.out.println("Object is created");
	}
	public void getResult() {
		System.out.println(roll+"   "+name+"   "+college);
	}
	public void getOutput() {
		System.out.println(roll+"   "+name+"    "+college);
	}
	public static void main(String[] args) {
		Static2 s1 = new Static2(007,"Anup");
		Static2 s2 = new Static2(04, "iit ngp");
		System.out.println(s1.roll + s1.name + s1.college);
				s1.name = "Avish";
				System.out.println(s1.roll + s1.name);
	}
	
}
