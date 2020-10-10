package numerosComplejos;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		numComplejos nc= new numComplejos(0, 0, 0, 0);
			
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Digite el Primer numero Real");
		double r1=scan.nextDouble();
		System.out.println("Digite el primer numero Imaginario");
		double i1=scan.nextDouble();
		
		System.out.println("Digite el segundo numero Real");
		double r2=scan.nextDouble();
		System.out.println("Digite el segundo numero Imaginario");
		double i2=scan.nextDouble();
		
		
		System.out.println("La suma real es: "+nc.sumReales(r1,r2));
		System.out.println("La suma real es: "+nc.sumImaginarios(i1,i2));
		
		
		
		
	}

}
