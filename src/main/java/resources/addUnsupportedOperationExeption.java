package resources;

public class addUnsupportedOperationExeption extends Exception {

	private static final long serialVersionUID = -1090980650378996560L;
	private static  String msjError="Esta operacion no es soportada";
	public addUnsupportedOperationExeption() {
		super("Error: "+getMsjError());
		
	}
	public static String getMsjError() {
		return msjError;
	}
	
	
	
	
	
	
	

}
