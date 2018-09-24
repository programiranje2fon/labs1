/*
 * Created on Sep 17, 2018
 *
 */
package p1;

public class TestTVset {
    
    public static void main(String[] args) {
        TVset t = new TVset();
        t.increaseVolume();
        t.print();
        t.turnOff();
        t.getVolume();
        t.setChannel(5);
    }

}
