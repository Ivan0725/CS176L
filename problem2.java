package week6;

import java.util.Scanner;

public class problem2 {

	public static void main(String[] args) {
		
		Scanner user = new Scanner(System.in);
		
		System.out.println("what is your name?");
		
		String name = user.next();
		
		System.out.println("hello " + name + ", how many exams have you taken?");

		Integer examCount = user.nextInt();
		
		Float totalScore = 0.0f;
		
		for(int i = 0; i < examCount ; i++) {
			
			Integer examNum = i + 1;
			
			Float score;
			
			do {
				System.out.println("give me the score of exam " + examNum + ":");
				
				score = user.nextFloat();
				
				if (score < 0 || score > 100) {
					System.out.println("Invalid score! Please give me the score of exam " + examNum + ":");
				}
				
			} while (score < 0 || score > 100);
			
			totalScore += score;
			
		}
		Float averageScore = totalScore / examCount;
		System.out.println("Hi, " + name + ", your average score of " + examCount + " exams is " + averageScore);		
		user.close();
	}
	
}
