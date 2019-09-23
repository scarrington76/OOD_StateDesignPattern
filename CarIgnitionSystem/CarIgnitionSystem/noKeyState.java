package CarIgnitionSystem;

public class noKeyState implements State {
    CarIgnition carignition;
 
    public noKeyState(CarIgnition carignition) {
        this.carignition = carignition;
    }
 
	public void insertKey() {
		System.out.println("You insert the key and turn the ignition on.....");
		carignition.setState(carignition.getHasKeyState());
	}
 
	public void noKeyMessage() {
		System.out.println("You haven't put the key in the ignition....");
	}
 
	public void crankEngine() {
		System.out.println("You tried to turn the engine on without the key...");
	 }
 
	public void usePower() {
		System.out.println("You need to turn the ignition on first......");
	} 
	
	public void refill() { }
 
	public String toString() {
		return "waiting for key to be inserted into ignition.....";
	}
}
