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
	public void atribut_jacinaTona() {
		assertEquals("Početna jačina tona bi trebalo da bude 0, ali je "+t.volume, 0, t.volume);
	}
	
	@Test
	public void atribut_ukljucen() {
		assertEquals("Početna vrednost atributa ukljucen bi trebalo da bude false, ali je "+t.on, false, t.on);
	}
	
	@Test
	public void atribut_program() {
		assertEquals("Početna vrednost atributa program bi trebalo da bude 1, ali je "+t.channel,1, t.channel);
	}
	
	@Test
	public void metoda_pojacajTon() {
		t.volume = 5;
		
		t.increaseVolume();
		
		assertEquals("Kad je jacina tona 5 i pozove se metoda, jacina tona ne postane 6, već "+t.volume, 6, t.volume);
	}
	
	@Test
	public void metoda_smanjiTon() {
		t.volume = 4;
		
		t.decreaseVolume();
		
		assertEquals("Kad je jacina tona 4 i pozove se metoda, jacina tona ne postane 3, već "+t.volume,3, t.volume);
	}
	
	@Test
	public void metoda_iskljuciTon() {
		t.volume = 5;
		
		t.turnDown();
		
		assertEquals("Kad je jacina tona 5 i pozove se metoda, jacina tona ne postane 0, već "+t.volume, 0, t.volume);
	}
	
	@Test
	public void metoda_ukljuci() {
		t.on = false;
		
		t.turnOn();
		
		assertEquals("Kad je ukljucen false i pozove se metoda, ukljucen ne postane true, već "+t.on, true, t.on);
	}
	
	@Test
	public void metoda_iskljuci() {
		t.on = true;
		
		t.turnOff();
		
		assertEquals("Kad je ukljucen true i pozove se metoda, ukljucen ne postane false, već "+t.on, false, t.on);
	}
	
	@Test
	public void metoda_daLiJeUkljucen() {
		t.on = true;
		
		assertEquals("Kad je ukljucen true i pozove se metoda, ona ne vraća true, već "+t.on, true, t.isOn());
	}
	
	@Test
	public void metoda_vratiJacinuTona() {
		t.volume = 12;
		
		assertEquals("Kad je jacinaTona 12 i pozove se metoda, ona ne vraća 12, već "+t.getVolume(), 12, t.getVolume());
	}
	
	@Test
	public void metoda_promeniProgram() {
		t.setChannel(15);
		
		assertEquals("Kad se pozove metoda da podesi program na 15, ona ga podesi na "+t.channel, 15, t.channel);
	}
	
	
	

}
