package s090ex;

import java.util.Scanner;

public class Scanner2 {
	public static void main(String[] args) {
		System.out.println("Please, enter a few numbers");
		int d = 0;
		Scanner scanner = new Scanner(System.in);

		while (scanner.hasNextInt()) {
			d = scanner.nextInt();
			if (d == 0) {
				System.out.println("Value: " + d + " è zero. Quit.!");
				break;
			} else if (d % 2 == 0) {
				System.out.println("Value: " + d + " è pari!");
			} else {
				System.out.println("Value: " + d + " è dispari!");
			}
		}
		scanner.close();

	}
}
