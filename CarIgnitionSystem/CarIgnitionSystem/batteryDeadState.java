package CarIgnitionSystem;

// Battery Dead State - all methods are consistent with the battery being dead at this point.

public class batteryDeadState implements State {
    CarIgnition carignition;
 
    public batteryDeadState(CarIgnition carignition) {
        this.carignition = carignition;
    }
 
	public void insertKey() {
		System.out.println("You can't start the car; the battery is dead!!");
	}
 
	public void noKeyMessage() {
		System.out.println("There is no key to take out of the ignition");
	}
 
	public void crankEngine() {
		System.out.println("The car will not start - the battery is dead!!");
	}
 
	public void usePower() {
		System.out.println("The car cannot be used - the battery is dead!!");
	}
	
	public void refill() { 
		carignition.setState(carignition.getNoKeyState());
	}
 
	public String toString() {
		return "dead";
	}
}
