package oo2_ej6;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TopografiaTierraTest {
	TopografiaTierra tierra;
	
	@BeforeEach
	void setUp() {
		tierra = new TopografiaTierra();
	}
	
	@Test
	public void testProporcionAgua() {
		assertEquals(0, tierra.proporcionAgua());
	}
	
	@Test
	public void testProporcionTierra() {
		assertEquals(1, tierra.proporcionTierra());
	}
	
	@Test
	public void testComparar() {
		TopografiaAgua agua = new TopografiaAgua();
		TopografiaTierra tierra2 = new TopografiaTierra();
		TopografiaMixta mixta = new TopografiaMixta(agua, tierra, agua, tierra);
		
		assertEquals(false, tierra.comparar(agua));
		assertEquals(true, tierra.comparar(tierra2));
		assertEquals(false, tierra.comparar(mixta));
		
	}

}
