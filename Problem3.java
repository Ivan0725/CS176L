package Prob3;

public class Problem3 {
	public String university;
	public int totalMathStudents;
	public Problem3 (String name, int students) {
		university = name;
		totalMathStudents = students;
	}
	public String getName() {
		return university;
	}
	public int totalNumStudents() {
		return totalMathStudents;
	}
	public static void main(String[] args) {
		Problem3 uni = new Problem3("UCONN", 34);
		
		System.out.println(uni.getName());
		System.out.println("Total Math Majors: " + uni.totalNumStudents());
	}
}
