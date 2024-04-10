package oo2_ej6;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TopografiaMixtaTest {
	TopografiaTierra tierra;
	TopografiaAgua agua;
	TopografiaMixta mixta;
	
	@BeforeEach
	void setUp() {
		agua = new TopografiaAgua();
		tierra = new TopografiaTierra();
		mixta = new TopografiaMixta(agua, tierra, agua, tierra);
	}
	
	@Test
	public void testProporcionAgua() {
		assertEquals(0.5, mixta.proporcionAgua());
	}
	
	@Test
	public void testProporcionTierra() {
		assertEquals(0.5, mixta.proporcionTierra());
	}
	
	@Test
	public void testComparar() {
		TopografiaMixta mixta2 = new TopografiaMixta(agua, agua, tierra, tierra);
		
		assertEquals(false, mixta.comparar(agua));
		assertEquals(false, mixta.comparar(tierra));
		assertEquals(false, mixta.comparar(mixta2));
		assertEquals(true, mixta.comparar(mixta));
		
	}

}
