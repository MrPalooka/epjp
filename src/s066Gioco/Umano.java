package s066Gioco;

import java.util.Random;

public class Umano extends Personaggio {
	private int atk_bonus;

	public Umano(String name, String clan, int pv, int atk_bonus) {
		super(name, pv, clan);
		this.atk_bonus = atk_bonus;
	}

	public double getAttack(Personaggio nemico) {
		Random random = new Random();
		int dmg = random.nextInt(10);
		return dmg + atk_bonus;
	}

	public double getAtk() {
		atk_bonus += Math.round(Math.random() * 11 + 1);
		return atk_bonus;
	}

	public int getAtkBonus() {
		return atk_bonus;
	}
}
