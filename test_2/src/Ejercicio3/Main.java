package Ejercicio3;

import java.util.Scanner;

public class Main {

	public static int indice(Vehiculo cars[]) {
		float precio;
		int index=0;
		
		precio=cars[0].getPrecio();
		for(int i=0;i<cars.length;i++) {
			
			if(cars[i].getPrecio()<precio) {
				precio=cars[i].getPrecio();
				index=i;
			}
		}
		return index;
	} 	
	
	
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		String marca,modelo;
		float precio;
		int numeroVehiculos,indiceBarato;
		
		System.out.println("Digite la Cantidad de vehiculos");
			numeroVehiculos=scan.nextInt();
			
		Vehiculo cars[]=new Vehiculo[numeroVehiculos]; 
		
		for(int i=0;i<cars.length;i++) {
			scan.nextLine();
			System.out.println("Digite las caracteristicas del carro "+(i+1));
			System.out.println("Digite la Marca");
			marca=scan.nextLine();
			System.out.println("Digite el Modelo");
			modelo=scan.nextLine();
			System.out.println("Digite el Precio");
			precio=scan.nextFloat();
			
			cars[i]= new Vehiculo(marca,modelo,precio);
			
		}
		
		indiceBarato=indice(cars); 
		System.out.println("El Carro Mas Baratos es: " + cars[indiceBarato].mostrarDatos());
	}

}
