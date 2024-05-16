package java02_test;

public class Test3_1 {

	public static void main(String[] args) {
		
		int score = 95;
		
		char grade;
		
		char gradeA = 'A';
		char gradeB = 'B';
		
		grade = (score > 90) ? gradeA : gradeB;
		
		System.out.println(grade);
		
	}	// end main method
	
}
