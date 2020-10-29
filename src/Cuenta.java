//Clase cuenta 
public class Cuenta {
	
	private String nombre;
	private String apellido;
	private String email;
	private Bandeja enviado;
	private Bandeja recibido;
	private Bandeja destacado;
	private Bandeja papelera;
	
	
	
	//Constructor de cuentas con sus respectivas bandejas
	public Cuenta(String nombre, String apellido, Bandeja enviado, Bandeja recibido, Bandeja papelera, Bandeja destacado) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.enviado = enviado;
		this.recibido = recibido;
		this.papelera = papelera;
		this.destacado = destacado;
	}
	
	//Getters y setters
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
		//dmail es en referencia a Steins Gate con sus DeLoreanMail
		email=nombre+"."+apellido+"@dmail.lab.ar";		
	}
	
	//Metodo de enviar mail de cuenta a cuenta creando en el un correo.
	public void enviarMail(Cuenta cuenta) {
		System.out.println(email + " ha enviado un mail a " + cuenta.getEmail());
		
		Correo correo = new Correo(email, cuenta.getEmail());
		
		this.enviado.correos.add(correo);
		cuenta.getRecibido().correos.add(correo);
	}	
	
	//Metodo para eliminar un correo de una bandeja y enviarlo a la papelera.	
	public void eliminarMail(Bandeja bandeja, int i) {
		
		Correo correo = bandeja.correos.get(i);
		bandeja.correos.remove(i);
		
		papelera.correos.add(correo);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
