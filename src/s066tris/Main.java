package s066tris;

public class Main {
	public static void main(String[] arg) {
		Persona[] persone = new Persona[3];
		persone[0] = new Consulente("Mario", "Rossi", 1000);
		persone[1] = new Dipendente("Andrea", "Franco", 3000);
		persone[2] = new Dipendente("Lorenzo", "Vinci", 2050);
		persone[3] = new Consulente("Marco", "Andrea", 3200);

		for (Persona persona : persone) {
			System.out.println(persona);
		}
		for (Persona persona : persone) {
			if (persona instanceof Consulente) {
				Consulente c = (Consulente) persona;
				System.out.println(c.getFattura());
			} else if (persona instanceof Dipendente) {

				Dipendente d = (Dipendente) persona;

				System.out.println(d.getStipendio());

			}
		}
	}
}
