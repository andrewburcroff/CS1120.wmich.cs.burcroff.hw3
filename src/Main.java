import java.util.*;
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String testMan;
		String testMod;
		double testPrice;
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter the Manufacter: ");
		testMan = keyboard.nextLine();
		
		System.out.println("Enter the model number: ");
		testMod = keyboard.nextLine();
		
		System.out.println("Enter the retail price: ");
		testPrice = keyboard.nextDouble();
		
		CellPhone phone = new CellPhone(testMan, testMod, testPrice);
		
		System.out.println();
		System.out.println("Here is the data that you provided:");
		System.out.println("Manufacter: " + phone.getManufact());
		System.out.println("Model: " + phone.getModel());
		System.out.println("Retail Price: " + phone.getRetailPrice());
		
	}

}
