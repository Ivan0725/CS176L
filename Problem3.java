package Week5;

import java.util.Scanner;

public class Problem3 {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String string = s.next();
		char firstChar = string.charAt(0);
		
		if (firstChar == '0') {
			System.out.println("zero" +string.substring(1));
		} else if(firstChar == '1') {
			System.out.println("one" +string.substring(1));
		} else if(firstChar == '2') {
			System.out.println("two" +string.substring(1));
		} else if(firstChar == '3') {
			System.out.println("three" +string.substring(1));
		} else if(firstChar == '4') {
			System.out.println("four" +string.substring(1));
		} else if(firstChar == '5') {
			System.out.println("five" +string.substring(1));
		} else if(firstChar == '6') {
			System.out.println("six" +string.substring(1));
		} else if(firstChar == '7') {
			System.out.println("seven" +string.substring(1));
		} else if(firstChar == '8') {
			System.out.println("eight" +string.substring(1));
		} else if(firstChar == '9') {
			System.out.println("nine" +string.substring(1));
		} else {
			System.out.println(string);
		}
		s.close();
	}
}
