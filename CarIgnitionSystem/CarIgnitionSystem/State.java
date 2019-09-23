package CarIgnitionSystem;

// Interface for the methods for each state

public interface State {
 
	public void insertKey();
	public void noKeyMessage();
	public void crankEngine();
	public void usePower();
	
	public void refill();
}
