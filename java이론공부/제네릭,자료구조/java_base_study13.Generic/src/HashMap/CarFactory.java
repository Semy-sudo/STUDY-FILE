package HashMap;

import java.util.HashMap;

public class CarFactory {
	private static CarFactory instance = new CarFactory();
	HashMap<String, Car> carmap = new HashMap<>();
	
	public static CarFactory getInstanceof() {
		if(instance == null)
			instance = new CarFactory();
		return instance;
	}


	public Car createCar(String string) {
		if(carmap.containsKey(string)) {
			return carmap.get(string);//string에대한 Car반환
		}
		Car car = new Car();
		carmap.put(string, car);
		return car;
	}

}
