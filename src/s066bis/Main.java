package s066bis;

public class Main {

	public static void main(String[] args) {

		Vehicle[] vehicles = new Vehicle[3];

		vehicles[0] = new Car();

		vehicles[1] = new Bus();

		vehicles[2] = new MotorBike();

		boolean rightDirection = true;

		for (Vehicle vehicle : vehicles) {

			vehicle.steer(rightDirection);

			rightDirection = !rightDirection;

		}

		Conditioning[] conditionings = new Conditioning[2];

		conditionings[0] = new Bus();

		conditionings[1] = new Car();

		int temperature = 20;

		for (Conditioning conditioning : conditionings) {
			if (conditioning instanceof Car) {
				System.out.println("This is a car -> ");
				Car car = (Car) conditioning;
				car.steer(true);
			} else {
				System.out.println("This is not a car");
			}
			conditioning.setTemperature(temperature);

			temperature += 1;

		}
	}

}