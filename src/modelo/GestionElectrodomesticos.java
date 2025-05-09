package modelo;

import java.util.HashSet;
import java.util.Iterator;

public class GestionElectrodomesticos {

	private HashSet<Electrodomestico> listaElectrodomesticos;

	public GestionElectrodomesticos() {
		listaElectrodomesticos = new HashSet<>();
	}

	public int addLavadora(Lavadora lavadora) {
		listaElectrodomesticos.add(lavadora);
		return listaElectrodomesticos.size();
	}

	public int addTelevisor(Televisor televisor) {
		listaElectrodomesticos.add(televisor);
		return listaElectrodomesticos.size();
	}

	public String mostrar() {

		if (listaElectrodomesticos.isEmpty()) {
			return null;
		}
		String resultado = "DATOS DE LOS ELECTRODOMESTICOS \n";
		int contador = 1;
		for (Electrodomestico electrodomestico : listaElectrodomesticos) {
			resultado += "Electrodomestico " + contador + ":" + electrodomestico.toString() + "\n";
		}
		return resultado;
	}

	public int incrementoPrecio(String marca, double cantIncremento) {
		int contador = 0;
		for (Electrodomestico electrodomestico : listaElectrodomesticos) {
			if (electrodomestico.getMarca().equalsIgnoreCase(marca)) {
				electrodomestico.incrementarPrecio(cantIncremento);
				contador++;
			}
		}
		return contador;
	}

	public double precioMedio() {
		double sumaPrecio = 0;
		for (Electrodomestico electrodomestico : listaElectrodomesticos) {
			sumaPrecio += electrodomestico.precioFinal();

		}
		return sumaPrecio / listaElectrodomesticos.size();
	}

	public String bajoMedia() {
		String resultado = "Electrodomestico: ";
		int contador = 1;
		for (Electrodomestico electrodomestico : listaElectrodomesticos) {
			if (electrodomestico.precioFinal() < precioMedio()) {
				resultado += contador + electrodomestico.getMarca() + electrodomestico.getModelo()
						+ electrodomestico.precioFinal();
				contador++;
			}
		}
		return resultado;
	}

	public boolean eliminarElectrodomestico(String codigo) {
		Iterator<Electrodomestico> iterator = listaElectrodomesticos.iterator();
		while (iterator.hasNext()) {
			Electrodomestico electrodomestico = iterator.next();
			if (electrodomestico.getCodigo().equals(codigo)) {
				iterator.remove();
				return true;

			}
		}
		return false;
	}

}
