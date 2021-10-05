package lista3;

import java.util.Scanner;

public class lista3questao3 {
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int idade=0, contMenos21=0, contMais50=0;
		
		while(idade!=-99) {
			System.out.print("Digite sua idade: ");
			idade = leia.nextInt();
			if (idade<21) {
				contMenos21++;
			}
			if(idade>50) {
				contMais50++;
			}
		}
		System.out.println("O total de pessoas com menos de 21 anos é: "+contMenos21);
		System.out.println("O total de pessoas com mais de 50 anos é: "+contMais50);
	}
}
