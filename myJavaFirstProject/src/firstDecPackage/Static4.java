package firstDecPackage;

public class Static4 {
	int EmpId;
	String EmpName;
	String Dept;
	static String Company = "Capgemini";
	
	public Static4(int empId, String empName, String dept) {
		EmpId = empId;
		EmpName = empName;
		Dept = dept;
		System.out.println("Object is created");
	}
	public void getDetails(){
		System.out.println(EmpId+"   "+EmpName+"   "+Dept+"   "+Company);
	}
	public static void main(String[] args) {
		Static4 e1 = new Static4(601, "Anup", "IT");
		Static4 e2 = new Static4(602, "Avish", "Finance");
		System.out.println(e1.Dept);
		System.out.println(e2.Company);
		System.out.println(e2.EmpId);
		e1.getDetails();
	}
	
}
