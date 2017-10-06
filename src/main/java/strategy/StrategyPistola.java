package strategy;

public class StrategyPistola implements IStrategy {
	@Override
	public String ObtenerDescripcionStrategia() {
		return "Player Amateur";
	}

	@Override
	public String Atacar(int estado) {
		if (estado == 1) {

			return "Soldado Atacando";
		} else {
			return "Soldado Escondido";
		}

	}

	@Override
	public String Recargar(int municion) {
		return "Regargando: " + municion  + " balas";
	}
}
