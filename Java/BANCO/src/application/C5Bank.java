package application;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

import entities.Conta;
import entities.ContaPoupanca;

public class C5Bank {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List<Conta> list = new ArrayList<>();
		
		int opConta;
		String tipoConta;
		
		nome();
		System.out.print("ÁREA DE ACESSO DO CLIENTE\n");
		System.out.print("Digite o número da conta: ");
		int numero = sc.nextInt();
		System.out.print("Digite o deu CPF: ");
		String cpf = sc.next();
		do {
			System.out.print("\nTIPOS DE CONTA\n[1] - Conta Poupança\n[2] - Conta Corrente\n[3] - Conta Especial\n[4] - Conta Empresarial\n[5] - Conta Estundantil\nDigite qual é a sua conta: ");
			opConta = sc.nextInt();
			limpa();
			
			if (opConta == 1) {
				nome();
				System.out.println("\nCONTA POUPANÇA");				
				
			} else if (opConta == 2) {
				nome();
				System.out.println("\nCONTA CORRENTE");
				
			}else if (opConta == 3) {
				nome();
				System.out.println("\nCONTA ESPECIAL");
				
			}else if (opConta == 4) {
				nome();
				System.out.println("\nCONTA EMPRESARIAL");
				
			}else if (opConta == 5) {
				nome();
				System.out.println("\nCONTA ESTUNDANTIL");
			}
		} while (opConta<1 || opConta>5);
		
		
		sc.close();
		
	}
	
	public static void limpa() {
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
	}
	public static void nome() {
		
		System.out.println("C5 BANK\t      * * * * *");
		System.out.print("FAÇA PARTE DESSE CLUBE!\n");
		System.out.println("-----------------------");
	}

}
