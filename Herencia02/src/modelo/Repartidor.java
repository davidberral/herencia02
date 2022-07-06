package modelo;

public class Repartidor extends Empleado {

	private String zona;
	private String matricula;
	private double kmInicioMes;
	private double kmFinales;
	private double dietas;
	
	
	public Repartidor() {
		super();
		this.zona="";
		this.matricula="";
	}


	public Repartidor(String nombre, String apellido, int edad, double salario,
			int antiguedad, String zona, String matricula, double kmInicioMes, 
			double kmFinales, double dietas) {
		
		super(nombre, apellido, edad, salario, antiguedad);
		
		this.zona = zona;
		this.matricula = matricula;
		this.kmInicioMes = kmInicioMes;
		this.kmFinales = kmFinales;
		this.dietas = dietas;
	}


	public Repartidor(String nombre, String apellido, int edad, double salario,
			String zona, String matricula) {
		super(nombre, apellido, edad, salario);
		this.zona = zona;
		this.matricula = matricula;
		this.kmInicioMes = 0;
		this.kmFinales = 0;
		this.dietas = 0;
	}
	
	public Repartidor(String nombre, String apellido, int edad, double salario,
			String zona, String matricula, double kmInicioMes) {
		super(nombre, apellido, edad, salario);
		this.zona = zona;
		this.matricula = matricula;
		this.kmInicioMes = kmInicioMes;
		this.kmFinales = 0;
		this.dietas = 0;
	}


	public Repartidor(Repartidor e) {
		super(e);
		this.zona = e.zona;
		this.matricula = e.matricula;
		this.kmInicioMes = e.kmInicioMes;
		this.kmFinales = e.kmFinales;
		this.dietas = e.dietas;
	}


	@Override
	public String toString() {
		return "Repartidor [nombre=" + nombre + ", apellido=" + apellido + ", \nedad=" + edad + ", salario=" + salario
				+ ", antiguedad=" + antiguedad + ", zona=" + zona + ", \nmatricula=" + matricula + ", kmInicioMes="
				+ kmInicioMes + ", kmFinales=" + kmFinales + ", dietas=" + dietas + "]\n";
	}


	public String getZona() {
		return zona;
	}


	public void setZona(String zona) {
		this.zona = zona;
	}


	public String getMatricula() {
		return matricula;
	}


	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}


	public double getKmInicioMes() {
		return kmInicioMes;
	}


	public double getKmFinales() {
		return kmFinales;
	}


	public double getDietas() {
		return dietas;
	}
	
	public void añadirDieta(double dietaDia) {
		if (dietaDia>25) {
			this.dietas=this.dietas+25;
		} else {
			this.dietas=this.dietas+dietaDia;
		}
	}
	
	public void actualizaKms(double km) {
		if (km>this.kmFinales) {
			this.kmFinales=km;
		}
	}
	
	public void reiniciarDietas() {
		this.dietas=0;
	}
	
	public void reiniciarKm() {
		this.kmInicioMes=this.kmFinales;
	}


	@Override
	public double calculaSalario() {
		return this.salario+this.dietas + 0.45 * (this.kmFinales-this.kmInicioMes); 
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
