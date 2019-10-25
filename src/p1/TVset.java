package p1;

public class TVset {

	boolean on = false;
	int volume = 0;
	int channel = 1;

	void turnOn() {
		on = true;
	}

	void turnOff() {
		on = false;
	}

	void increaseVolume() {
		volume++;
	}

	void decreaseVolume() {
		volume--;
	}

	void turnDown() {
		volume = 0;
	}

	boolean isOn() {
		return on;
	}

	int getVolume() {
		return volume;
	}

	void setChannel(int channel) {
		this.channel = channel;
	}

	void print() {
		System.out.println("Attribute values: " + "\n\t" + "on: " + on + "\n\t" + "channel: " + channel + "\n\t"
				+ "volume: " + volume);
	}

}
