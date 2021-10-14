package application;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

import entities.Conta;
import entities.ContaCorrente;
import entities.ContaPoupanca;

public class C5Bank {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List<Conta> list = new ArrayList<>();
		
		ContaPoupanca poupanca = new ContaPoupanca();
		ContaCorrente corrente = new ContaCorrente();
	
		
		double valor;
		int opConta;


		
		//do {
			System.out.print("\nTIPOS DE CONTA\n[1] - Conta Poupança\n[2] - Conta Corrente\n[3] - Conta Especial\n[4] - Conta Empresarial\n[5] - Conta Estundantil\nDigite qual é a sua conta: ");
			opConta = sc.nextInt();
			limpa();
			
			if (opConta == 1) {
				nome();
				System.out.print("ÁREA DE ACESSO DO CLIENTE\n");
				System.out.print("Digite o número da conta: ");
				int numero = sc.nextInt();
				System.out.print("Digite o deu CPF: ");
				String cpf = sc.next();
				System.out.print("Digite o ano de criação da conta: ");
				int dataCriacao = sc.nextInt();

				Conta conta = new ContaPoupanca(numero, cpf, dataCriacao);
				list.add(conta);
				
				for(int i=1;i<=2;i++) {
					System.out.println("\nMovimentação "+i);
					System.out.print("Você deseja [D] - Débito ou [C] - Crédito: ");
					char opMovim = sc.next().toUpperCase().charAt(0);
					while (true) {
						if (opMovim == 'D' && conta.getSaldo() == 0) {
							System.out.print("Seu saldo é insuficiente.");
							System.out.print("Você deseja efetuar [C] - Crédito: ");
							opMovim = sc.next().toUpperCase().charAt(0);
						} else {
							break;
						}
					}
					
					if (opMovim == 'D') {
						System.out.print("Digite o valor que deseja sacar: R$ ");
						valor = sc.nextDouble();
						while (true) {
							if (valor >= conta.getSaldo()) {
								System.out.println("\nSeu saldo é insuficiente.");
								System.out.print("Digite um valor menor que R$"+conta.getSaldo()+": R$ ");
								valor = sc.nextDouble();
							} else {
								break;
							}	
						}
						
						conta.debito(valor);
						if (poupanca.diaAniversarioPoupanca()>1) {
							limpa();
							nome();
							System.out.print("Número da conta: " + conta.getNumero() + "\nCPF: " + conta.getCpf() + "\nValor disponível: " + (conta.getSaldo()*1.05));
							
						} else {
							limpa();
							nome();
							System.out.print("Número da conta: " + conta.getNumero() + "\nCPF: " + conta.getCpf() + "\nValor disponível: " + conta.getSaldo());
							
						}
						
					} else if (opMovim == 'C') {
						System.out.print("Digite o valor que deseja depositar: R$ ");
						valor = sc.nextDouble();
						
						conta.credito(valor);
						if (poupanca.diaAniversarioPoupanca()>1) {
							limpa();
							nome();
							System.out.print("Número da conta: " + conta.getNumero() + "\nCPF: " + conta.getCpf() + "\nValor disponível: " + (conta.getSaldo()*1.05));
						} else {
							limpa();
							nome();
							System.out.println("Número da conta: " + conta.getNumero() + "\nCPF: " + conta.getCpf() + "\nValor disponível: " + conta.getSaldo());
							
						}
						
					}								
				}
				
			} else if (opConta == 2) {
				nome();
				System.out.print("ÁREA DE ACESSO DO CLIENTE\n");
				System.out.print("Digite o número da conta: ");
				int numero = sc.nextInt();
				System.out.print("Digite o deu CPF: ");
				String cpf = sc.next();

				Conta conta = new ContaCorrente(numero, cpf);
				list.add(conta);
				
				
				for(int i=1;i<=2;i++) {
					System.out.println("\nMovimentação "+i);
					System.out.print("Você deseja [D] - Débito ou [C] - Crédito: ");
					char opMovim = sc.next().toUpperCase().charAt(0);
					while (true) {
						if (opMovim == 'D' && conta.getSaldo() == 0) {
							System.out.print("Seu saldo é insuficiente.");
							System.out.print("Você deseja efetuar [C] - Crédito: ");
							opMovim = sc.next().toUpperCase().charAt(0);
						} else {
							break;
						}
					}
					
					if (opMovim == 'D') {
						System.out.print("Digite o valor que deseja sacar: R$ ");
						valor = sc.nextDouble();
						while (true) {
							if (valor >= conta.getSaldo()) {
								System.out.println("\nSeu saldo é insuficiente.");
								System.out.print("Digite um valor menor que R$"+conta.getSaldo()+": R$ ");
								valor = sc.nextDouble();
							} else {
								break;
							}	
						}
						
						conta.debito(valor);
						
						limpa();
						nome();
						System.out.print("Número da conta: " + conta.getNumero() + "\nCPF: " + conta.getCpf() + "\nValor disponível: " + conta.getSaldo());
							
						
					} else if (opMovim == 'C') {
						System.out.print("Digite o valor que deseja depositar: R$ ");
						valor = sc.nextDouble();
						
						conta.credito(valor);
						
							limpa();
							nome();
							System.out.print("Número da conta: " + conta.getNumero() + "\nCPF: " + conta.getCpf() + "\nValor disponível: " + conta.getSaldo());						
					}
					
					System.out.println("Você deseja um talão cheque [S] - sim ou [N] - não: ");
					char opTalao = sc.next().toUpperCase().charAt(0);
					
					if (opTalao == 'S') {
						
						
					} else if (opTalao == 'N') {
						
					}
				}
			} else	{
					
				
			}
						
			
		//} while (opConta<1 || opConta>5);		
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
