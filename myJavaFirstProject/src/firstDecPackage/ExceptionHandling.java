package firstDecPackage;

public class ExceptionHandling {
	int a = 5;
	int b[] = new int[2];
	public void Exception() {
		try {
		b[9]=100;
		//int c = a/0;
		}
		/*
		 * catch (ArrayIndexOutOfBoundsException e) {
		 * System.out.println("Your index in not corret in array b"); }
		 */
		catch (ArithmeticException e) {
			System.out.println("Do not divide by zero");
		}
		/*
		 * catch (Exception e) { System.out.println("Any other exception"); }
		 */
		finally {
			System.out.println("I am inside fianlly block");
		}
	System.out.println("I am here");
	}
	public static void main(String[] args) {
		ExceptionHandling s1 = new ExceptionHandling();
		s1.Exception();
	}
}
