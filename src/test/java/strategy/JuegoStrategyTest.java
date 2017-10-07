package strategy;

import org.junit.Before;
import org.junit.Test;

import resources.PistolaInvalidaOptionExeption;

public class JuegoStrategyTest {
	private Soldado soldado;

	@Before
	public void Ini() {
		soldado = new Soldado();
	}

	@Test
	public void playerNovato() {
		this.soldado.playerNovato();
		this.soldado.Informacion(0, 100);

	}

	@Test
	public void playerJunior() {
		this.soldado.playerJunior();
		this.soldado.Informacion(1, 50);
	}

	@Test(expected = PistolaInvalidaOptionExeption.class)
	public void playerAmateurEstadoNovalido() {
		this.soldado.playerAmateur();
		this.soldado.Informacion(5, 20);

	}

	@Test
	public void playerAmateurEstadoValido() {
		this.soldado.playerAmateur();
		this.soldado.Informacion(1, 20);

	}

}
