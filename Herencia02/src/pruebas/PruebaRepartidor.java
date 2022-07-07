package pruebas;

import modelo.Comercial;
import modelo.Empleado;
import modelo.Repartidor;

public class PruebaRepartidor {

	public static void main(String[] args) {

		Repartidor rep = new Repartidor("Antonio", "Sánchez", 35, 1700, 
				"Andalucía", "1111-AAA");
		
		
		
		rep.setAntiguedad(16);
		System.out.println("El repartidor es: "+rep);
		
		System.out.println("El salario del empleado es "+rep.calculaSalario());
		
		System.out.println("El cuentakm hoy esta en 630");
		rep.actualizaKms(630);
		System.out.println("El repartidor es: "+rep);
		
		System.out.println("Introduciendo km incorrectos..");
		rep.actualizaKms(250);
		System.out.println("El repartidor es: "+rep);
		
		System.out.println("Añadiendo dietas... Una de de 22 euros");
		rep.añadirDieta(22);
		
		System.out.println("Añadiendo dietas... Una de de 16 euros");
		rep.añadirDieta(16);
		
		System.out.println("Añadiendo dietas... Una de de 104 euros");
		rep.añadirDieta(104);
		System.out.println("El repartidor es: "+rep);
		System.out.println("El salario del empleado es "+rep.calculaSalario());

		System.out.println("Comienzo de otro mes. REinciando dietas...");
		rep.reiniciarDietas();
		System.out.println("El repartidor es: "+rep);
		System.out.println("reiniciando km...");
		rep.reiniciarKm();
		System.out.println("El repartidor es: "+rep);
		
		Empleado e = new Comercial("Sonia", "Mendez", 34, 2000, 4, 7);	
		
		System.out.println("Los trienios de Sonia son "+e.calculaTrienios());
		
		//Comercial c2 = new Empleado("Luis", "FErnandez", 28, 1300);
		System.out.println("Añadiendo ventas a Sonia");
		Comercial temp = (Comercial) e;
		temp.contabilizaVentas(5);
		
		System.out.println("El salario de Sonia es"+e.calculaSalario());
		
		
		Empleado lista [] = new Empleado[5];
		
		lista[0] = new Empleado("Luis", "lopez", 45, 1400, 2);
		lista[1] = new Comercial("ana", "martinez", 33, 1650, 7, 6);
		lista[2] = new Comercial("Juan", "Gómez", 36, 1800, 4, 3);
		lista[3] = new Repartidor("Pedro", "Marin", 55, 1970, 17, "Extremadura", 
				                  "1111-ABC", 63540,68730,125);
		lista[4] = new Repartidor("Julia", "Martínez", 61, 2050, 24, "Murcia", 
				                  "2222-zzz", 122584,126312,89);
		System.out.println("Lista de empleados");
		
		double totalSalarios=0;
		for (int i=0; i<5; i++) {
			System.out.println(lista[i]);
			totalSalarios=totalSalarios+lista[i].calculaSalario();
		}
		
		System.out.println("La empresa gasta "+totalSalarios + "en salarios");
		
		
		// Calculo del total de km en un mes
		double totalKms=0;
		for(int i=0; i<5; i++) {
			if (lista[i] instanceof Repartidor) {
				Repartidor aux = (Repartidor) lista[i];
				totalKms=totalKms+aux.getKmFinales() -
						aux.getKmInicioMes();
			}
		}
		
		System.out.println("Se han recorrido este mes "+totalKms+ " Kms");
		
		
		
		
		
		
		
		
		
	}

}
