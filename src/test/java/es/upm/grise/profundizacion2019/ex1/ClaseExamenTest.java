package es.upm.grise.profundizacion2019.ex1;

import static org.junit.Assert.*;

import org.junit.Test;

public class ClaseExamenTest {

	@Test
	// C1
	public void test1() {
		ClaseExamen o = new ClaseExamen();
		assertEquals(0, o.metodoAProbar(1, 1), 0);
	}
	
	@Test
	// C2
	public void test2() {
		ClaseExamen o = new ClaseExamen();
		assertEquals(0, o.metodoAProbar(2, 1), 0);
	}
	
	// C3 - No se puede recorrer, ya que una vez pasado el while,
	// la a siempre tendrá el mismo valor que la b, por lo tanto,
	// la evaluación del if siempre dará verdadero

}
