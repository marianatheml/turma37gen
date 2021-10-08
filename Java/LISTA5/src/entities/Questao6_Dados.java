package entities;

public class Questao6_Dados {

	public String Nome;
	public String Agencia;
	public String Cpf;
	public String Tipo;
	public double Saldo=5000.00;
	public boolean Ativa;
	
	public double realizarSaque(double Saque) {
		return Saldo-=Saque;
	}
	 public String toString() {
	        return "AGENCIA: \t\t"+Agencia+"\nTIPO: \t\t\t"+Tipo+"\n\nNOME: \t\t\t"+Nome+"\nCPF: \t\t\t"+Cpf+"\nSALDO ATUAL: \t\t"+Saldo;
	        
	    }

	
}
