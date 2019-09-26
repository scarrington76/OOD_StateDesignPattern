package CarIgnitionSystem;

// Establish CarIgnition class with methods and states

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

		this.charge = batteryLife; //If the car has battery, then wait for key into ignition
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
 
	// Deplete the battery when car runs
	void batteryloss() {
		System.out.print("You are driving on the open road!.....");
		if (charge != 0) {
			charge = charge - 1;
			System.out.println(charge + " mile(s) are now left in the battery...");
		}
	}
 
	int getCharge() {
		return charge;
	}
 
	// Refill the battery and advise user of new range for car
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
 
    // String telling user what is happening in each state/change
	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("\nTesla Model S");
		result.append("\nRange left on battery: " + charge + " mile");
		if (charge != 1) {
			result.append("s");
		}
		result.append("\n");
		result.append("Car is " + state + "\n");
		return result.toString();
	}
}
