package p1;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TVsetTest {
	
	TVset t;

	@Before
	public void setUp() throws Exception {
		t = new TVset();
	}

	@After
	public void tearDown() throws Exception {
		t = null;
	}

	@Test
	public void attribute_volume() {
		assertEquals("Initial value should be 0, but is "+t.volume, 0, t.volume);
	}
	
	@Test
	public void attribute_on() {
		assertEquals("Initial value should be false, but is "+t.on, false, t.on);
	}
	
	@Test
	public void attribute_channel() {
		assertEquals("Initial value should be 1, but is "+t.channel,1, t.channel);
	}
	
	@Test
	public void method_increaseVolume() {
		t.volume = 5;
		
		t.increaseVolume();
		
		assertEquals("Volume is set to 5, and method is called, but the volume is not 6, but "+t.volume, 6, t.volume);
	}
	
	@Test
	public void method_decreaseVolume() {
		t.volume = 4;
		
		t.decreaseVolume();
		
		assertEquals("Volume is set to 4, and method is called, but the volume is not 3, but "+t.volume,3, t.volume);
	}
	
	@Test
	public void method_turnDown() {
		t.volume = 5;
		
		t.turnDown();
		
		assertEquals("Volume is set to 5, and method is called, but the volume is not 0, but  "+t.volume, 0, t.volume);
	}
	
	@Test
	public void method_turnOn() {
		t.on = false;
		
		t.turnOn();
		
		assertEquals("The on attribute is false, and method is called, it doesnt become true, but "+t.on, true, t.on);
	}
	
	@Test
	public void method_turnOff() {
		t.on = true;
		
		t.turnOff();
		
		assertEquals("The on attribute is true, and method is called, it doesnt become false, but "+t.on, false, t.on);
	}
	
	@Test
	public void method_isOn() {
		t.on = true;
		
		assertEquals("The on attribute is true, and method is called, it doesnt return true, but "+t.on, true, t.on);
	}
	
	@Test
	public void method_getVolume() {
		t.volume = 12;
		
		assertEquals("Volume is set to 12, and method is called, but the method doesnt return 12, but "+t.getVolume(), 12, t.getVolume());
	}
	
	@Test
	public void method_setChannel() {
		t.setChannel(15);
		
		assertEquals("When the method is called to set channel 15, it sets it to "+t.channel, 15, t.channel);
	}
	
	
	

}
