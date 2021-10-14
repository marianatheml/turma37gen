package entities;

public class ContaEspecial extends Conta{

	private double limite = 1000.0;

	public ContaEspecial() {

	}

	public ContaEspecial(int numero, String cpf) {
		super(numero, cpf);

	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
	public void usarLimite (double valor) {
		limite = limite - (valor - this.saldo);
		this.saldo = 0;
	}
	
	@Override
	public String toString() {
		return "ContaEspecial"
							+ "Número da Conta: " + super.getNumero() 
							+ "\nCPF: " + super.getCpf() 
							+ "\nValor Disponível: " + saldo 
							+ "\nLimite de Crédito Restante: "+ limite;
	}
	
	
	
}
