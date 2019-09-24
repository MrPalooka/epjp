package s090ex;

import java.io.*;
import java.util.Scanner;

public class ScannerFile {
	public static void main(String[] arg) throws Throwable {
		File f = new File("/Dev/Num2.txt");
		int d = 0;

		try {
			PrintWriter pw = new PrintWriter(new FileWriter(f));
			pw.println(23);
			pw.println(13);
			pw.println(0);
			pw.println(21);
			pw.flush();
			pw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		Scanner scanner = new Scanner(f);

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
