import java.util.Scanner;

public class Main {
	// khai bao biến
	public static int weightMid, weightFinal, weightHomewok;
	public static double weightScoreMid, weightScoreFinal, weightScoreHomework, overallScore, GPA;
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		begin();
		midTerm();
		Final();
		Homework();
		report();
	}

	public static void begin() {
		System.out.println("This program reads exam/homework scores and reports your overall course grade");
	}

	public static void midTerm() {
		System.out.println("Midterm: ");

		System.out.print("Weight (0-100)?");
		weightMid = input.nextInt();
		System.out.print("Score earned? ");
		int midScoreEarn = input.nextInt();
		System.out.print("Were Scores shifted (1=yes, 2=no)? ");
		int shift = input.nextInt();
		if (shift == 1) {
			System.out.print("Shift amount ? ");
			int shiftScore = input.nextInt();
			midScoreEarn += shiftScore;
		}
		// gới hạn điểm là 100
		if (midScoreEarn > 100) {
			midScoreEarn = 100;
		}
		weightScoreMid = midScoreEarn * weightMid / 100;
		System.out.println("Total points = " + midScoreEarn + " / " + 100);
		System.out.println("Weight Score = " + weightScoreMid + " / " + weightMid);
		System.out.println(" ");
	}

	public static void Final() {
		System.out.println("Final: ");
		System.out.print("Weight (0-100)?");
		weightFinal = input.nextInt();
		System.out.print("Score earned? ");
		int finalScoreEarn = input.nextInt();
		System.out.print("Were Scores shifted (1=yes, 2=no)? ");
		int shift = input.nextInt();
		if (shift == 1) {
			System.out.print("Shift amount ? ");
			int shiftScore = input.nextInt();
			finalScoreEarn += shiftScore;
		}
		// giới hạn điểm là 100
		if (finalScoreEarn > 100) {
			finalScoreEarn = 100;
		}
		weightScoreFinal = finalScoreEarn * weightFinal / 100;
		System.out.println("Total points = " + finalScoreEarn + " / " + 100);
		System.out.println("Weight Score = " + weightScoreFinal + " / " + weightFinal);
		System.out.println(" ");

	}

	public static void Homework() {
		System.out.println("Homework: ");
		System.out.print("Weight (0-100)?");
		weightHomewok = input.nextInt();

		// tạo biến kiểm tra điểm ba trọng số phải bằng 100
		int totatWeightScore = weightMid + weightFinal + weightHomewok;
		while (totatWeightScore != 100) {
			System.out.println("Total of weight score have to be 100 , pls check the entered scores !");
			System.out.print("Weight (0-100)?");
			weightHomewok = input.nextInt();
			totatWeightScore = weightMid + weightFinal + weightHomewok;
		}

		System.out.print("number of assignments ? ");
		int assignment = input.nextInt();
		int assignmentScore = 0, assignmentMax = 0;
		for (int i = 1; i <= assignment; i++) {
			System.out.print("Assignment " + i + "score and max ?");
			int assignmentScoreFor = input.nextInt();
			assignmentScore += assignmentScoreFor;
			int assignmentMaxFor = input.nextInt();
			assignmentMax += assignmentMaxFor;
		}
//		// check
//		System.out.println(" diem assignments : ------>" + assignmentScore);
//		System.out.println(" điểm assignments max ------>" + assignmentMax);

		System.out.print("How many sections did you attend? ");
		int sectionAttend = input.nextInt();
		int sectionPoint = sectionAttend * 5;
		if (sectionPoint > 30) {
			sectionPoint = 30;
		}
		int totalPoint = assignmentScore + sectionPoint;
		int totalPointMax = assignmentMax + 30;

		// giới hạn điêm assignment là 150 điểm
		if (totalPoint > 150) {
			totalPoint = 150;
		}
		if (totalPointMax > 150) {
			totalPointMax = 150;
		}

		weightScoreHomework = totalPoint / totalPointMax;
		System.out.println("Section points = " + sectionPoint);
		System.out.println("Total points = " + totalPoint + " / " + totalPointMax);
		System.out.println("Weight score = " + totalPoint + " / " + weightHomewok);
		overallScore = weightScoreMid + weightFinal + weightHomewok;
		System.out.println(" ");
		System.out.println("Overall percentage = " + overallScore);
		gpa();
		System.out.println("Your grade will be at least: " + GPA);
		System.out.println(" ");
	}

	// tao 1 ham co gia tri return
	public static double gpa() {
		if (overallScore == 100.0) {
			return GPA = 4.0;
		} else if (overallScore >= 85.0) {
			return GPA = 3.0;
		} else if (overallScore >= 75.0) {
			return GPA = 2.0;
		} else if (overallScore >= 60.0) {
			return GPA = 1.0;

		} else {
			return GPA = 0;
		}

	}

	public static void report() {
		if (GPA > 1) {
			System.out.println("Congratulations you pass ! ");
		} else {
			System.out.println(" You failed !!! ");
		}

	}
}
