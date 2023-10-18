package Week5;

import java.util.Scanner;

public class Problem1 {
	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Print name1:");
		String name1 = scanner.nextLine();
		
		System.out.println("Print name2:");
		String name2 = scanner.nextLine();
		
		scanner.close();
		
		if(name1.equals(name2)) {
			System.out.println("same name" + name1);
		} else {
			System.out.println("name1 and name2 are different");
		}
		
	}
}
