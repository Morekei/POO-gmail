//Clase main
public class Main {

	private static final Bandeja bandeja = null;

	public static void main(String[] args) {
		
		//Construimos las cuentas que interactuaran
		Cuenta leandro = new Cuenta("leandro",
									"lacaze", 
									new Bandeja(), 
									new Bandeja(),
									new Bandeja(),
									new Bandeja());	
		Cuenta franco  = new Cuenta("franco",
									"motzo",
				  				    new Bandeja(), 
				  				    new Bandeja(),
				  				    new Bandeja(),
				  				    new Bandeja());
		
		//Se crean las cuentas con los datos ingresados
		leandro.crearCuenta();
		franco.crearCuenta();
		
		//Se hace uso del metodo enviar mail
		leandro.enviarMail(franco);		
		franco.enviarMail(leandro);
		franco.eliminarMail(bandeja, 1);
		
		//
		System.out.println(leandro.getEnviado().correos.size());
		System.out.println(leandro.getRecibido().correos.size());
		System.out.println(leandro.getPapelera().correos.size());
	}

}
