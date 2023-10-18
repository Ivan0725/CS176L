package week6;

import java.util.Scanner;

public class problem1 {
	
	public static void main(String[] args) {
		
		Scanner name = new Scanner(System.in);
		
		System.out.println("Enter your name: ");
		
		String inputName = name.next();
		
		while(inputName == inputName) {
			System.out.println(inputName);
		}
		name.close();
	}
}
