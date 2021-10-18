package entities;

public class Produto {

	private String nome;
	private String codigo;
	private int estoque=10;
	private double valor;
	private int carrinho;
	private double valorTotal;
	
	public Produto(String codigo, String nome, double valor) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.valor = valor;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public int getEstoque() {
		return estoque;
	}

	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public int getCarrinho() {
		return carrinho;
	}

	public void setCarrinho(int carrinho) {
		this.carrinho = carrinho;
	}
	
	public double getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}
	
	public void adicionarQtde(int qtdeProduto) {
			estoque-=qtdeProduto;
	}
	
	public void valorDaCompra() {
		this.valorTotal = valor*carrinho;
	}
	
	public void retirarEstoque() {
		this.estoque-=this.carrinho;			
}

	public String toString() {
		return " "+codigo + "\t" + nome + "\t\t" + valor + "\t  " + estoque;
	}
	
	
	
	
}