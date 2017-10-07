package strategy;



public class StrategyPistola implements IStrategy {
	@Override
	public String ObtenerDescripcionStrategia() {
		return "Player Amateur";
	}

	@Override
	public String Atacar(int estado) {

		String result = "";
		if (estado == 1) {
			result = "Soldado Amateur Atacando";
		} 
		if (estado != 1) {
			result = "Soldado Amateur Fuera de acción";
		}

		return result;
	}

	@Override
	public String Recargar(int municion) {
		return "Regargando: " + municion + " balas";
	}
}
