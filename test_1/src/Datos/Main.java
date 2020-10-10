package Datos;

import java.util.Scanner;

public class Main {

	public static double mayorArea(Triangulo_Isosceles triangulos[]) {
		double area;
		area=triangulos[0].obtenerArea();
		
		for(int i=0;i<triangulos.length;i++) {
			
			if(triangulos[i].obtenerArea()>area) {
				area=triangulos[i].obtenerArea();
			}
			
		}
		return area;
		}
	 static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		double base,lado;
		
		int nTriangulos;
		
		System.out.println("Digite el numero de Triangulos");
		System.out.print("");
		nTriangulos=scan.nextInt();
		
		
		Triangulo_Isosceles triangulos[]= new Triangulo_Isosceles[nTriangulos];
		
		for(int i=0;i<triangulos.length;i++) {
			
			System.out.println("Digite los datos del triangulo: "+(i+1));
			System.out.println("Digite La base");
			base=scan.nextDouble();
			System.out.println("Digite el Lado");
			lado=scan.nextDouble();
			
			triangulos[i]= new Triangulo_Isosceles(base,lado);
			
			System.out.println("El perimetro es: "+triangulos[i].obtenerPerimetro());
			System.out.println("El Area es: "+triangulos[i].obtenerArea());
		}

		System.out.println("El Triangulo de mayor Superficie es "+mayorArea(triangulos));
		
		
	}

}
