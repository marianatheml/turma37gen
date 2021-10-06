package lista4;

import java.util.Scanner;

public class lista4questao4 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int valor[][] = new int [3][3];
		int soma=0, somaPrincipal=0;

				for (int l=0;l<3; l++) {
					for (int c=0; c<3; c++) {
						System.out.print("Digite um valor para a linha "+l+" e coluna "+c+": ");
						valor[l][c] = leia.nextInt();
						soma+=valor[l][c];
						if (l==c) {
							somaPrincipal+=valor[l][c];
						}
					}	
				}
				
				System.out.println();
				System.out.println("A soma dos valores da diagonal principal é: "+ somaPrincipal);
				System.out.println("A soma dos valores da matriz é: "+ soma+ "\n");


	}

}
