package firstDecPackage;

public class LoopsHomeWork {
	public static void main(String[] args) {
		String array[] = {"Red","Black","Blue","Green","White","Orange","Pink","Brown","Purple","Marron","Grey","Skyblue"};
		
		  for(int i=0; i<array.length; i++) { 
			  System.out.println(array[i]); 
			}
	System.out.println("-------------------------");	 
		
		for (String colour : array) {
		System.out.println(colour);
		}
	System.out.println("-------------------------");	 
	int i=0;
	while(i<array.length) {
	System.out.println(array[i]);
	i++;
	}
	System.out.println("-------------------------");	 
	int j=0;
	do {
		System.out.println(array[j]);
		j++;
	}while(j<array.length);
	}

}
