package application;

import java.util.Scanner;
import entities.Questao4_Funcionario;

public class Questoa4_Program {
	public static void main(String[] args) {
		Questao4_Funcionario fun = new Questao4_Funcionario();
		Scanner sc = new Scanner(System.in);
		
		String opEntrada="", opSaida="";

		System.out.println("RESGITRO DI�RIO DO FUNCION�RIO");
		
		System.out.print("Digite c�digo de registro: ");
        fun.codigo = sc.nextLine();
        System.out.print("Digite o seu nome: ");
        fun.nome = sc.nextLine();
        
		System.out.print(fun.toString());
		
		do{ 
			System.out.print("\nREGRISTRAR PONTO - ENTRADA (S/N): ");
			opEntrada = sc.next().toUpperCase();
			if (opEntrada.equals("S")) {
				System.out.print(fun.toString());
				System.out.print("\n\nENTRADA: \t\tREGISTRADO");
				System.out.print("\nSA�DA:");
			}
		} while (opEntrada.equals("N"));
		
		do {
			System.out.print("\nREGITRAR PONTO - SA�DA (S/N): ");
			opSaida = sc.next().toUpperCase();
			if (opSaida.equals("S")) {
			System.out.print(fun.toString());
			System.out.print("\n\nENTRADA: \t\tREGISTRADO");
			System.out.print("\nSA�DA: \t\t\tREGISTRADO");
			} 
		} while (opSaida.equals("N"));

		sc.close();
	}
}

