package s066Gioco;

public abstract class Personaggio {

	private String name;
	private String clan;
	private int pv;

	public Personaggio(String name, int pv, String clan) {
		this.name = name;
		this.pv = pv;
		this.clan = clan;
	}

	public void setDmg(int dmg) {
		this.pv -= dmg;
	}

	public String getName() {
		return name;
	}

	public int getPV() {
		return pv;
	}

	public String getClan() {
		return clan;
	}
}
