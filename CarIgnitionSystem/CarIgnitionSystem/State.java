package CarIgnitionSystem;

public interface State {
 
	public void insertKey();
	public void noKeyMessage();
	public void crankEngine();
	public void usePower();
	
	public void refill();
}
