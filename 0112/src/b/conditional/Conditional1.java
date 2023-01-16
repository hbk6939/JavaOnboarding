package b.conditional;

public class Conditional1 {

	public static void main(String[] args) {
		final int NUM = 100;
		System.out.println(NUM);
		// 자바에서 조건문은 if 와 switch 두 가지 뿐
		int kor=95, eng=88, math=75;
		double avg = (kor+eng+math)/3.0;
		char grade;
		
		if (avg>=90) {
			grade = 'A';
		} else if (avg>=80) {
			grade = 'B';
		} else if (avg>=70) {
			grade = 'C';
		} else if (avg>=60) {
			grade = 'D';
		} else {
			grade = 'F';
		}
		System.out.printf("평균: %f, 학점 %c\n", avg, grade);
		
		char grade2;
		switch ((int)avg/10) {
			case 10:
			case 9: grade2 = 'A'; break;
			case 8: grade2 = 'B'; break;
			case 7: grade2 = 'C'; break;
			case 6: grade2 = 'D'; break;
			default:grade2 = 'F'; break;
		}
		System.out.printf("평균: %f, 학점 %c\n", avg, grade2);
	}

}
