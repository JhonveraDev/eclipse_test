package Datos;

public class Triangulo_Isosceles {

	private double lado;
	private double base;
	
	
	public Triangulo_Isosceles(double base,double lado) {
		
		this.lado=lado;
		this.base=base;
	
	}
	public double obtenerPerimetro() {
		
	double perimetro=(lado+base)*2;
	return perimetro;
	}
	
	public double obtenerArea() {
	double area=(base*Math.sqrt((lado*lado)-((base*base)/4)))/2;
	return area;
	}
	
	
}
