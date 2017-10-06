package strategy;

public class StrategyFusil implements IStrategy {

	@Override
	public String ObtenerDescripcionStrategia() {
		return "Player Novato";
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
		return "Regargando: "+ municion +" balas";
	}

}
