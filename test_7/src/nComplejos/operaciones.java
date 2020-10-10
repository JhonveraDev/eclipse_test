package nComplejos;

public class operaciones {

	private double r1,r2,i1,i2;
	
	public operaciones(double r1,double r2,double i1,double i2) {
		this.r1=r1;
		this.r2=r2;
		this.i1=i1;
		this.i2=r2;
		
	}
	public double sumaR(double r1,double r2) {
		double sumaReal=r1+r2;
		return sumaReal;
	}
	public double sumaI(double i1,double i2) {
		double sumaImag=i1+i2;
		return sumaImag;
	}
	
	
	
	
}
