package lista2;

import java.util.Scanner;

public class lista2questao1 {
	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		float num;
		float maior=0;
		int cont = 1;
				
		
		while (cont < 4) {
			System.out.print("Digite o número " + cont +": ");
			num = leia.nextFloat();
			
			if (num>maior) {
				maior = num;
			}
			
			cont++;
		}
		
		System.out.printf("O maior número é %.2f!",maior);
	}

}
