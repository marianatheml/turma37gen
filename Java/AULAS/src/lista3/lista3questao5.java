package lista3;

import java.util.Scanner;

public class lista3questao5 {
	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		double num, total=0;
		
		do {
			System.out.println("Digite um número: ");
			num = leia.nextDouble();{
			total+=num;
			}
		} while(num != 0);
		
		System.out.println("A soma dos valores digitados é: "+total);
		
	}
}
