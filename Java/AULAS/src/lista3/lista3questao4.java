package lista3;

import java.util.Scanner;

public class lista3questao4 {
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		String nome;
		int idade, sexo, temperamento,
		contPessoas=0, contPessoasCalmas=0,
		contMulheresNervosas=0,
		contHomensAgressivos=0,
		contOutrosCalmos=0,
		contPessoasNervosasMais40=0,
		contPessoasCalmasMenor18=0;
		boolean y = true;
		
		while(y) {
			if(contPessoas > 149) {
				break;
			}
			contPessoas++;
			System.out.print("Qual a idade da pessoa n�mero "+contPessoas+": ");
			idade = leia.nextInt();
			if (idade<0) {
				contPessoas--;
				continue;
			}
			System.out.println("Escolha uma das op��es:");
			System.out.println("1 - Feminino\n2 - Masculino\n3 - Outros");
			sexo = leia.nextInt();
			
			while(y) {
				if(sexo == 1 || sexo == 2 || sexo == 3) {
						break;
				} else {
						System.out.println("N�mero inv�lido! Digite novamente.");
						System.out.println("Escolha uma das op��es:");
						System.out.println("1 - Feminino\n2 - Masculino\n3 - Outros");
						sexo = leia.nextInt();
				}
					
			}
						
			System.out.println("Voc� se considera: ");
			System.out.println("1 - Pessoa Calma\n2 - Pessoa Nervosa\n3 - Pessoa Agressiva");
			temperamento = leia.nextInt();
			
			while(y) {
				if(temperamento == 1 || temperamento == 2 || temperamento == 3) {
						break;
				} else {
					System.out.println("N�mero inv�lido! Digite novamente.");
					System.out.println("Voc� se considera: ");
					System.out.println("1 - Pessoa Calma\n2 - Pessoa Nervosa\n3 - Pessoa Agressiva");
					temperamento = leia.nextInt();
				}	
			}	
			if (temperamento == 1) {
				contPessoasCalmas++;
			}
			if (sexo == 1 && temperamento == 2) {
				contMulheresNervosas++;
			}
			if (sexo == 2 && temperamento == 3) {
				contHomensAgressivos++;
			}
			if (sexo == 3 && temperamento == 1) {
				contOutrosCalmos++;
			}
			if (temperamento == 2 && idade>40) {
				contPessoasNervosasMais40++;
			}
			if (temperamento == 1 && idade<18) {
				contPessoasCalmasMenor18++;
			}
		}
		System.out.println("\nRelat�rio:");
		System.out.println(contPessoasCalmas+" pessoas calmas.");
		System.out.println(contMulheresNervosas+" se declaram mulheres nervosas.");
		System.out.println(contHomensAgressivos+" se declaram homens agressivos");
		System.out.println(contOutrosCalmos+" se declararam 'outros' e se consideram calmos.");
		System.out.println(contPessoasNervosasMais40+" s�o nervosas com mais de 40 anos.");
		System.out.println(contPessoasCalmasMenor18+" s�o calmos e com menos de 18 anos.");
	}
}
