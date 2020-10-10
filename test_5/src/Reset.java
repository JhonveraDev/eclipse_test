import javax.*;
import javax.swing.JOptionPane;

public class Reset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	/*	Para Guardar en una Cadena Con String
		String palabra;
		
		Scanner entrada=new Scanner (System.in);
               
		System.out.println("Digite su Numero");
		palabra=entrada.nextLine();
		
		System.out.println("Su numero Ha sido "+palabra);   
		
		----------------------------------------------------
		*/
		
		/*
		----------------------------------------------------
		Data Entry with JOptionPane...
		
		
		int numero;
		String $cadena;
		char $leter;
		double decimal;
		
		numero=Integer.parseInt(JOptionPane.showInputDialog("Digite Numero"));
		$cadena=JOptionPane.showInputDialog("Digite una cadena");
		$leter =JOptionPane.showInputDialog("Digite un Caracter").charAt(0);
		decimal=Double.parseDouble(JOptionPane.showInputDialog("Digite decimal"));
		----------------------------------------------------
		*/
		
		/*
		----------------------------------------------------
		 Revision de los prefijos y sufijos.
		 es un modo para realizar los incrementos de una variable
		
		int x=5 ,y;
		
		y=x++; //sufijo//
		y=++x; //prefijo//
		
		System.out.println(y);
		System.out.println(x);
		
			----------------------------------------------------
		*/
		
		
		/*
		----------------------------------------------------
		-Some forms of using  of the Math. 
		-float: is using with values of seven digits (32 Bits)
		 Double:Is usign with values of sixteen digits (64 Bits) ;
		 Decimal:Is usign with values of twenty nine digits (128 Bits);
		 Methods of class Math
		
		
		Double $base;
			$base= Double.parseDouble(JOptionPane.showInputDialog("Digite Base")); 
		Double $exponente;
			$exponente= Double.parseDouble(JOptionPane.showInputDialog("Digite su Exponente"));
		Double $resultado;
			$resultado= Math.pow($base,$exponente); 
		System.out.println("Su resultado Es: "+ $resultado); //potencia
		
		
		Double numero= Math.sqrt(10587); //Resultado en un valor Decimal de la raiz
		int numeros= (int)Math.sqrt(10); //Resultado en un valor entero  de la raiz
		
		double base=5, exponente=10;
			double resultado= Math.pow(base, exponente);  //Potencia
				System.out.println(resultado);
				
				
		Double $red=4.58;
		Long $result= Math.round($red); // En round hay que dejar un valor tipo Long
		System.out.println("redondeado "+ $result); //Redondea los valores decimales
		
		
		
		double $results= Math.random(); // Sacar un numero Aleatorio
		System.out.println($results);
		
		----------------------------------------------------
		*/
		
/*	------------------------------------------------
		
		
	JOptionPane.showMessageDialog(null,"Hi");	
		
	int $num=0;
	
	Scanner $num_scan= new Scanner(System.in);
	
	System.out.println("Type the number that Stopping the program");
	$num=$num_scan.nextInt();
	
	for(int $cont=$num;$cont!=0;$cont--) {
	JOptionPane.showMessageDialog(null,"Foul "+ $cont+ " for Stopping");
	}
	
	JOptionPane.showMessageDialog(null,"End");

	}
		------------------------------------------------	
	*/	
		
		
	}

}
