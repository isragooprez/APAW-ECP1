package strategy;

public class StrategyRifle implements IStrategy {

	@Override
	public String ObtenerDescripcionStrategia() {
		return "Player Junior";
	}

	@Override
	public String Atacar(int estado) {
		String resul="Opcion no valida";
		switch (estado) {
		case 1:
			resul = "Soldado Amateur Atacando";
			break;
		case 2:
			resul = "Soldado Amateur Escondido";
			break;

		default:
			break;
		}
		return resul;
	}

	@Override
	public String Recargar(int municion) {
		return "Regargando: " + municion + " balas";
	}
}
