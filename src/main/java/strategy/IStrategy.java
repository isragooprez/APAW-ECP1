package strategy;

public interface IStrategy {
	
	 	String ObtenerDescripcionStrategia();
	    String Atacar(int estado);
	    String Recargar(int municion);
}
