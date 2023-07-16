package firstDecPackage;

public class HomeWorkMultilevelInheritance1 extends HomeWorkMultilevelInheritance {
	
	public void savingAccount() {
		double intrestRate;
		double minimumBalance;
		System.out.println(intrestRate = 13.99);
		System.out.println(minimumBalance = 1000.921);
	}
	public static void main(String[] args) {
		HomeWorkMultilevelInheritance1 A1 = new HomeWorkMultilevelInheritance1();
		A1.account();
		A1.savingAccount();
	}
}
