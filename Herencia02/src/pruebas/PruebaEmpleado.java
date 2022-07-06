package pruebas;

import modelo.Empleado;

public class PruebaEmpleado {

	public static void main(String[] args) {
		
		Empleado emp = new Empleado();
		System.out.println("El empleado creado con el contructor sin parámetros es "+emp);

		emp = new Empleado("Ana","Lopez", 47, 1000 );
		System.out.println("El empleado Ana es \n"+emp);
		
		System.out.println("El sueldo de Ana es: "+emp.calculaSalario());
		
		System.out.println("actualizando la antiguedad a 4 años");
		emp.setAntiguedad(4);
		
		System.out.println("El sueldo de Ana es: "+emp.calculaSalario());
		
		System.out.println("actualizando la antiguedad a 22 años");
		emp.setAntiguedad(22);
		System.out.printf("El sueldo de Ana es: %.2f",emp.calculaSalario());
		
		/*System.out.println("El sueldo de Ana es: "
		          +String.format("%.2f", emp.calculaSalario()));*/

		
		
		
	}

}
