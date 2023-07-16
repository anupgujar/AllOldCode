package firstDecPackage;

import java.util.HashMap;
import java.util.Scanner;

public class Map3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		HashMap<Character, Integer> map=new HashMap<Character, Integer>();
		
		for (int i = 0; i < input.length(); i++) {
			Character ch = input.charAt(i);
			
			if(map.containsKey(ch)) {
				Integer existingValue = map.get(ch);
				map.put(ch, existingValue+1);
			}else {
				map.put(ch, 1);
			}	
		}System.out.println(map);
	}
}
