package s066bis;

public class Auto extends Veicolo implements Climatizza {

	@Override
	public String changeTemp(double temp) {
		return "La temperatura è :" + temp;
	}

}
