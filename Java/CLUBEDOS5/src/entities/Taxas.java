package entities;

public class Taxas {
	
	public double imposto (double valor) {
		return valor*0.09; //Imposto = 9% do valor
	}
	
	public double aVista (double valor) {
		return valor*0.90; //A vista  = Diminui 10% do valor
	}
	
	public double cartao (double valor) {
		return valor*1.10; //Cartão = Aumenta 10% do valor
	}
	
	public double parcelado (double valor) {
		return (valor*1.15); //Parcelado = Aumenta 15% do valor
	}
	

}
