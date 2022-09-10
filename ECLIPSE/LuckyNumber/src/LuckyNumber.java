
import java.util.Random;
import java.util.Scanner;

public class LuckyNumber {
	// khai báo biến toàn cục
	public static int totalGames;
	public static int totalGuess;
	public static int bestGame;
	public static double guessAvg;
	public static int tongDoan;
	// khai báo hàng số maximum
	public static final int maximum = 100;

	public static void main(String[] args) {
		play();
		report();

	}

	public static void play() {
		// tạo hàm random
		Random rdRandom = new Random();
		int randomNumber;

		// gán giá trị mặc định cho biến
		totalGuess = 0;
		bestGame = 1;
		guessAvg = 0;
		totalGames = 0;
		String playAgain;
		tongDoan = 0;

		do {
			totalGuess = 1;
			randomNumber = rdRandom.nextInt(maximum);
//			System.out.println("so man man cua lan nay la : " + randomNumber);
			System.out.println("xin mời nhập vào số may mắn của bạn : ");
			Scanner scanner = new Scanner(System.in);
			int ln = scanner.nextInt();

			do {

				if (ln > randomNumber) {
					System.out.println("số may mắn nhỏ hơn số dự đoán của bạn.");
					totalGuess++;
					System.out.println("xin mời nhập vào số may mắn của bạn : ");
					ln = scanner.nextInt();

				} else if (ln < randomNumber) {
					System.out.println("số may mắn lớn hơn số dự đoán của bạn.");
					totalGuess++;
					System.out.println("xin mời nhập vào số may mắn của bạn : ");
					ln = scanner.nextInt();

				}

			} while (ln != randomNumber);
			totalGames++;
			System.out.println("xin chúc mừng bạn đã dự đoán đúng con số may mắn sau :" + totalGuess + " lần dự đoán ");
			System.out.println("nhập yes để tiếp tục và phím bất kỳ để thoát !!!.");
			playAgain = scanner.next();
			if (totalGuess < bestGame || totalGames == 1) {
				bestGame = totalGuess;
			}
			tongDoan += totalGuess;

		} while ((playAgain.equalsIgnoreCase("yes") || playAgain.equalsIgnoreCase("y")));

		// so luot doan trung binh
		guessAvg = tongDoan / totalGames;

	}

	public static void report() {
		System.out.println("số game đã mà bạn đã chơi : " + totalGames);
		System.out.println("số lần dự đoán trong game này là : " + totalGuess);
		System.out.println("game có số lần đoán ít nhất : " + bestGame);
		System.out.println("lượt đoán trung bình của game  : " + guessAvg);
//		System.out.println(" tong so lan doan của tât cả các game là : " + tongDoan);

	}

}
