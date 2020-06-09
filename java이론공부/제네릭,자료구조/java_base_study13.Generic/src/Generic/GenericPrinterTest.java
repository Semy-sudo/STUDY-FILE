package Generic;

public class GenericPrinterTest {

	public static void main(String[] args) {
		GenericPrinter<Powder> powerPrinter = new GenericPrinter<Powder>();
		powerPrinter.setMaterial(new Powder()); //powder�� �����ϴ� �����ͱⰡ �������
		//Powder powder = powerPrinter.getmaterial();
		System.out.println(powerPrinter);
		
		GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<Plastic>();
		plasticPrinter.setMaterial(new Plastic());
		System.out.println(plasticPrinter);

	}

}
