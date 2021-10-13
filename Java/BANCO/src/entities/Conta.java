package entities;

public abstract class Conta {
	
	private int numero;
	private String cpf;
	private double saldo=0.0;
	private boolean ativo;
	
	public Conta(int numero, String cpf, double saldo, boolean ativo) {
		super();
		this.numero = numero;
		this.cpf = cpf;
		this.saldo = saldo;
		this.ativo = ativo;
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
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public boolean isAtivo() {
		return ativo;
	}
	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

	public void ativarContra(){
		ativo = true;
		System.out.println("A conta está ativa.");
	}
	
	public void debito(double valor){
		saldo-=valor;
		System.out.print("\nFoi realizado um debito de: "+valor+"\nSeu novo saldo é: "+saldo);
	}
	
	public void credito(double valor) {
		saldo+=valor;
		System.out.print("\nFoi realizado um credito de: "+valor+"\nSeu novo saldo é: "+saldo);
	}
	

}
