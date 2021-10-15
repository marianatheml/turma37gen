package entities;

public class Product {
	public String codigo;
	public String nome;
	public int estoque=0;
	public double valor;
	
	public int addEstoque(int qtde) {
		return estoque+=qtde;
	}
	
	public int tirarEstoque(int qtde) {
		if (estoque<0) {
			return estoque=0;
		}else {
			return estoque-=qtde;
		}
    }
	   public String toString() {
	        return "CÓDIGO\t\tPRODUTO\t\tVALOR\t\tQTDE\n"+codigo+"\t\t"+nome+"\t"+valor+"\t\t"+estoque;
	    }
	

}
