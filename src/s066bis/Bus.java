package s066bis;

public class Bus extends Veicolo implements Climatizza {

	@Override
	public String changeTemp(double temp) {
		
		return "La temperatura è :" + temp;
	}



}
