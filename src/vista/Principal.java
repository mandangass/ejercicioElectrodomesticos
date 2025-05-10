package vista;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  Scanner sc = new Scanner(System.in);
	        boolean salir = false;
	        int opcion;
	         
	        while(!salir){
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
	                   
	            switch(opcion){
	                case 1:
	                    System.out.println("Has seleccionado la opcion 1");
	                    break;
	                case 2:
	                    System.out.println("Has seleccionado la opcion 2");
	                    break;
	                case 3:
	                    System.out.println("Has seleccionado la opcion 3");
	                    break;
	                case 4:
	                	System.out.println("Has seleccionado la opcion 4");
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
	                	salir=true;
	                	break;
	                default:
	                    System.out.println("Opción incorrecta");
	            }  
	        }
		
	}

}
