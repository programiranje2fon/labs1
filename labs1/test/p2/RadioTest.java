package p2;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class RadioTest {
	
	private Radio r;

	@Before
	public void setUp() throws Exception {
		r = new Radio();
	}

	@After
	public void tearDown() throws Exception {
		r = null;
	}

	@Test
	public void attribute_on() {
		assertEquals("Initial value is not false", false, r.on);
	}
	
	@Test
	public void attribute_frequency() {
		assertEquals("Initial value is not 87.5", 87.5, r.frequency, 0.0001);
	}
	
	@Test
	public void method_increaseFrequency() {
		r.frequency = 99.7;
		
		r.increaseFrequency();
		
		assertEquals("When frequency is 99.7 and method is called it does not change it to 99.8", 99.8, r.frequency, 0.0001);
	}
	
	@Test
	public void method_decreaseFrequency() {
		r.frequency = 99.3;
		
		r.decreaseFrequency();
		
		assertEquals("When frequency is 99.3 and method is called it does not change it to 99.2", 99.2, r.frequency, 0.0001);
	}
	
	@Test
	public void method_setFrequency() {
		r.frequency = 107.9;
		
		r.setFrequency(99.1);
		
		assertEquals("When frequency is 107.9 and method is called to set it to 99.1 it does not change it to 99.1", 99.1, r.frequency, 0.0001);
	}
	
	@Test
	public void method_getFrequency() {
		r.frequency = 100.0;
		
		assertEquals("When frequency is 100.0 and method is called it does not return 100.0", 100.0, r.getFrequency(), 0.0001);
	}
	
	@Test
	public void method_turnOn() {
		r.on = false;
		
		r.turnOn();
		
		assertEquals("The on attribute is false, and method is called, it doesnt become true", true, r.on);
	}
	
	@Test
	public void method_turnOff() {
		r.on = true;
		
		r.turnOff();
		
		assertEquals("The on attribute is true, and method is called, it doesnt become false", false, r.on);
	}
	
	@Test
	public void method_isOn() {
		r.on = true;
		
		assertEquals("The on attribute is true, and method is called, it doesnt return true, but "+r.on, true, r.on);
	}
	
	

}
