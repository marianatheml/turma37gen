package entities;

public class Taxas {
	
	public double imposto (double valor) {
		return valor*0.09;
	}
	
	public double aVista (double valor) {
		return valor*0.90;
	}
	
	public double cartao (double valor) {
		return valor*1.10;
	}
	
	public double parcelado (double valor) {
		return (valor*1.15)/2;
	}

}
