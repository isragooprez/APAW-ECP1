package strategy;

public class StrategyPistola implements IStrategy {
	@Override
	public String ObtenerDescripcionStrategia() {
		return "Player Amateur";
	}

	@Override
	public String Atacar(int estado) {
		if (estado == 1) {
			return "Soldado Amateur Atacando";
		} else {
			return "Soldado Amateur Escondido";
		}

	}

	@Override
	public String Recargar(int municion) {
		return "Regargando: " + municion  + " balas";
	}
}
