package CarIgnitionSystem;

// Description of state when the key has been put into the ignition. Car not yet running


public class hasKeyState implements State {
	
	CarIgnition carignition;
 
	public hasKeyState(CarIgnition carignition) {
		this.carignition = carignition;
	}
  
	public void insertKey() {
		System.out.println("The key is already in the ignition");
	}
 
	public void noKeyMessage() {
		System.out.println("The Key is in the ignition");
		carignition.setState(carignition.getNoKeyState());
	}
 
	public void crankEngine() {
		System.out.println("The engine is turning on....");
		carignition.setState(carignition.getCarOnState());
	}

    public void usePower() {
        System.out.println("No battery used");
    }
    
    public void refill() { }
 
	public String toString() {
		return "waiting to turn on the car...";
	}
}
