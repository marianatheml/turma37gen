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
	
	public int diaAniversarioPoupanca() {
		int resultado = 2021 - diaAniversarioPoupanca;
		return resultado;
	}
	
	/*public double correcao(double correcao) {
		int resultado = 2021 - diaAniversarioPoupanca;
		if (resultado > 1) {
			return correcao = (this.saldo * 0.05) + this.saldo;
		}
		return correcao = (this.saldo * 0.05) + this.saldo;
	}*/
	
	@Override
	public String toString() {
		return "Número da conta: " + super.getNumero() + "\nCPF: " + super.getCpf() + "\nValor disponível: " + saldo;
	}
	
	@Override
	public void debito(double valor){
		saldo-=valor;
	}
	
	@Override
	public void credito(double valor) {
		saldo+=valor;
	}
	

}
