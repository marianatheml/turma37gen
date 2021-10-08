package entities;

public class Questao1_Cliente {
	public String Nome;
	public String Cidade;
	public String Estado;
    public int Idade;
    public String Email;
    public char Pronome;
    
   
    public String toString() {
        return "NOME: "+Nome+ "\nE-MAIL: "+Email+"\nIDADE: "+Idade+"\t\tES: "+Estado;
    }

}
