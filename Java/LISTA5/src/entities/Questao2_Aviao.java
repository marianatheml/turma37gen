package entities;

public class Questao2_Aviao {
	
	//atributos
		private String piloto;
		private String modelo;
		private double velocidade;
		private boolean ligado = false;
		
		//construtor
		public Questao2_Aviao(String piloto, String modelo) {
			super();
			this.piloto = piloto;
			this.modelo = modelo;
		}
		
		//Emcapsulamento
		public String getPiloto() {
			return piloto;
		}

		public void setPiloto(String piloto) {
			this.piloto = piloto;
		}

		public String getModelo() {
			return modelo;
		}

		public void setModelo(String modelo) {
			this.modelo = modelo;
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
		
		public String toString() {
	        return "AVIÃO LOCALIZADO\nPILOTO: "+this.piloto+"\nMODELO: "+this.modelo+"\n";
	    }
		
		public void ligar() {
			this.ligado = true;
			System.out.println("MOTORES LIGADOS, INICIAR DECOLAGEM.");
		}
		
		public void pousar() {
			System.out.println("SENHORES PASSAGEIROS, ESTAMOS INICIANDO O POUSO.\nAJUSTEM SEUS ACENTOS E COLOQUEM OS CINTOS.");
		}
		public void desligar() {
				System.out.println("AVIÃO DESLIGADO.");
		}
		
		public void acelerar() {
			double velocidadeNova = this.velocidade+100;
			this.velocidade = velocidadeNova;
			System.out.println("AUMENTANDO VELOCIDADE - "+this.velocidade+"KM/H");
		}	
		public void desacelerar() {
			double velocidadeNova = this.velocidade-100;
			this.velocidade = velocidadeNova;
			System.out.println("REDUZINDO VELOCIDADE - "+this.velocidade+"KM/H");
		}
		
		
		
		

}
