package pruebas;

import modelo.Comercial;

public class PruebaComercial {

	public static void main(String[] args) {
		Comercial c1 = new Comercial("Luis", "Sánchez", 34, 1800, 4);
		
		System.out.println("El comercial creado es \n"+c1);
		
		System.out.printf("El salario de Luis es %.2f\n", c1.calculaSalario());
		
		System.out.println("Luis hay hecho 3 ventas, añadiendolas...");
		c1.contabilizaVentas(3);
		System.out.println(c1);
		System.out.printf("El salario de Luis es %.2f\n", c1.calculaSalario());
		
		System.out.println("Luis ha hecho hoy 9 ventas, añadiendolas...");
		c1.contabilizaVentas(9);
		System.out.println(c1);
		
		System.out.println("Luis ha hecho hoy 5 ventas, añadiendolas...");
		c1.contabilizaVentas(5);
		System.out.println(c1);
		
		System.out.println("Luis ha hecho hoy 7 ventas, añadiendolas...");
		c1.contabilizaVentas(7);
		System.out.println(c1);
		
		System.out.println("Luis ha hecho hoy 6 ventas, añadiendolas...");
		c1.contabilizaVentas(6);
		System.out.println(c1);
		System.out.printf("El salario de Luis es %.2f\n", c1.calculaSalario());

		System.out.println("Balck friday: Comision hoy a 100 €");
		Comercial.setImporteVentas(100);
	
		Comercial c2 = new Comercial("Marta", "Fernandez", 44,1900, 1,4);
		System.out.printf("El salario de MArta es %.2f\n", c2.calculaSalario());

		System.out.printf("El salario de Luis es %.2f\n", c1.calculaSalario());
		
		c1.resetearContador();
		c2.resetearContador();
		
		System.out.println("Empieza un nuevo mes. A vender!");
		System.out.println(c1);
		System.out.println(c2);

	}

}
