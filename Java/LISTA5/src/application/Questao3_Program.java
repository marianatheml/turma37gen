package application;
import java.util.Scanner;
import entities.Questao3_Electronic;

public class Questao3_Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		Questao3_Electronic elec = new Questao3_Electronic();
		
		System.out.print("Digite o tipo de produto: ");
		elec.tipo = sc.nextLine();
		System.out.print("Digite a marca: ");
		elec.marca = sc.nextLine();
		System.out.print("Digite o modelo: ");
		elec.modelo = sc.nextLine();
		System.out.print("Digite o valor: ");
		elec.valor = sc.nextInt();
		
		System.out.println("\nRESUMO\n"+elec.toString());
		
		
	}
}
