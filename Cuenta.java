import javax.swing.JOptionPane;

public class Cuenta {
	String email;
	String contrasena;
	int hola;
	
	public void registro(){
	    JOptionPane.showMessageDialog(null, "Ahora se registrara en Gmail.");
		email=JOptionPane.showInputDialog("Ingrese su email.");
		contrasena=JOptionPane.showInputDialog("Ingrese su contraseña.");
		Cuenta cuenta = new Cuenta();
		
	}
	
	public void eleccion() {
		
	}
}