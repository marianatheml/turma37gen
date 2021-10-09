package entities;

public class Preguica extends Animal {

	public Preguica(String nome, String idade) {
		super(nome, idade);
	}
	
	@Override
	public String emitirSom() {
		return "zzzzzzzzz";
	}
	
	@Override
	public String habilidade () {
		return "subindo em árvore";
	}
	
	
}
