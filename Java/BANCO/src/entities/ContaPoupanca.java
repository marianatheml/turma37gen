package entities;

public class ContaPoupanca extends Conta{
	
	private int diaAniversarioPoupanca;

	public ContaPoupanca() {
	}

	public ContaPoupanca(int numero, String cpf, int diaAniversarioPoupanca) {
		super(numero, cpf);
		this.diaAniversarioPoupanca = diaAniversarioPoupanca;
	}

	public int getDiaAniversarioPoupanca() {
		return diaAniversarioPoupanca;
	}

	public void setDiaAniversarioPoupanca(int diaAniversarioPoupanca) {
		this.diaAniversarioPoupanca = diaAniversarioPoupanca;
	}
	
	public void correcao () {
		int resultado =  2021-diaAniversarioPoupanca ;
		
		if(resultado>1) {
		saldo+=((saldo*1.05)-saldo);
		}
	}	
	
	@Override
	public String toString() {
		return "\nCONTA POUPANÇA\n"
								+ "Número da conta: " + super.getNumero() 
								+ "\nCPF: " + super.getCpf() 
								+ "\nValor disponível: " + saldo 
								+ "\nA conta possui " + (2021-diaAniversarioPoupanca) + " anos.";
	}

}
