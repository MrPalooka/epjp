package s066Gioco;

import java.util.Random;
import java.util.Scanner;

public class Main {
	

//	public static void main(String[] arg) {
//		int input = 0;
//		Orco orco = new Orco("Rok'thar", "Zanne Argento", 100, 20);
//		Umano umano = new Umano("Andwin", "Crusader", 120, 10);
//		System.out.println("Ogre hp: " + orco.getPV());
//		System.out.println("Ogre hp: " + umano.getPV());
//		Scanner scanner = new Scanner(System.in);
//		while (orco.getPV() > 0 && umano.getPV() > 0) {
//			Random random = new Random();
//			int whoAttacks = random.nextInt(2);
//			
//			if ( whoAttacks==0) {
//
//				orco.getAttack(umano);
//
//				System.out.println("Ogre " + orco.getClan() + " attacked human " + umano.getClan());
//
//				System.out.println("Ogre hp: " + orco.getPV());
//
//				System.out.println("Human hp: " + umano.getPV());
//
//			} else {
//
//				umano.getAttack(orco);
//
//				System.out.println("Human " + umano.getClan() + " attacked ogre " + orco.getClan());
//
//				System.out.println("Ogre hp: " + orco.getPV());
//				
//
//				System.out.println("Human hp: " + umano.getPV());
//
//			}
//		}
//
//		if (orco.getPV() > 0) {
//
//			System.out.println("Ogre " + orco.getClan() + " won");
//
//		}
//
//		if (umano.getPV() > 0) {
//
//			System.out.println("Human " + umano.getClan() + " won");
//
//		}
//
//
//
//		if (orco.getPV() == umano.getPV()) {
//
//
//
//			System.out.println("Nobody won");
//
//		}
//	}
//
//}
