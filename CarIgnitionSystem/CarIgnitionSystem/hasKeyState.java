package CarIgnitionSystem;

public class hasKeyState implements State {
	
	CarIgnition carignition;
 
	public hasKeyState(CarIgnition carignition) {
		this.carignition = carignition;
	}
  
	public void insertKey() {
		System.out.println("The key is already in the ignition");
	}
 
	public void noKeyMessage() {
		System.out.println("The Key Is Not In The Ignition. Please Insert Key....");
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
