package strategy;

public class Contexto {

	private IStrategy istrategy;

	public IStrategy getIstrategy() {
		return istrategy;
	}

	public void setIstrategy(IStrategy istrategy) {
		this.istrategy = istrategy;
	}

	public String ObtenerDescripcionStrategia() {
		return istrategy.ObtenerDescripcionStrategia();
	};

	public String Atacar(int estado) {
		return istrategy.Atacar(estado);
	};

	public String Recargar(int municion) {
		return istrategy.Recargar(municion);
	};

}
