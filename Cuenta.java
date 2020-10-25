package gmail;

public class Cuenta {
	private String email;
	private String contrasena;

   public Cuenta(String email, String contrasena) {
	   this.email = email;
	   this.contrasena = email;
   }

   public String getEmail() {
	   return this.email;
   }
   
   public String getContrasena() {
	   return this.contrasena;
   }
   
   public boolean isValid(String email, String contrasena) {

	   return email.equals(this.email) && contrasena.equals(this.contrasena);
   
   }

}