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
	public void ukljucenPocetnaVrednost() {
		assertEquals(false, r.on);
	}
	
	@Test
	public void trenutnaFrekvencijaPocetnaVrednost() {
		assertEquals(87.5, r.frequency, 0.0001);
	}
	
	@Test
	public void promeniFrekvencijuNavise() {
		r.frequency = 99.7;
		
		r.increaseFrequency();
		
		assertEquals(99.8, r.frequency, 0.0001);
	}
	
	@Test
	public void promeniFrekvencijuNanize() {
		r.frequency = 99.3;
		
		r.decreaseFrequency();
		
		assertEquals(99.2, r.frequency, 0.0001);
	}
	
	@Test
	public void postaviFrekvenciju() {
		r.frequency = 107.9;
		
		r.setFrequency(99.1);
		
		assertEquals(99.1, r.frequency, 0.0001);
	}
	
	@Test
	public void vratiTrenutnuFrekvenciju() {
		r.frequency = 100.0;
		
		assertEquals(100.0, r.getFrequency(), 0.0001);
	}
	
	@Test
	public void Ukljuci() {
		r.on = false;
		
		r.turnOn();
		
		assertEquals(true, r.on);
	}
	
	@Test
	public void Iskljuci() {
		r.on = true;
		
		r.turnOff();
		
		assertEquals(true, r.on);
	}
	
	@Test
	public void DaLiJeUkljucen() {
		r.on = true;
		
		assertEquals(true, r.isOn());
	}
	
	

}
