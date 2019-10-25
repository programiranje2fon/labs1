package p2;

public class Radio {

	boolean on = false;
	double frequency = 87.5;

	void turnOn() {
		on = true;
	}

	void turnOff() {
		on = false;
	}

	void increaseFrequency() {
		frequency = frequency + 0.1;
	}

	void decreaseFrequency() {
		frequency = frequency - 0.1;
	}

	void setFrequency(double f) {
		frequency = f;
	}

	boolean isOn() {
		return on;
	}

	double getFrequency() {
		return frequency;
	}

	void print() {
		System.out.println("Attribute values: " + "\n\t" + "on: " + on + "\n\t" + "frequency: " + frequency);
	}

}
