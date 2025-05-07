package modelo;

import java.util.HashSet;

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
		
		if(listaElectrodomesticos.isEmpty()) {
			return null;
		}
		String resultado = "DATOS DE LOS ELECTRODOMESTICOS \n";
		int contador = 1;
		for (Electrodomestico electrodomestico : listaElectrodomesticos) {
			resultado += "Electrodomestico " + contador + ":" + electrodomestico.toString() + "\n";
		}
		return resultado;
	}

}
