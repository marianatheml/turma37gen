package lista2;
import java.util.Scanner;
import java.lang.Math;


public class lista2questao4 {
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int numero=0;
		double resultado;
		
		while (numero<0 || numero==0) {
			System.out.print("Digite um n�mero positivo: ");
			numero = leia.nextInt();
			
			if (numero<0) {
				System.out.println("Voc� digitou um n�mero negativo!");
			} else if (numero==0) {
				System.out.println("Voc� digitou um n�mero neutro!");
			}
		}		
		
		if (numero%2==0) {
			resultado = Math.sqrt(numero);
			System.out.printf("O n�mero digitado � par e a sua raiz quadrada � %.2f.",resultado);
		} else {
			resultado = Math.pow(numero,2);
			System.out.printf("O n�mero digitado � impar e ele elevado ao quadrado � %.2f.",resultado);
		}
	}
}
