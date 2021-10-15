package entities;

public class Clt {
	
	private String nome;
	private String matricula;
	private int horasTrabalhadas;
	private double valorHora;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public int getHorasTrabalhadas() {
		return horasTrabalhadas;
	}
	public void setHorasTrabalhadas(int horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}
	public double getValorHora() {
		return valorHora;
	}
	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}
	
	public Clt(String nome, String matricula, int horasTrabalhadas, double valorHora) {
		super();
		this.nome = nome;
		this.matricula = matricula;
		this.horasTrabalhadas = horasTrabalhadas;
		this.valorHora = valorHora;
	}

	public double salario () {
		return horasTrabalhadas*valorHora;
	}
	
	@Override
	public String toString() {
		return "Nome do funcionário: " + nome + "\nMatricula:" + matricula;
	}
	

	
}
