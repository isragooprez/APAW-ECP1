package strategy;

import resources.PistolaInvalidaOptionExeption;

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
		} else {

			try {
				throw new PistolaInvalidaOptionExeption();
			} catch (PistolaInvalidaOptionExeption e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return result;
	}

	@Override
	public String Recargar(int municion) {
		return "Regargando: " + municion + " balas";
	}
}
