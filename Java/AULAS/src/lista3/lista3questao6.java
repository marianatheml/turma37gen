package lista3;
import java.util.Scanner;

public class lista3questao6 {
	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		int num=0, contMultiplos3=0;
		double media, somaMultiplos3=0;
		
		do {
			System.out.print("Digite um n�mero inteiro: ");
			num = leia.nextInt();
			if (num%3 == 0 && num!=0) {
				contMultiplos3++;
				somaMultiplos3+=num;
			} else {
				
			}
		} while(num!=0);
		
		media = (somaMultiplos3/contMultiplos3);
		System.out.printf("A m�dia dos n�meros m�ltiplos de 3 �: %.2f",media);
	}	
}
