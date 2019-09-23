package s066tris;

public class Consulente extends Persona {
	private double fattura;

	public Consulente(String name, String cognome, double fattura) {
		super(name, cognome);
		this.fattura = fattura;
	}

	public double getFattura() {
		return fattura;
	}
}
