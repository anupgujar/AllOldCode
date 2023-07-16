package firstDecPackage;

public class ReturnTypeHomeWork2 {
	public static void main(String[] args) {
		ReturnTypeHomeWork2 obj = new ReturnTypeHomeWork2();
		double data = obj.accBal(2800.456,1200.8467);
		
		System.out.println("Remaining Account balance after withdrawn amount ="+data);
	}
	public double accBal(double AccountBalance, double WithdrawnAmount){
		double accBal = AccountBalance - WithdrawnAmount; 
		System.out.println("Available account balance =" +AccountBalance);
		System.out.println("Amount withdrawn from account "+WithdrawnAmount);
		return accBal;
	}
	
	
}
