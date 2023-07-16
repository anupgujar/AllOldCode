package firstDecPackage;
public class Test {
	String name;

	public Test(String name) {
		this.name = name;
	}
	 public static void main(String[] args) {
		 Test cpp = new Test("Main");
		 Test java = new Test("Java");
		
		 
		 
	 }
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
