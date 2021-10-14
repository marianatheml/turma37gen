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
		if (contadorTalao>=0 || contadorTalao<3) {
			contadorTalao++;
		}else {
			System.out.println("Você excedeu o máximo de solicitações do talão. Contate seu gerente!");
		}
	}

		
	
	
	
	



}
