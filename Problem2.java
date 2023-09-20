package Prob2;

public class Problem2 {
	public String studentName;
	public int scores;
	public int total;
	public int avg;
	public int numberQuizzes;
	
	public Problem2 (String name) {
		studentName = name;
	}
	
	
	public String getName() {
		return studentName;
	}
	
	public void addScore(int score) {
		total += score;
		numberQuizzes++;
	}
	
	public int getTotalScore() {
		return total;
	}
	
	public int getAvgScore() {
		int average = total/numberQuizzes;
		return average;
	}
	
	public static void main(String[]args) {
		Problem2 ivan = new Problem2("Ivan");
		ivan.addScore(96);
		ivan.addScore(82);
		ivan.addScore(88);
		ivan.addScore(97);
		ivan.addScore(89);

		System.out.println("Student name: " + ivan.getName());
		System.out.println("Total Score: " + ivan.getTotalScore());
		System.out.println("Average score: " + ivan.getAvgScore());		
		
	}
}
