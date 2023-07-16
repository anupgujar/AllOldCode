package firstDecPackage;

public class MissingNumber {
	public static void main(String[] args) {
		int sum=0;
		int sum1=0;
		for (int i = 1; i <=10; i++) {
			if(i==5) {
				continue;				
			}sum=sum+i;
		}
		for (int j = 1; j <=10; j++) {
			sum1=sum1+j;			
		}int missingNo=sum1-sum;
		System.out.println("Missing Number = "+ missingNo);
	}
}
