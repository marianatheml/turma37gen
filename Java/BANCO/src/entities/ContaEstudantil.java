package entities;

public class ContaEstudantil extends Conta{
	
	private double limiteEstudante=5000.00;

	public ContaEstudantil() {

	}

	public ContaEstudantil(int numero, String cpf) {
		super(numero, cpf);
	}

	public double getLimiteEstudante() {
		return limiteEstudante;
	}

	public void setLimiteEstudante(double limiteEstudante) {
		this.limiteEstudante = limiteEstudante;
	}
	
	
	public void emprestimo (double emprestimo) {
		this.saldo+=emprestimo;
		this.limiteEstudante-=emprestimo;
	}
	
	@Override
	public String toString() {
		return "\nCONTA ESTUDANTIL\n"
								+ "N�mero da conta: " + super.getNumero() 
								+ "\nCPF: " + super.getCpf() 
								+ "\nValor dispon�vel: " + saldo 
								+ "\nA Limite restante para emprestimo: " + limiteEstudante;
	}

	
	

}
