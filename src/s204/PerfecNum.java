package s204;

public class PerfecNum {
	public static boolean perfecnum(int data) {
		int perfectnum = 0;
		int equal = data;

		for (int i = 1; i <= data / 2; i++) {
			if (data % i == 0) {
				perfectnum += i;
			}
		}
		if (perfectnum == equal) {
			return true;

		} else {
			return false;
		}

	}
}
