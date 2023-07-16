package firstDecPackage;

public class HomeWorkSingleInheritance1 extends HomeWorkSingleInheritance {
		
	public void savingAccount() {
		double intrestRate;
		double minimumBalance;
		System.out.println(intrestRate = 8.75);
		System.out.println(minimumBalance = 100000);
	}
	public static void main(String[] args) {
		HomeWorkSingleInheritance1 b1 = new HomeWorkSingleInheritance1();
				
		b1.savingAccount();
		b1.account();
			
			b1.accountHolders=2;
			System.out.println(b1.accountHolders);
			
			
	}
	
}
