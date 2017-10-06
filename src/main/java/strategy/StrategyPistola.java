package strategy;

import resources.PistolaInvalidaOptionExeption;

public class StrategyPistola implements IStrategy {
	@Override
	public String ObtenerDescripcionStrategia() {
		return "Player Amateur";
	}

	@Override
	public String Atacar(int estado) {
		String result = null;
		if (estado != 1) {
			try {
				throw new PistolaInvalidaOptionExeption();
			} catch (PistolaInvalidaOptionExeption e) {
				e.printStackTrace();
			}
		} else {
			result = "Soldado Amateur Atacando";
		}
		return result;
	}

	@Override
	public String Recargar(int municion) {
		return "Regargando: " + municion + " balas";
	}
}
