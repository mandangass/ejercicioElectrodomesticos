package modelo;

import java.util.Objects;

public class Electrodomestico {

	private String codigo, marca, modelo;
	private double precioBase;
	private char etiquetaEnergetica;

	public Electrodomestico(String codigo, String marca, String modelo, double precioBase, char etiquetaEnergetica) {
		this.codigo = codigo;
		this.marca = marca;
		this.modelo = modelo;
		this.precioBase = precioBase;
		this.etiquetaEnergetica = etiquetaEnergetica;
	}

	public Electrodomestico(String codigo, String marca, String modelo, double precioBase) {
		this.codigo = codigo;
		this.marca = marca;
		this.modelo = modelo;
		this.precioBase = precioBase;
		this.etiquetaEnergetica = 'D';
	}

	public String getCodigo() {
		return codigo;
	}

	public String getMarca() {
		return marca;
	}

	public String getModelo() {
		return modelo;
	}

	public double getPrecioBase() {
		return precioBase;
	}

	public char getEtiquetaEnergetica() {
		return etiquetaEnergetica;
	}

	@Override
	public String toString() {
		return "Electrodomestico [codigo=" + codigo + ", marca=" + marca + ", modelo=" + modelo + ", precioBase="
				+ precioBase + ", etiquetaEnergetica=" + etiquetaEnergetica + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(codigo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Electrodomestico other = (Electrodomestico) obj;
		return Objects.equals(codigo, other.codigo);
	}

	public void incrementarPrecio(double dinero) {
		precioBase += dinero;
	}

	public double precioFinal() {
		double porcentajeIncremento = 0;
		switch (etiquetaEnergetica) {
		case 'A':
			porcentajeIncremento = 0.15;
			break;
		case 'B':
			porcentajeIncremento = 0.1;
			break;
		case 'C':
			porcentajeIncremento = 0.07;
			break;
		case 'D':
			porcentajeIncremento = 0.05;
			break;
		}
		return precioBase * (1 + porcentajeIncremento);
	}
}
