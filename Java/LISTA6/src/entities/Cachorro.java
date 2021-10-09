package entities;

public class Cachorro extends Animal {

	public Cachorro(String nome, String idade) {
		super(nome, idade);

	}
	
	@Override
	public String emitirSom() {
		return "au au au";
	}	

}
