//Clase de correo
public class Correo {
	
	private String emisor;
	private String destinatario;
	
	//Constructor de correo
	public Correo(String emisor, String destinatario) {
		this.emisor = emisor;
		this.destinatario = destinatario;
	}
	
	
	//Getters y setters
	public String getEmisor() {
		return emisor;
	}
	public void setEmisor(String emisor) {
		this.emisor = emisor;
	}
	public String getDestinatario() {
		return destinatario;
	}
	public void setDestinatario(String destinatario) {
		this.destinatario = destinatario;
	}
	
	
}