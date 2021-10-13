package entities;

public class ContaPoupanca extends Conta{
	
	private double diaAniversarioPoupanca;

	public ContaPoupanca(int numero, String cpf, double saldo, boolean ativo) {
		super(numero, cpf, saldo, ativo);

	}

	public double getDiaAniversarioPoupanca() {
		return diaAniversarioPoupanca;
	}

	public void setDiaAniversarioPoupanca(double diaAniversarioPoupanca) {
		this.diaAniversarioPoupanca = diaAniversarioPoupanca;
	}
	//Comparar se a data informada pelo usuario é a mesma data do aniversário,
	//se for corrigir o valor em 0,05%  saldo = (saldo * 0.05)+saldo
	
	@Override
	public double getSaldo() {
		return super.getSaldo()*1.05;
	}
	

}
