package resources;

public class PistolaInvalidaOptionExeption extends Exception{

	/**
	 * 
	 */
	
	private static String message ="Opcion No valida o no existe";
	private static final long serialVersionUID = 6723121436072837760L;

	public PistolaInvalidaOptionExeption() {
		super(message);
	
	}


}
