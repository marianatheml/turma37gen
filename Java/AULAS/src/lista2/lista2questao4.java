package lista2;
import java.util.Scanner;
import java.lang.Math;


public class lista2questao4 {
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int numero=0;
		double resultado;
		
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
			resultado = Math.sqrt(numero);
			System.out.printf("O número digitado é par e a sua raiz quadrada é %.2f.",resultado);
		} else {
			resultado = Math.pow(numero,2);
			System.out.printf("O número digitado é impar e ele elevado ao quadrado é %.2f.",resultado);
		}
	}
}
