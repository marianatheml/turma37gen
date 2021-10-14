package entities;

public abstract class Conta {
	
	private int numero;
	private String cpf;
	protected double saldo;
	
	public Conta() {
		
	}

	public Conta(int numero, String cpf) {
		this.numero = numero;
		this.cpf = cpf;
	}
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getSaldo() {
		return saldo;
	}
	
	public void debito(double valor){
		this.saldo-=valor;
	
	}
	
	public void credito(double valor) {
		this.saldo+=valor;
	}
	
	
}
