import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		
		Cuenta registro = new Cuenta(JOptionPane.showInputDialog("Ingrese Email para registrarse.")
				, JOptionPane.showInputDialog("Ingrese Contrase�a."));
		
		if(registro.isValid(JOptionPane.showInputDialog("Ingrese email."), 
			
			JOptionPane.showInputDialog("Ingrese contrase�a."))) {
			System.out.println(registro.getEmail());
			JOptionPane.showMessageDialog(null, "Exito!");
			
		} else {
			
			JOptionPane.showMessageDialog(null, "email y/o contrase�a erroneo");
		
		};
		
		System.out.println(registro.getEmail());
	}
}