package condicional;

import java.util.Scanner;

public class ExemploSe {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in); 
		
		final int AUXILIO_EMERGENCIAL = 600;
		String nome;
		char pronome;
		char op;
		int qntFilhos;
		int chef;
		int valorTotal=0;
		
		System.out.print("Digite o seu nome: ");
		nome = leia.next();
		System.out.print(nome+", digite o pronome que voc� prefere A/O/E: ");
		pronome = leia.next().toUpperCase().charAt(0);
		System.out.print(nome+", digite o n�mero de filhos: ");
		qntFilhos = leia.nextInt();
		System.out.print(nome+", digite [1] para chefa de fam�lia ou [2] para chefe de fam�lia: ");
		chef = leia.nextInt();
		System.out.print(nome+", voc� j� recebe algum aux�lio S/N:");
		op = leia.next().toUpperCase().charAt(0);
		
		if (pronome == 'A') {
			System.out.println("Seja bem-vinda!");
		} else if (pronome == 'O') {
			System.out.println("Seja bem-vindo!");
		} else if (pronome == 'E') {
			System.out.println("Seja bem-vinde!");
		}
			
		if (op == 'N') {
			if (chef == 2) {
				valorTotal = AUXILIO_EMERGENCIAL+(50*qntFilhos);
				System.out.println(nome+", o valor do seu aux�lio �: "+valorTotal);
			} else if (chef == 1) {
				valorTotal = (AUXILIO_EMERGENCIAL*2)+(50*qntFilhos);
				System.out.println(nome+", o valor do seu aux�lio �: R$ "+valorTotal);
			}
		} else {
			System.out.println(nome+", voc� j� recebe outro aux�lio.");
		}
		
	
		
	}

}
