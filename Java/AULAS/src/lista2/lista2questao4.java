package lista2;
import java.util.Scanner;

public class lista2questao4 {
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int numero=0;
		
		while (numero<0 || numero==0) {
			System.out.print("Digite um número positivo: ");
			numero = leia.nextInt();
			
			if (numero<0) {
				System.out.println("Você digitou um número negativo!");
			} else if (numero==0) {
				System.out.println("Você digitou um número neutro!");
			}
		}		
		
		if (numero%2==0) {
			System.out.println("O número digitado é par!");
		} else {
			System.out.println("O número digitado é impar!");
		}
	}
}
