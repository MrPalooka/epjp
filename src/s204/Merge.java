package s204;

class Merge {
	public static int[] merge(int[] left, int[] right) {
		int[] merge = new int[left.length + right.length];
		int i = 0;
		int j = 0;
		int k = 0;
		while (i < merge.length) {
			if (left[j] < right[k]) {
				merge[i] = left[j];
				if (j < left.length) {
					j++;
				}
			} else if (left[j] == right[k]) {
				merge[i] = right[k];
				merge[i + 1] = left[j];
				j++;
				k++;
				i++;
			} else {
				merge[i] = right[k];
				if (k < right.length) {
					j++;
				}
			}
			i++;
		}
		return merge;
	}

}
