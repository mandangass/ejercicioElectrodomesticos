package modelo;

public class Televisor extends Electrodomestico{

	//ATRIBUTO PROPIO
	private int tamanio;

	public Televisor(String codigo, String marca, String modelo, double precioBase, char etiquetaEnergetica,
			int tamanio) {
		super(codigo, marca, modelo, precioBase, etiquetaEnergetica);
		this.tamanio = tamanio;
	}

	public Televisor(String codigo, String marca, String modelo, double precioBase, int tamanio) {
		super(codigo, marca, modelo, precioBase);
		this.tamanio = tamanio;
	}

	@Override
	public String toString() {
		return "Televisor [tamanio=" + tamanio + ", getCodigo()=" + getCodigo() + ", getMarca()=" + getMarca()
				+ ", getModelo()=" + getModelo() + ", getPrecioBase()=" + getPrecioBase() + ", getEtiquetaEnergetica()="
				+ getEtiquetaEnergetica() + ", toString()=" + super.toString() + ", hashCode()=" + hashCode()
				+ ", precioFinal()=" + precioFinal() + ", getClass()=" + getClass() + "]";
	}

	public Televisor(String codigo, String marca, String modelo, double precioBase) {
		super(codigo, marca, modelo, precioBase);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double precioFinal() {
		// TODO Auto-generated method stub
		double precioFinal=super.precioFinal();
		if(tamanio>=50) {
			precioFinal+=100;
		}
		return precioFinal;
	}
	
	
	
}
