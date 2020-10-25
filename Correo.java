package gmail;
// Class Correo

public class Correo {
    private String destinatario;
    private String asunto;
    private String cuerpo;
    private String emisor;

    public String getDestinatario() {
        return destinatario;
    }
    public void setDestinatario (String destinatario) {
        this.destinatario = destinatario;
    }

    public String getAsunto() {
        return asunto;
    }
    public void setAsunto (String asunto) {
        this.asunto = asunto;
    }

    public String getCuerpo() {
        return cuerpo;
    }
    public void setCuerpo (String cuerpo) {
        this.cuerpo = cuerpo;
    }

    public String getEmisor() {
        return emisor;
    }
    public void setEmisor (String emisor) {
        this.emisor = emisor;
    }
    

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();                                                                   
        sb.append("\nDestinatario: ");
        sb.append(destinatario);
        sb.append("\nAsunto: ");
        sb.append(asunto);
        sb.append("\nCuerpo: ");
        sb.append(cuerpo);
        sb.append("\nEmisor: ");
        sb.append(emisor);
        return sb.toString();
    } 
}

