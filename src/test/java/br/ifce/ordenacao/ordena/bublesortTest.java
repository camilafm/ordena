package br.ifce.ordenacao.ordena;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class bublesortTest {
	@Test
	public void testBubleSort()
	    {
	   		int[] vetorEntrada = {10,9,8,7,6,5,4,3,2,1,0};
			int[] vetorSaida = {0,1,2,3,4,5,6,7,8,9,10};
			bublesort bs = new bublesort();
			
			int resultado[] = bs.ordena(vetorEntrada);
			for (int i = 0; i < resultado.length; i++) {
				assertEquals(vetorSaida[i], resultado[i]);
			}
	    }
}
