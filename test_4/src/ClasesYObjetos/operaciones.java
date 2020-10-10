package ClasesYObjetos;

import javax.swing.JOptionPane;

public class operaciones {

	int division, $num1,$num2;
	
	public void leerDatos(){
		
	$num1=Integer.parseInt(JOptionPane.showInputDialog("Type Number"));
    $num2=Integer.parseInt(JOptionPane.showInputDialog("Type Number"));
	}
	
	public void dividir() {
		division= $num1/$num2;
		
	}

	public int suma(int numero1, int numero2) {
		
		int suma=numero1+numero2;
		return suma;
	
	}
	public void resultadoS(int suma) {
		
		JOptionPane.showMessageDialog(null,"Result Sum: "+suma);
	
	}
	
	public void resultadoD() {
		JOptionPane.showMessageDialog(null, "Result Div "+division);
	
		
	}

}
