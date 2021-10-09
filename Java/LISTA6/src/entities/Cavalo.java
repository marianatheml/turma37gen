package entities;

public class Cavalo extends Animal {

	public Cavalo(String nome, String idade) {
		super(nome, idade);

	}
	
	@Override
	public String emitirSom() {
		return "hinn in in";
	}
	

	
	
}
