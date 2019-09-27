package s205;

import java.util.Set;
import java.util.TreeSet;

public class Yatzee {

	public static int getYatzhee(int[] dati, Combination combination) {
		int pointcombination = 0;

		if (combination == Combination.UNO) {
			for (int i = 0; i < dati.length; i++) {
				if (dati[i] == 1) {
					pointcombination++;
				}
			}
		}

		if (combination == Combination.DUE) {
			for (int i = 0; i < dati.length; i++) {
				if (dati[i] == 2) {
					pointcombination += 2;
				}
			}

		}
		if (combination == Combination.TRE) {
			for (int i = 0; i < dati.length; i++) {
				if (dati[i] == 3) {
					pointcombination+=3;
				}
			}

		}
		if (combination == Combination.QUATTRO) {
			for (int i = 0; i < dati.length; i++) {
				if (dati[i] == 4) {
					pointcombination+=4;
				}
			}

		}
		if (combination == Combination.CINQUE) {
			for (int i = 0; i < dati.length; i++) {
				if (dati[i] == 5) {
					pointcombination+=5;
				}
			}
		}
		if (combination == Combination.SEI) {
			for (int i = 0; i < dati.length; i++) {
				if (dati[i] == 6) {
					pointcombination+=6;
				}
			}

		}
		if (combination == Combination.SPICCOLA) {
			TreeSet<Integer> spic = new TreeSet<Integer>();
			for (int i = 0; i < dati.length; i++) {
				spic.add(dati[i]);
			}
			if(spic.size()==4 && (spic.last() - spic.first()) == 4) {
							pointcombination=30;	
			}
			if(spic.size()==5) {
				if(spic.last()-spic.first()==4){
					pointcombination=30;
				}
				if((spic.last()-spic.first()==5)&& spic.last()==6) {
					pointcombination=30;
				}
			}

		}
		if (combination == Combination.SGRANDE) {
			

		}
		if (combination == Combination.TRIS) {

		}
		if (combination == Combination.POKER) {

		}
		if (combination == Combination.FULL) {

		}
		if (combination == Combination.YATZ) {

		}
		if (combination == Combination.SOMMA) {

		}

	}

}
