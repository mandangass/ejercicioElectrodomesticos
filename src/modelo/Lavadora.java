package modelo;

public class  Lavadora extends Electrodomestico{
	// Atributo privado propio
	private int carga;

	public Lavadora(String codigo, String marca, String modelo, double precioBase, char etiquetaEnergetica, int carga) {
		super(codigo, marca, modelo, precioBase, etiquetaEnergetica);
		this.carga = carga;
	}

	public Lavadora(String codigo, String marca, String modelo, double precioBase, int carga) {
		super(codigo, marca, modelo, precioBase);
		this.carga = carga;
	}


	public int getCarga() {
		return carga;
	}
	

	@Override
	public String toString() {
		return "Lavadora [carga=" + carga + ", getCodigo()=" + getCodigo() + ", getMarca()=" + getMarca()
				+ ", getModelo()=" + getModelo() + ", getPrecioBase()=" + getPrecioBase() + ", getEtiquetaEnergetica()="
				+ getEtiquetaEnergetica() + ", toString()=" + super.toString() + ", hashCode()=" + hashCode()
				+ ", precioFinal()=" + precioFinal() + ", getClass()=" + getClass() + "]";
	}

	@Override
	public double precioFinal() {
		// TODO Auto-generated method stub
		return super.precioFinal()+(carga*2);
	}


	

	
}
