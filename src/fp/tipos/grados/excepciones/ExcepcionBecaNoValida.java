package fp.tipos.grados.excepciones;

public class ExcepcionBecaNoValida extends RuntimeException{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ExcepcionBecaNoValida(){
		super ();
	}
	
	public ExcepcionBecaNoValida(String message){
		super (message);
	}
	

}
