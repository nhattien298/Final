package lucky;

import java.util.Random;
import java.util.Scanner;

public class lucky {
	public static void main(String[] args) {

	}

	public static void play() {
		System.out.println(" tro choi doan so tu 0 den 100");
		Scanner scanner = new Scanner(System.in);
		Random lucky = new Random();
		int randomNumber, totalGame = 0, totalGuess, avgGuess, bestGame, guessNumber;
		String continueString;

		do {
			totalGuess = 1;
			randomNumber = lucky.nextInt(100);
			System.out.println("so may man cua lan choi nay la : " + randomNumber);
			do {
				System.out.println(" xin moi ban du doan con so may man : ");
				guessNumber = scanner.nextInt();
				if (guessNumber > randomNumber) {
					System.out.println("so may man nho hon du doan cua ban");
					totalGuess++;

				} else if (guessNumber < randomNumber) {
					System.out.println(" so may man lon hon du doan cua ban ! ");
					totalGuess++;
				} else {
					System.out.println("xin chuc mung, ban da doan dung so may man");
				}
			} while (guessNumber != randomNumber);

			System.out.println(" ban co muon tiep tuc choi nua ko ? ");
			continueString = scanner.next();
			totalGame++;

		} while (continueString.equalsIgnoreCase("y") || continueString.equalsIgnoreCase("yes"));
	}
}
