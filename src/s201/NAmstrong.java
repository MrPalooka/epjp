package s201;

public class NAmstrong {

	public static boolean isArmstrong(int data) {
		int exp = 0;
		int result = 0;
		int equal = 0;
		int tmp = data;
		int narm = data;
		if (data < 0) {
			throw new IllegalArgumentException("Il numero è negativo");
		} else {
			while (data != 0) {
				data = data / 10;
				exp++;
			}

			while (tmp != 0) {
				result = tmp % 10;
				equal += (int) Math.pow(result, exp);
				tmp = tmp / 10;
			}

			if (narm == equal) {
				return true;
			} else {
				return false;
			}
		}
	}

	public static void main(String[] args) {
		System.out.println(isArmstrong(153));
	}

}
