import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		Cuenta registro = new Cuenta(JOptionPane.showInputDialog("Ingrese su Email"),
				JOptionPane.showInputDialog("Ingrese su Contrase�a"));
		System.out.println(registro.getEmail());
	}
}