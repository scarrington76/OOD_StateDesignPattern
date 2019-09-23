package CarIgnitionSystem;

public class TeslaTestDrive {
	
	//Main class to take your Tesla for a test drive...

	public static void main(String[] args) {
		CarIgnition carignition = 
				
			/* For testing purposes, we will assume the Tesla
			 * only has a range of 4 miles!
			 */
			new CarIgnition(4);  

		System.out.println(carignition);

		carignition.insertKey();
		carignition.crankEngine();
		carignition.insertKey();
		carignition.crankEngine();

		System.out.println(carignition);

		carignition.insertKey();
		carignition.crankEngine();
		carignition.insertKey();
		carignition.crankEngine();

		System.out.println(carignition);
		
		carignition.refillBattery(4); //refill dead battery
		
		System.out.println(carignition);

	}
}
