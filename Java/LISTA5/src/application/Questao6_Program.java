package application;
import entities.Questao6_Dados;
import java.util.Scanner;

public class Questao6_Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Questao6_Dados dado = new Questao6_Dados();
		
		int opUsuarioTipo;
		char opUsuarioAcao;
		
		System.out.print("Digite o nome: ");
		dado.Nome = sc.nextLine();
		System.out.print("Digite o agencia: ");
		dado.Agencia = sc.next();
		System.out.print("Digite o cpf: ");
		dado.Cpf = sc.next();
		System.out.println("Digite o tipo de conta: [1] - Poupança [2] - Conta Corrente ");
		opUsuarioTipo= sc.nextInt();
		if(opUsuarioTipo == 1) {
			dado.Tipo = "Poupança";
		} else {
			dado.Tipo = "Conta Corrente";
		}
				
		System.out.println("\n\n\n\n\n\n\t  EXTRATO SIMPLE\n-----------------------------------");
		System.out.print(dado.toString());
		
		System.out.println("\n\n"+dado.Nome+", deseja realizar saque? S/N");
		opUsuarioAcao=sc.next().toUpperCase().charAt(0);

		if (opUsuarioAcao == 'S') {
			System.out.println("Digite o valor que deseja sacar: ");
			double saque = sc.nextDouble();
			dado.realizarSaque(saque);
			System.out.println("\n\n\n\n\n\n    EXTRATO SIMPLE ATUALIZADO\n-----------------------------------");
			System.out.print(dado.toString());
			
		} else if (opUsuarioAcao == 'N') {
			System.out.println("\n\n\n\n\n\n\n\n\n\n\nObrigada e volte sempre!");
		}

		
	}
}
