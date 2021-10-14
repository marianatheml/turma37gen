package application;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

import entities.Conta;
import entities.ContaCorrente;
import entities.ContaEmpresa;
import entities.ContaEspecial;
import entities.ContaEstudantil;
import entities.ContaPoupanca;

public class C5Bank {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List<Conta> list = new ArrayList<>();
		
		ContaPoupanca poupanca = new ContaPoupanca();
		ContaCorrente corrente = new ContaCorrente();
	
		
		double valor;
		int opConta;


		
		do {
			nome();
			System.out.print("\nTIPOS DE CONTA\n[1] - Conta Poupança\n[2] - Conta Corrente\n[3] - Conta Especial\n[4] - Conta Empresarial\n[5] - Conta Estundantil\nDigite qual é a sua conta: ");
			opConta = sc.nextInt();
			limpa();
			} while (opConta<1 || opConta>5);	
			
		//----------------------------------------------------------POUPANÇA
		
			if (opConta == 1) {
				nome();
				System.out.print("ÁREA DE ACESSO DO CLIENTE\n");
				System.out.print("Digite o número da conta: ");
				int numero = sc.nextInt();
				System.out.print("Digite o deu CPF: ");
				String cpf = sc.next();
				System.out.print("Digite o ano de criação da conta: ");
				int dataCriacao = sc.nextInt();

				ContaPoupanca conta = new ContaPoupanca(numero, cpf, dataCriacao);
				
				for(int i=1;i<=10;i++) {
					limpa();
					System.out.println("\nMOVIMENTAÇÃO "+i);
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
						
						
					} else if (opMovim == 'C') {
						System.out.print("Digite o valor que deseja depositar: R$ ");
						valor = sc.nextDouble();
						
						conta.credito(valor);							
					}
					System.out.print("Gostario de realizar outra transição [S/N]: ");
					char opContinuar = sc.next().toUpperCase().charAt(0);
					if (opContinuar =='N') {
						break;
					}
				}
				
				
				conta.correcao();
				list.add(conta);
				limpa();
				nome();
				System.out.print(conta.toString());	
				
