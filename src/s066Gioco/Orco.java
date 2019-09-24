package s066Gioco;

import java.util.Random;

public class Orco extends Personaggio{
	private int def_bonus;

	public Orco(String name, String clan, int pv, int def_bonus) {
		super(name,pv,clan);
		this.def_bonus=def_bonus;
	}
	
	
	public double getAttack(Personaggio nemico) {
		Random random = new Random();
		int dmg = random.nextInt(10);
		return dmg-def_bonus;
	}

	public double getArmor() {
		def_bonus += Math.round(Math.random()*11+1);
		return def_bonus;
	}
}
