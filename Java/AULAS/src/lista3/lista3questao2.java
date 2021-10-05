package lista3;

import java.util.Locale;
import java.util.Scanner;

public class lista3questao2 {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.CANADA);
		Scanner leia = new Scanner(System.in);
		
		int num;
		int contPar=0;
		int contImpar=0;
		
		
		for (int x=1;x<=10;x++) {
			System.out.printf("Digite o número %d: ",x);
			num = leia.nextInt();
			if ((num%2) == 0 && num > 0) {
				contPar++;
			} else if ((num%2) == 1 && num > 0) {
				contImpar++;

			}
			
		}
		
		System.out.println();
		System.out.println("A quantidade de números pares é: "+contPar);
		System.out.println("A quantidade de números impares é: "+contImpar);
		
	}
}
