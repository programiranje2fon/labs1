/*
 * Created on Sep 17, 2018
 *
 */
package p2;

public class TestRadio {
    
    public static void main(String[] args) {
        Radio r = new Radio();
        r.print();
        r.setFrequency(106.7);
        r.print();
        r.isOn();
        r.print();
        r.turnOn();
        r.print();
        r.turnOff();
        r.print();
        r.decreaseFrequency();
        r.print();
        r.increaseFrequency();
        r.print();
        r.getFrequency();
        r.print();
    }

}
