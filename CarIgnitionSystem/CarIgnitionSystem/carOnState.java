package CarIgnitionSystem;

// Descriptions of State when car is on and running (key has been inserted and engine has been cranked)

public class carOnState implements State {
    CarIgnition carignition;
 
    public carOnState(CarIgnition carignition) {
        this.carignition = carignition;
    }
       
	public void insertKey() {
		System.out.println("Car is in the process of turning on");
	}
 
	public void noKeyMessage() {
		System.out.println("The car is already in process of turning on");
	}
 
	public void crankEngine() {
		System.out.println("Do not attempt to turn the car on twice");
	}
 
	// Car is using power/battery. If the car cannot use power message sent to user
	public void usePower() {
		carignition.batteryloss();
		if (carignition.getCharge() > 0) {
			carignition.setState(carignition.getNoKeyState());
		} else {
			System.out.println("The battery is bone dry!");
			carignition.setState(carignition.getBatteryDeadState());
		}
	}
	
	public void refill() { }
 
	public String toString() {
		return "the car is running";
	}
}
