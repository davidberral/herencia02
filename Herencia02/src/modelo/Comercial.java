package modelo;

public class Comercial extends Empleado {

	private int nVentas;
	private static double importeVentas=45.90;
	
	/**
	 * Construye un ibjeto comercial con el numero de ventas a 0
	 */
	public Comercial() {
		super();
		this.nVentas=0;
	}

	public Comercial(String nombre, String apellido, int edad, double salario,
			int antiguedad) {
		super(nombre, apellido, edad, salario, antiguedad);
		this.nVentas=0;
	}

	public Comercial(String nombre, String apellido, int edad, double salario) {
		super(nombre, apellido, edad, salario);
		this.nVentas=0;
	}

	public Comercial(String nombre, String apellido, int edad, double salario, int antiguedad, int nVentas) {
		super(nombre, apellido, edad, salario, antiguedad);
		this.nVentas = nVentas;
	}

	public Comercial(Comercial c) {
		super(c);
		this.nVentas = c.nVentas;
	}

	@Override
	public String toString() {
		return "Comercial [nombre=" + nombre + ", apellido=" + apellido + ",\nedad=" + edad + ", salario=" + salario
				+ ", antiguedad=" + antiguedad + ", nVentas=" + nVentas + "]";
	}

	public static double getImporteVentas() {
		return importeVentas;
	}

	public static void setImporteVentas(double importeVentas) {
		Comercial.importeVentas = importeVentas;
	}

	public int getnVentas() {
		return nVentas;
	}
	
	public void contabilizaVentas(int ventasDia) {
		if(ventasDia >7) {
			ventasDia=7;
		}
		
		this.nVentas=this.nVentas+ventasDia;
		if (this.nVentas>25) {
			this.nVentas=25;
		}
		
		//this.nVentas=Math.min(this.nVentas+ventasDia, 25);
		//this.nVentas=Math.min(this.nVentas+Math.min(ventasDia, 7), 25);
	}
	
	public void resetearContador() {
		this.nVentas=0;
	}

	@Override
	public double calculaSalario() {
		return super.calculaSalario()+this.nVentas*Comercial.importeVentas;
	}
	
}
