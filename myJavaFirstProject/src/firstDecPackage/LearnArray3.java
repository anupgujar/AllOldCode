package firstDecPackage;

public class LearnArray3 {
	
	public static void main(String[] args) {
		int a[] = {1,2,3,4,5};
		int age[] = new int[3];
		age[0] = 23;
		age[1] = 45;
		age[2] = 34;
		
		a[4] = 1345;
		System.out.println(a[4]);
		for(int i=0; i<3; i++)
		{
		System.out.println(age[i]);
		}			
	}
}
