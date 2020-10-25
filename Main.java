package gmail;
import java.util.*;
import javax.swing.JOptionPane;


public class Main {
	
	static Scanner sc = new Scanner(System.in);
	
	// Se crea un arraylist para guardar los correos enviados.
	static ArrayList<Correo> correosenviados = new ArrayList();
	
	public static void main(String[] args) {
		
		Cuenta registro = new Cuenta(JOptionPane.showInputDialog("Ingrese Email para registrarse.")
				, JOptionPane.showInputDialog("Ingrese Contraseña."));
		
		if(registro.isValid(JOptionPane.showInputDialog("Ingrese email."), 
			
			JOptionPane.showInputDialog("Ingrese contraseña."))) {
			System.out.println(registro.getEmail());
			JOptionPane.showMessageDialog(null, "Exito!");
			
		} else {
			
			JOptionPane.showMessageDialog(null, "email y/o contraseña erroneo");
		
		};
		
		System.out.println(registro.getEmail());
	}
	
	//Metodo para crear un correo y "enviarlo" metiendolo en un array.
	public static void enviarCorreo() {
		
        //Declarar las variables para leer los datos de los correos.
        String destinatario;
        String asunto;
        String cuerpo;
        String emisor;

        //Variable auxiliar que contendra la referencia a cada correo nuevo.
        Correo aux;

        //leer datos de cada correo
        System.out.print("Destinatario: ");
        destinatario = sc.nextLine();          
        System.out.print("Asunto: ");
        asunto = sc.nextLine();
        System.out.print("Cuerpo: ");
        cuerpo = sc.nextLine();
        System.out.print("Emisor: ");
        emisor = Cuenta.getEmail(); // esto claramente esta mal, pero la idea es que el emisor sea el usuario y se defina automaticamente
        sc.nextLine(); //limpiar el intro


        aux = new Correo(); //Se crea un objeto Correo y se asigna su referencia a aux                          
        //se asignan valores a los atributos del nuevo objeto
        aux.setDestinatario(destinatario);
        aux.setAsunto(asunto);
        aux.setCuerpo(cuerpo);
        aux.setEmisor(emisor);
                      
        //se añade el objeto al final del array
        correosenviados.add(aux);

    } //fin método enviarCorreo()
}
