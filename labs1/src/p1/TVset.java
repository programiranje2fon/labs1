package p1;

public class TVset {
    
    int volume = 0;
    boolean on = false;
    int channel = 1;
    
    void increaseVolume() {
        volume++;
    }
    
    void decreaseVolume() {
        volume--;
    }
    
    void turnDown() {
        volume = 0;
    }
    
    void turnOn() {
        on = true;
    }
    
    void turnOff() {
        on = false;
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
        System.out.println("Attribute values: " + "\n\t" +
                            "on: " + on + "\n\t" +
                            "channel: " + channel + "\n\t" +
                            "volume: " + volume);
    }

}
