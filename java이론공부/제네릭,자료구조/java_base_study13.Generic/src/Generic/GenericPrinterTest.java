package Generic;

public class GenericPrinterTest {

	public static void main(String[] args) {
		GenericPrinter<Powder> powerPrinter = new GenericPrinter<Powder>();
		powerPrinter.setMaterial(new Powder()); //powder을 재료로하는 프린터기가 만들어짐
		//Powder powder = powerPrinter.getmaterial();
		System.out.println(powerPrinter);
		
		GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<Plastic>();
		plasticPrinter.setMaterial(new Plastic());
		System.out.println(plasticPrinter);

	}

}
