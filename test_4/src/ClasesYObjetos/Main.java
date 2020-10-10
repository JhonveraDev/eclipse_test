package ClasesYObjetos;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
	operaciones op=new operaciones();	
	
	int n1=Integer.parseInt(JOptionPane.showInputDialog("Type Number sum"));
	int n2=Integer.parseInt(JOptionPane.showInputDialog("Type Number sum"));
	
	
	int suma = op.suma(n1,n2);
	op.resultadoS(suma);
	op.leerDatos();
	op.dividir();
	op.resultadoD();


	
	}

}
