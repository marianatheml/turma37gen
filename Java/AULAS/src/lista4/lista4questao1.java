package lista4;

import java.util.Scanner;

public class lista4questao1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int valor[] = new int[5];
		int maiorValor=0;
		
		for (int x=0;x<5;x++) {
			System.out.print("Digite um valor de pontuação: ");
			valor[x] = leia.nextInt();
			
			if (valor[x]>maiorValor) {
				maiorValor=valor[x];
			}
		}
		
		System.out.println();
		for (int y=0;y<5;y++) {
			System.out.println("Pontuação "+(y+1)+" é: "+ valor[y]);
		}
		
		System.out.println("A maior pontuação é: "+maiorValor);
		
		
		
	}
	
	
}
