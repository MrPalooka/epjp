package s066tris;

public class Dipendente extends Persona {
	private double stipendio;

	public Dipendente(String name, String cognome, double stipendio) {
		super(name, cognome);
		this.stipendio = stipendio;
	}

	public double getStipendio() {
		return stipendio;
	}
}
