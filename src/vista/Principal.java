package vista;

import java.util.Scanner;

import modelo.Electrodomestico;
import modelo.GestionElectrodomesticos;
import modelo.Lavadora;
import modelo.Televisor;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		GestionElectrodomesticos gestor = new GestionElectrodomesticos();
		boolean salir = false;
		int opcion;
		int numeroElectrodomesticos = 0;
		while (!salir) {
			System.out.println("1. añadir lavadora");
			System.out.println("2. añadir televisor");
			System.out.println("3. mostrar electrodomesticos");
			System.out.println("3. incrementar precio");
			System.out.println("3. mostrar precio medio");
			System.out.println("3. electrodomesticos bajo media");
			System.out.println("3. eliminar electrodomestico");
			System.out.println("3. mostra marcas");
			System.out.println("3. eliminar por marca");
			System.out.println("3. hay lavadoras");
			System.out.println("4. Salir");

			System.out.println("Escribe una de las opciones");
			opcion = sc.nextInt();

			switch (opcion) {
			case 1:

				System.out.println("Has seleccionado la opcion 1");
				System.out.println("introducir codigo");
				String codigo = sc.nextLine();
				System.out.println("introducir marca");
				String marca = sc.nextLine();
				System.out.println("introducir modelo");
				String modelo = sc.nextLine();
				System.out.println("introducir precioBase");
				double precio = sc.nextDouble();
				System.out.println("introducir carga");
				int carga = sc.nextInt();
				Lavadora lavadora = new Lavadora(codigo, marca, modelo, precio, carga);
				numeroElectrodomesticos = gestor.addLavadora(lavadora);
				System.out.println("el numero de electrodomesticos es: " + numeroElectrodomesticos);
				break;
				
			case 2:
				System.out.println("Has seleccionado la opcion 2");
				System.out.println("introducir codigo");
				codigo = sc.nextLine();
				System.out.println("introducir marca");
				marca = sc.nextLine();
				System.out.println("introducir modelo");
				modelo = sc.nextLine();
				System.out.println("introducir precioBase");
				precio = sc.nextDouble();
				System.out.println("introducir carga");
				int tamanio = sc.nextInt();
				Televisor televisor = new Televisor(codigo, marca, modelo, precio, tamanio);
				numeroElectrodomesticos = gestor.addTelevisor(televisor);
				System.out.println("");
				break;

			case 3:
				System.out.println("Has seleccionado la opcion 3");
				
				System.out.println(gestor.mostrar());
				break;
			case 4:
				System.out.println("Has seleccionado la opcion 4");
				
				System.out.println("marca");
				marca=sc.next();
				System.out.println("precio aumento");
				double precioIncrementeo = sc.nextDouble();
				
				gestor.incrementoPrecio(marca, precioIncrementeo);
				break;
			case 5:
				System.out.println("Has seleccionado la opcion 5");
				break;
			case 6:
				System.out.println("Has seleccionado la opcion 6");
				break;
			case 7:
				System.out.println("Has seleccionado la opcion 7");
				break;
			case 8:
				System.out.println("Has seleccionado la opcion 8");
				break;
			case 9:
				System.out.println("Has seleccionado la opcion 9");
				break;
			case 10:
				System.out.println("Has seleccionado la opcion 10");
				break;
			case 11:
				salir = true;
				break;
			default:
				System.out.println("Opción incorrecta");
			}
		}

	}

}