		//----------------------------------------------------------CONTA CORRENTE
				
			}	else if (opConta == 2) {
				nome();
				System.out.print("ÁREA DE ACESSO DO CLIENTE\n");
				System.out.print("Digite o número da conta: ");
				int numero = sc.nextInt();
				System.out.print("Digite o deu CPF: ");
				String cpf = sc.next();


				ContaCorrente conta = new ContaCorrente(numero, cpf);
				
				for(int i=1;i<=10;i++) {
					limpa();
					System.out.println("\nMOVIMENTAÇÃO "+i);
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
						
						
					} else if (opMovim == 'C') {
						System.out.print("Digite o valor que deseja depositar: R$ ");
						valor = sc.nextDouble();
						
						conta.credito(valor);							
					}
					
					System.out.print("Gostario de realizar outra transição [S/N]: ");
					char opContinuar = sc.next().toUpperCase().charAt(0);
					if (opContinuar =='N') {
						break;
					}
				}
				
				System.out.println("Digite quantos talões você deseja emitir [limite de 3 talões]: ");
				int opTalao = sc.nextInt();
				
				while (true) {
					if (opTalao >= 0 && opTalao <= 3) {
						break;
					} else {
						System.out.println("Limite de 3 taloes: ");
						opTalao = sc.nextInt();
					}
				}

				conta.setContadorTalao(opTalao);
				conta.pediTalao(opTalao);
		
				
				list.add(conta);
				
				limpa();
				nome();
				System.out.print(conta.toString());		
				
			//--------------------------------------------------------CONTA ESTUDANTIL	
				
			}	else if (opConta == 5) {
				nome();
				System.out.print("ÁREA DE ACESSO DO CLIENTE\n");
				System.out.print("Digite o número da conta: ");
				int numero = sc.nextInt();
				System.out.print("Digite o deu CPF: ");
				String cpf = sc.next();


				ContaEstudantil conta = new ContaEstudantil(numero, cpf);
				
				for(int i=1;i<=10;i++) {
					limpa();
					System.out.println("\nMOVIMENTAÇÃO "+i);
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
						
						
					} else if (opMovim == 'C') {
						System.out.print("Digite o valor que deseja depositar: R$ ");
						valor = sc.nextDouble();
						
						conta.credito(valor);							
					}
					
					System.out.print("Gostario de realizar outra transição [S/N]: ");
					char opContinuar = sc.next().toUpperCase().charAt(0);
					if (opContinuar =='N') {
						break;
					}
				}
				
				System.out.print("\nDeseja pedir emprestimo [S/N]: ");
				char opEmprestimo = sc.next().toUpperCase().charAt(0);
				
				if (opEmprestimo == 'S') {
					limpa();
					nome();
					System.out.print("Digite o valor do emprestimo [seu limite é R$ 5000,00]: R$");
					double valorEmprestimo = sc.nextDouble();
					if (valorEmprestimo <=5000) {
													
						conta.emprestimo(valorEmprestimo);
						list.add(conta);
							
						limpa();
						nome();
						System.out.print(conta.toString());
							
					} else {
						limpa();
						nome();
						
						System.out.println("\nO valor digitado excede o seu limite de R$ 5.000,00.");
						do {
							System.out.print("Digite o valor do emprestimo [seu limite é R$ 5000,00]: R$");
							valorEmprestimo = sc.nextDouble();
							if (valorEmprestimo <=5000) {
								
								conta.emprestimo(valorEmprestimo);
								list.add(conta);
									
								limpa();
								nome();
								System.out.print(conta.toString());
							}													
						} while (valorEmprestimo >=5000);
					}
				} else if (opEmprestimo == 'N'){
					list.add(conta);
						
					limpa();
					nome();
					System.out.print(conta.toString());						
				}

			//--------------------------------------------------CONTA EMPRESARIAL
				
			}	else if (opConta == 4) {
				nome();
				System.out.print("ÁREA DE ACESSO DO CLIENTE\n");
				System.out.print("Digite o número da conta: ");
				int numero = sc.nextInt();
				System.out.print("Digite o deu CPF: ");
				String cpf = sc.next();


				ContaEmpresa conta = new ContaEmpresa(numero, cpf);
				
				for(int i=1;i<=10;i++) {
					limpa();
					System.out.println("\nMOVIMENTAÇÃO "+i);
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
						
						
					} else if (opMovim == 'C') {
						System.out.print("Digite o valor que deseja depositar: R$ ");
						valor = sc.nextDouble();
						
						conta.credito(valor);							
					}
					
					System.out.print("Gostario de realizar outra transição [S/N]: ");
					char opContinuar = sc.next().toUpperCase().charAt(0);
					if (opContinuar =='N') {
						break;
					}
				}
				limpa();
				nome();
				System.out.print("\nDeseja pedir emprestimo [S/N]: ");
				char opEmprestimo = sc.next().toUpperCase().charAt(0);
				
				if (opEmprestimo == 'S') {
					System.out.print("Digite o valor do emprestimo [seu limite é R$ 10000,00]: R$");
					double valorEmprestimo = sc.nextDouble();
					if (valorEmprestimo <=10000) {
													
						conta.usarLimite(valorEmprestimo);
						list.add(conta);
							
						limpa();
						nome();
						System.out.print(conta.toString());
							
					} else {
						do {
							limpa();
							nome();
							System.out.println("\nO valor digitado excede o seu limite de R$ 10.000,00.");
							System.out.print("Digite o valor do emprestimo [seu limite é R$ 10000,00]: R$");
							valorEmprestimo = sc.nextDouble();
							if (valorEmprestimo <=5000) {
								
								conta.usarLimite(valorEmprestimo);
								list.add(conta);
									
								limpa();
								nome();
								System.out.print(conta.toString());
							}													
						} while (valorEmprestimo >=10000);
					}
				} else if (opEmprestimo == 'N'){
					list.add(conta);
						
					limpa();
					nome();
					System.out.print(conta.toString());						
				}
			// --------------------------------------------------CONTA ESPECIAL
				
			} else if (opConta == 3) {
				
				nome();
				System.out.print("ÁREA DE ACESSO DO CLIENTE\n");
				System.out.print("Digite o número da conta: ");
				int numero = sc.nextInt();
				System.out.print("Digite o deu CPF: ");
				String cpf = sc.next();


				ContaEspecial conta = new ContaEspecial(numero, cpf);
						
				for(int i=1;i<=10;i++) {
					limpa();
					System.out.println("\nMOVIMENTAÇÃO "+i);
					System.out.print("Você deseja [D] - Débito ou [C] - Crédito: ");
					char opMovim = sc.next().toUpperCase().charAt(0);
					
					while (true) {
						if (opMovim == 'D' && conta.getSaldo() == 0) {
							System.out.print("Seu saldo é insuficiente. ");
							System.out.print("Você deseja efetuar [C] - Crédito ou utilizar o [L] - limite: ");
							opMovim = sc.next().toUpperCase().charAt(0);
							
						} else {
							break;
						}
					}
					
					if (opMovim == 'D' || opMovim == 'L') {
						System.out.print("Digite o valor que deseja sacar: R$ ");
						valor = sc.nextDouble();

						while (true) {
							
							if (valor > (conta.getSaldo() + conta.getLimite())) {
								System.out.println("\nSeu saldo é insuficiente.");
								System.out.print("Digite um valor menor que R$"+conta.getSaldo()+" e que esteja dentro do limite atual de R$"+conta.getLimite()+": R$ ");
								valor = sc.nextDouble();
								
							} else {
								break;
							}	
						}
						
						if (valor > conta.getSaldo() && valor <= (conta.getSaldo() + conta.getLimite())) {
							
							conta.usarLimite(valor);
							
						} else {
							
						conta.debito(valor);
						
						}
						
					} else if (opMovim == 'C') {
						System.out.print("Digite o valor que deseja depositar: R$ ");
						valor = sc.nextDouble();
						
						conta.credito(valor);						
						
					}
					
					System.out.print("Gostario de realizar outra transição [S/N]: ");
					char opContinuar = sc.next().toUpperCase().charAt(0);
					if (opContinuar =='N') {
						break;
					} 
				}
				
				limpa();
				nome();
				
				list.add(conta);
						
				limpa();
				nome();
				System.out.print(conta.toString());	
			
			}		
				
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
