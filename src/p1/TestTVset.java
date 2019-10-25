package p1;

public class TestTVset {
    
    public static void main(String[] args) {
        TVset t = new TVset();
        
        t.turnOn();
        t.increaseVolume();
        t.print();
        t.turnOff();
        t.getVolume();
        t.setChannel(5);
    }

}
