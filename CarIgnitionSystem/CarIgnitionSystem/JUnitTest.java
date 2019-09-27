package CarIgnitionSystem;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JUnitTest {

	@Test
	void Cartest() {
		JUnitTest junit = new JUnitTest();
		CarIgnition carignition = 
				
				/* For testing purposes, we will assume the Tesla
				 * only has a range of 4 miles!
				 */
				new CarIgnition(4);  

			System.out.println(carignition);
			
			carignition.insertKey();
			carignition.insertKey();
			carignition.batteryloss();
			carignition.insertKey();
			carignition.crankEngine();

			System.out.println(carignition);

			carignition.crankEngine();
			carignition.crankEngine();
			carignition.insertKey();
			carignition.crankEngine();

			System.out.println(carignition);
			
			carignition.refillBattery(4); //refill dead battery
			
			System.out.println(carignition);

	}

}
