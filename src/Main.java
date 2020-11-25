//Clase main
public class Main {

	public static void main(String[] args) {
		
		//Construimos las cuentas que interactuaran
		Cuenta leandro = new Cuenta(new Bandeja(),  // bandeja enviados
									new Bandeja(),  // bandeja recibidos
									new Bandeja(),  // bandeja papelera 
									new Bandeja(),
									new Hangouts());	// bandeja destacado
		
		Cuenta franco  = new Cuenta(new Bandeja(),  // bandeja enviados
									new Bandeja(),  // bandeja recibidos
									new Bandeja(),  // bandeja papelera 
									new Bandeja(),
									new Hangouts());	// bandeja destacado
		
		//Se crean las cuentas con los datos ingresados
		leandro.crearCuenta();
		franco.crearCuenta();
		
		//Se hace uso del metodo enviar mail
		leandro.enviarMail(franco);	
		leandro.enviarHangouts(franco);
		
		//Se hace uso del metodo eliminar mail
		System.out.println(leandro.getEnviado().correos.size());
		leandro.eliminarMail(leandro.getEnviado(), 0);
		
		//Se hace uso del metodo mostrar bandeja
		leandro.mostrarBandeja(leandro.getEnviado());
		
		//Se hace uso del metodo responder mail.
		//leandro.responderMail(0);
		System.out.println("---------------");
		System.out.println(leandro.getMensaje().mensajeingre.size());
		System.out.println("---------------");
		System.out.println(leandro.getEnviado().correos.size());
		System.out.println(franco.getRecibido().correos.size());
		System.out.println(leandro.getPapelera().correos.size());
	}

}
