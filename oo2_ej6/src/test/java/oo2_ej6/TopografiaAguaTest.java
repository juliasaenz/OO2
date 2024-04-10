package oo2_ej6;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TopografiaAguaTest {
	TopografiaAgua agua;
	
	@BeforeEach
	void setUp() {
		agua = new TopografiaAgua();
	}
	
	@Test
	public void testProporcionAgua() {
		assertEquals(1, agua.proporcionAgua());
	}
	
	@Test
	public void testProporcionTierra() {
		assertEquals(0, agua.proporcionTierra());
	}
	
	@Test
	public void testComparar() {
		TopografiaAgua agua2 = new TopografiaAgua();
		TopografiaTierra tierra = new TopografiaTierra();
		TopografiaMixta mixta = new TopografiaMixta(agua, tierra, agua, tierra);
		
		assertEquals(true, agua.comparar(agua2));
		assertEquals(false, agua.comparar(tierra));
		assertEquals(false, agua.comparar(mixta));
		
	}

}
