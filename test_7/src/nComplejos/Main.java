package nComplejos;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		double r1,r2,i1,i2;
		boolean falso=true;
		operaciones op=new operaciones(0,0,0,0);
	
		Scanner scan= new Scanner(System.in);
		
                System.out.println("Menu de Opciones: \n"
				+ "1). Sumar dos Numeros Complejos \n"
				+ "2). Multiplicar dos numeros complejos \n"
				+ "3). Comparar 2 Numeros Complejos \n"
				+ "4). Multiplicar un Numero Complejo por uno entero \n"
				+ "0). EXIT");

       do {	
       for(int i=5;i>0;i--) { 
        	
		int entrada1=scan.nextInt();
		
		if(entrada1==2) {
			System.out.println("Multiplicacion de Dos Numeros complejos");
			break;
		}
		if(entrada1==3) {
			System.out.println("Comparar Dos Numeros Complejos");
			break;
		}
		if(entrada1==4) {
			System.out.println("Multiplicacion de un entero con uno complejo");
			break;
		}
		
		if(entrada1==1) {	
		
		System.out.println("Digite el Primer Elemento");
		System.out.println("Digite el Primer Numero Real");
		r1=scan.nextDouble();
		System.out.println("Digite el Primer Numero Imaginario");
		i1=scan.nextDouble();
		
		System.out.println("Digite el Segundo Elemento");
		System.out.println("Digite el Segundo Numero Real");
		r2=scan.nextDouble();
		System.out.println("Digite el Segundo Numero Imaginario");
		i2=scan.nextDouble();
		
		op.sumaR(r1,r2);
		op.sumaI(i1, i2);
		
		
		System.out.println("Ejercicio Ordenado " + "("+r1+""+i1+"i"+") + ("+r2+ " " +i2+"i"+")");
		System.out.println("Solucion: "+op.sumaR(r1, r2)+op.sumaI(i1, i2));
		break;
}
		
	if(entrada1==0) {
		System.out.println("EXIT");
		
		break;
			}else {
				
			
				System.out.println("Error de Sistma, Tiene: "+i+" Intentos");
				System.out.println("Digite Nuevamente");
				if(i==1) {
				
				System.out.println("Salida Inminente");
				break;
				}
			}
			}
		
        }while(falso==false);
	
		
		
		
	}

}
