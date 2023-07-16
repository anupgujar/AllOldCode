package firstDecPackage;

public class HomeWorkMultilevelInheritance2 extends HomeWorkMultilevelInheritance1 {
	
	public void silveSavingAccount() {
		String specialOfferId;
		System.out.println(specialOfferId = "SPLOFF");
	}
	public static void main(String[] args) {
		HomeWorkMultilevelInheritance2 Q1 = new HomeWorkMultilevelInheritance2();
		Q1.account();
		Q1.savingAccount();
		Q1.silveSavingAccount();
	}
}
