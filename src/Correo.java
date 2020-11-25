//Clase de correo
public class Correo {
	
	private String emisor;
	private String destinatario;
	private String asunto;
	private String cuerpo;
	private boolean destacado = false;
	
	
	//Constructor de correo
	public Correo(String emisor, String destinatario) {
		super();
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

	public boolean isDestacado() {
		return destacado;
	}
	public void setDestacado(boolean destacado) {
		this.destacado = destacado;
	}

	public String getAsunto() {
		return asunto;
	}
	public void setAsunto(String asunto) {
		this.asunto = asunto;
	}

	public String getCuerpo() {
		return cuerpo;
	}
	public void setCuerpo(String cuerpo) {
		this.cuerpo = cuerpo;
	}
	
	
}