package week4;

public class StudentGrade {
	final int MINIMUMGRADE = 0;
	final int MAXIMUMGRADE = 100;
	final int DEFAULT_GRADE = 60;
	final int AGRADE = 90;
	final int BGRADE = 80;	
	final int CGRADE = 70;
	private int grade;
	private String name;
	
	public StudentGrade(String name) {
		this.name = name;
		this.grade = DEFAULT_GRADE;
	}
	
	public StudentGrade(String name, int grade) {
		this.name = name;
		this.grade = grade;
	}
	
	public void setGrade(int grade ) {
		this.grade = grade;
		if(grade>MINIMUMGRADE && grade < MAXIMUMGRADE) {
			this.grade = grade;
			return;
		} else {
			this.grade = DEFAULT_GRADE;
		}
	}
	public String getName() {
		return name;
	}
	public int getGrade() {
		return grade;
	}

	public String getGradeLevel() {
		if(grade > AGRADE) {
			return "A";
		} else if (grade >= BGRADE && grade < AGRADE) {
			return "B";
		} else if (grade >= CGRADE && grade <BGRADE) {
			return "C";
		} else {
			return "D";
		}
	}


public static void main(String[] args) {
	StudentGrade ivan = new StudentGrade("Ivan");
	StudentGrade sam = new StudentGrade ("Thomas" , 93) ;
	System.out.println(ivan.getGrade());
	System.out.println(sam.getGrade());
	// test setGrade
	ivan.setGrade(-100);
	System.out.println(ivan.getGrade());
	ivan.setGrade(1000);
	ivan.setGrade(85);
	System.out.println(ivan.getGrade());
	//test getGradeLevel
	System. out.println(sam.getGradeLevel());
	System.out.println(ivan.getGradeLevel());
	ivan.setGrade(77);
	System.out.println(ivan.getGradeLevel());
	ivan.setGrade(55);
	System.out.println(ivan.getGradeLevel());
}
}