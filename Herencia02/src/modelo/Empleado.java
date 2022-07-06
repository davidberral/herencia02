/**
 * 
 */
package modelo;

/**
 * @author David
 * Clase que modela a un empleado
 */
public class Empleado {

	protected String nombre;
	protected String apellido;
	protected int edad;
	protected double salario;
	protected int antiguedad;
	
	public static final double factorTrienio1 = 0.05;
	public static final double factorTrienio2 = 0.08;
	
	/**
	 * Constructor por defecto de la clase
	 */
	public Empleado() {
		this.nombre="";
		this.apellido="";
		this.edad=0;
		this.antiguedad=0;
	}

	/**
	 * Constructor de la clase que crea un objeto emepleado dado sus pararmetros. 
	 * Se esteblece la antiguedad a 0
	 * @param nombre String con el nombre del empleado
	 * @param apellido STring con el apellido
	 * @param edad int edad del empleado en años
	 * @param salario double salalario del empleado en euros
	 * @param antiguedad int antiguedad del empleado en años
	 */
	public Empleado(String nombre, String apellido, int edad, double salario, 
			int antiguedad) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.salario = salario;
		this.antiguedad = antiguedad;
	}

	/**
	 * Constructor de la clase que crea un objeto emepleado dado sus pararmetros. 
	 * Se esteblece la antiguedad a 0
	 * @param nombre String con el nombre del empleado
	 * @param apellido STring con el apellido
	 * @param edad int edad del empleado en años
	 * @param salario double salalario del empleado en euros
	 */
	public Empleado(String nombre, String apellido, int edad, double salario) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.salario = salario;
		this.antiguedad=0;
	}
	
	/**
	 * Constructor de copia que realiza una copia del emepleado pasado como 
	 * parámetro
	 * @param e Empleado a copiar
	 */
	public Empleado(Empleado e) {
		this.nombre = e.nombre;
		this.apellido = e.apellido;
		this.edad = e.edad;
		this.salario = e.salario;
		this.antiguedad = e.antiguedad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public int getAntiguedad() {
		return antiguedad;
	}

	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}

	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", antiguedad=" + antiguedad
				+ ", salario=" + salario + "]";
	}
	
	/**
	 * Método que calcula el dinero que se leleva el empleado por los trienios 
	 * trabajados a un 5% del salario cada trienio hasta el quinto y un 8% desde
	 * entonces.
	 * @return double con el importe de trienios del empleado
	 */
	public double calculaTrienios() {
		int numTrienios = this.antiguedad/3;
		double totalTrienios = 0;
		double salarioNuevo=this.salario;
		
		
		for(int i=1; i<=numTrienios; i++) {
			if (i<=5) {
				totalTrienios= totalTrienios+salarioNuevo*factorTrienio1;
			} else {
				totalTrienios= totalTrienios+salarioNuevo*factorTrienio2;
			}
			salarioNuevo=this.salario+totalTrienios;
		}
		return totalTrienios;
	}
	
	/**
	 * Método que calcula el salario del empleado como la suma de su salario
	 * más el importe que se lleva por los trienios de antiguedad
	 * @return double con la cantidad del salario total
	 */
	public double calculaSalario() {
		return this.salario+this.calculaTrienios();
	}
	
	
	
	
	
	
	
	
}
