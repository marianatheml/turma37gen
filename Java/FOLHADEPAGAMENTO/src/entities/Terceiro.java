package entities;

public class Terceiro extends Clt {
	
	private double adicional;

	public double getAdicional() {
		return adicional;
	}

	public void setAdicional(double adicional) {
		this.adicional = adicional;
	}

	public Terceiro(String nome, String matricula, int horasTrabalhadas, double valorHora, double adicional) {
		super(nome, matricula, horasTrabalhadas, valorHora);
		this.adicional = adicional;
	}
	@Override
	public double salario () {
		return super.salario()+adicional;
	}	

}
