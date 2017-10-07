package strategy;

import org.junit.Before;
import org.junit.Test;

public class JuegoStrategyTest {
	private Soldado soldado;
	
	
	@Before
	public void Ini() {
	 soldado= new Soldado();
	} 
	
	
	@Test
	public void playerNovato() {
		this.soldado.playerNovato(); 
		this.soldado.Informacion(0,100);
		
	}
	@Test
	public void playerJunior() {
		this.soldado.playerJunior();
		this.soldado.Informacion(1, 50);
	}
	@Test
	public void playerAmateur() {
		this.soldado.playerAmateur();
		this.soldado.Informacion(5, 20);
		
	}

}
