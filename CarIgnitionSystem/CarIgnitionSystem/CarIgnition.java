package CarIgnitionSystem;

public class CarIgnition {
 
	State batteryDeadState;
	State noKeyState;
	State hasKeyState;
	State carOnState;
 
	State state = batteryDeadState;
	int charge = 0;
 
	public CarIgnition(int batteryLife) {
		batteryDeadState = new batteryDeadState(this);
		noKeyState = new noKeyState(this);
		hasKeyState = new hasKeyState(this);
		carOnState = new carOnState(this);

		this.charge = batteryLife;
 		if (batteryLife > 0) {
			state = noKeyState;
		} 
	}
 
	public void insertKey() {
		state.insertKey();
	}
 
	public void noKeyMessage() {
		state.noKeyMessage();
	}
 
	public void crankEngine() {
		state.crankEngine();
		state.usePower();
	}

	void setState(State state) {
		this.state = state;
	}
 
	void batteryloss() {
		System.out.print("You are driving on the open road!.....");
		if (charge != 0) {
			charge = charge - 1;
			System.out.println(charge + " range is now left in the battery...");
		}
	}
 
	int getCharge() {
		return charge;
	}
 
	void refillBattery(int charge) {
		this.charge += charge;
		System.out.println("The battery was just recharged; it's new range is: " + this.charge + " miles.");
		state.refill();
	}

    public State getState() {
        return state;
    }

    public State getBatteryDeadState() {
        return batteryDeadState;
    }

    public State getNoKeyState() {
        return noKeyState;
    }

    public State getHasKeyState() {
        return hasKeyState;
    }

    public State getCarOnState() {
        return carOnState;
    }
 
	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("\nTesla Model S");
		result.append("\nRange left on battery: " + charge + " miles");
		if (charge != 1) {
			result.append("s");
		}
		result.append("\n");
		result.append("Car is " + state + "\n");
		return result.toString();
	}
}