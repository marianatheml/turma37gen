package entities;

public class Car {
	
	//atributos
	private String placa;
	private String modelo;
	private String fabricante;
	private int anoFabricacao;
	private int marcha;
	private double velocidade;
	private boolean ligado=false;
	
	//construtor - Source>Generate Constructor Using Fields...>Select>Generate
	public Car(String placa, String modelo, String fabricante) {
		super();
		this.placa = placa;
		this.modelo = modelo;
		this.fabricante = fabricante;
	}
	
	//Emcapsulamento/Segurança de dados - Source>Generate Getters and Setters...>Select>Generate
	
	
	public Car() {
		super();
	}


	public String getPlaca() {
		return placa;
	}


	public void setPlaca(String placa) {
		this.placa = placa;
	}


	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	public String getFabricante() {
		return fabricante;
	}


	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}


	public int getAnoFabricacao() {
		return anoFabricacao;
	}


	public void setAnoFabricacao(int anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}


	public int getMarcha() {
		return marcha;
	}


	public void setMarcha(int marcha) {
		this.marcha = marcha;
	}


	public double getVelocidade() {
		return velocidade;
	}


	public void setVelocidade(double velocidade) {
		this.velocidade = velocidade;
	}


	public boolean isLigado() {
		return ligado;
	}


	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}
	
	public void ligarCarro() {

		this.ligado = true;
	}

	
	public void desligarCarro() {
		this.ligado = false;
		System.out.println("Carro desligado.");
	}
	
	public void subirMarcha() {
		if (this.ligado=true && this.marcha <= 5) {
			this.marcha++;
			System.out.println("MARCHA - "+this.marcha);
		} else if (this.ligado=false) {
			System.out.println("Carro desligado.");
		}
	}

	public void desderMarcha() {
		if (this.ligado=true && this.marcha>0) {
			this.marcha--;
			System.out.println("MARCHA - "+this.marcha);
		} else if (this.ligado=false) {
			System.out.println("Carro desligado.");
		}
	}
		
	public void acelerar() {
		
		if (this.ligado = true) {
			double velocidadeNova = this.velocidade+10;
			this.velocidade = velocidadeNova;
			System.out.println("VELOCIDADE - "+this.velocidade);
		} else if (this.ligado = false) {
			System.out.println("Carro desligado.");
		}
		
	}
	
	public void reduzir() {
		double velocidadeNova = this.velocidade-10;
		this.velocidade = velocidadeNova;
		System.out.println("VELOCIDADE - "+this.velocidade);
	}
	
	public void frear() {
		if (this.velocidade>0) {
				this.velocidade-=10;
				System.out.println("Freando...");
			} else if (this.velocidade == 0) {
				System.out.println("Carro parado.");
			}
		}
	public String toString() {
        return "CARRO LOCALIZADO\nPLACA: "+this.placa+"\nMODELO: "+this.modelo+"\nFABRICANTE: "+this.fabricante;
    }

	
}
