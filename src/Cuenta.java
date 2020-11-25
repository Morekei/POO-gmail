import java.util.Scanner;

//Clase cuenta 
public class Cuenta {
	
	Scanner sc = new Scanner(System.in);
	
	private String nombre;
	private String apellido;
	private String email;
	private Bandeja enviado;
	private Bandeja recibido;
	private Bandeja destacado;
	private Bandeja papelera;
	private Hangouts mensaje;

	
	
	//Constructor de cuentas con sus respectivas bandejas
	public Cuenta(Bandeja enviado, 
			      Bandeja recibido, 
			      Bandeja papelera, 
			      Bandeja destacado,
			      Hangouts mensaje) {
		
		this.enviado = enviado;
		this.recibido = recibido;
		this.papelera = papelera;
		this.destacado = destacado;
		this.mensaje = mensaje;
	}
	
	//Getters y setters
	public Hangouts getMensaje() {
		return mensaje;
	}
	public void setMensaje(Hangouts mensaje) {
		this.mensaje = mensaje;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public Bandeja getEnviado() {
		return enviado;
	}
	public void setEnviado(Bandeja enviado) {
		this.enviado = enviado;
	}

	public Bandeja getRecibido() {
		return recibido;
	}
	public void setRecibido(Bandeja recibido) {
		this.recibido = recibido;
	}
	
	public Bandeja getPapelera() {
		return papelera;
	}
	public void setPapelera(Bandeja papelera) {
		this.papelera = papelera;
	}
	
	public Bandeja getDestacado() {
		return destacado;
	}
	public void setDestacado(Bandeja destacado) {
		this.destacado = destacado;
	}
	
	//METODOS

	//Metodo crear cuenta
	public void crearCuenta() {
		
		System.out.println("Bienvenido al servicio de D-mail, por favor ingrese su nombre y apellido en minusculas.");
		System.out.print("Nombre: ");
		nombre = sc.nextLine();          
        System.out.print("Apellido: ");
        apellido = sc.nextLine();
        System.out.println("Presione Enter para finalizar.");
        sc.nextLine(); //limpiar el intro
        
        
        //dmail es en referencia a Steins Gate con sus DeLoreanMail
		email= nombre + "." + apellido + "@dmail.lab.ar";		
		
		System.out.println("Cuenta creada con éxito! Su dmail nuevo es: "+email);
	}
	//intento de metodo de hangouts
	public void enviarHangouts(Cuenta cuenta) {
		String mensaje;
		
		System.out.println("Enviar un hangouts a : "+cuenta.getEmail());
		System.out.println("Mensaje :");
		mensaje = sc.nextLine();
		System.out.println("Presione Enter para enviar.");
		sc.nextLine();
		
		Mensajehangouts mensajeob = new Mensajehangouts(mensaje, cuenta.getEmail());
		
		mensajeob.setMensaje(mensaje);
		
		this.mensaje.mensajeingre.add(mensajeob);
		cuenta.getMensaje().mensajeingre.add(mensajeob);
		
		System.out.println(email + " ha enviado un mensaje a " + cuenta.getEmail());
	}
	
	
	
	//Metodo de enviar mail de cuenta a cuenta creando en el un correo.
	public void enviarMail(Cuenta cuenta) {
		
		String asunto;
		String cuerpo;
		
		System.out.println("Enviar mail a: "+cuenta.getEmail());
		System.out.print("Asunto: ");
		asunto = sc.nextLine();          
        System.out.print("Cuerpo: ");
        cuerpo = sc.nextLine();
        System.out.println("Presione Enter para enviar.");
        sc.nextLine(); //limpiar el intro
        
		Correo correo = new Correo(email, cuenta.getEmail());
		
		correo.setAsunto(asunto);
		correo.setCuerpo(cuerpo);
		
		this.enviado.correos.add(correo);
		cuenta.getRecibido().correos.add(correo);
		
		System.out.println(email + " ha enviado un mail a " + cuenta.getEmail());
	}	
	
	//Metodo para eliminar un correo de una bandeja y enviarlo a la papelera.	
	public void eliminarMail(Bandeja bandeja, int i) {
		
		Correo correo = bandeja.correos.get(i);
		bandeja.correos.remove(i);
		
		papelera.correos.add(correo);	
	}
	
	//Metodo para destacar un correo dentro de una bandeja.
	public void destacarMail(Bandeja bandeja, int i) {
		
		
		Correo correo = bandeja.correos.get(i);
		//sacamos el correo en la posicion de memoria pedida.
		bandeja.correos.remove(i);
		//cambiamos la propiedad de false a true.
		correo.setDestacado(true);
		//lo añadimos nuevamente a la misma bandeja respetando su antigua posicion de memoria
		bandeja.correos.add(i, correo);		
	}
	
	//Metodo para mostrar los correos de la bandeja seleccionada.
	public void mostrarBandeja(Bandeja bandeja) {
		//for para recorrer cada correo de la bandeja
        for(int i = 0; i< bandeja.correos.size(); i++) {
        	
           //guardamos la info en una variable correo
           Correo correo = bandeja.correos.get(i);
           
           //hacemos uso de cada dato del objeto
           System.out.println("------------------------------");
           System.out.println("Correo #"+i+"   -   "+ correo.getAsunto());
        }
	}
	
	//Metodo para mostrar un correo de la bandeja seleccionada.
	public void mostrarCorreo(Bandeja bandeja, int i) {
		
           Correo correo = bandeja.correos.get(i);
           
           //hacemos uso de cada dato del objeto
           System.out.println("------------------------------");
           System.out.println("Correo #"+i);
           System.out.println("Emisor: "+correo.getEmisor());
           System.out.println("Destinatario: "+correo.getDestinatario());
           System.out.println("Asunto: "+correo.getAsunto());
           System.out.println("Cuerpo: "+correo.getCuerpo());
           System.out.println("------------------------------");
        
	}
	
	//Metodo para responder un mail.
	public void responderMail(int i) {
		String destinatario;
		//no tengo ni idea de como hacer esto sinceramente,
		//el tema de la cuenta para setear el destinatario me jode muchisimo.
		Correo correo = recibido.correos.get(i);
		destinatario = correo.getEmisor();
		
		System.out.println(destinatario);	
	}
	
	//Metodo para limpiar la papelera.	
	public void limpiarPapelera() {
		
		//con clear eliminamos todos los objetos del array.
		papelera.correos.clear();	
	}
	
	
}