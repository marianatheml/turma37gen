package entities;

public class ContaEmpresa extends Conta{

    private double limiteEmpresa=10000.00;

    public ContaEmpresa() {

    	
	}

	public ContaEmpresa(int numero, String cpf) {
		super(numero, cpf);

	}

	public double getLimite() {
		return limiteEmpresa;
	}

	public void setLimite(double limite) {
		this.limiteEmpresa = limite;
	}
	

	public void usarLimite (double valor) {
            saldo += valor;
            limiteEmpresa -= valor;
    }
	
	@Override
	public String toString() {
		return "\nCONTA EMPRESARIAL\n"
								+ "Número da conta: " + super.getNumero() 
								+ "\nCPF: " + super.getCpf() 
								+ "\nValor disponível: " + saldo 
								+ "\nA Limite restante para emprestimo: " + limiteEmpresa;
	}
}