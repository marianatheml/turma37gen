package entities;

public class ContaCorrente extends Conta{
	
	private int contadorTalao;

	public ContaCorrente() {
	}

	public ContaCorrente(int numero, String cpf) {
		super(numero, cpf);
	
	}

	public int getContadorTalao() {
		return contadorTalao;
	}

	public void setContadorTalao(int contadorTalao) {
		this.contadorTalao = contadorTalao;
	}
	
	public void pediTalao(int contadorTalao) {
		saldo-=(30*contadorTalao);
	}

	@Override
	public String toString() {
		return "\nCONTA CORRENTE\n"
								+ "N�mero da conta: " + super.getNumero() 
								+ "\nCPF: " + super.getCpf() 
								+ "\nValor dispon�vel: " + saldo 
								+ "\nA Quantidade de tal�es adquiridos: " + contadorTalao;
	}
		
	
	
	
	



}
