package lista2;
import java.util.Scanner;


public class lista2questao2 {
	
	public static void main(String[] args) {
	
		Scanner leia = new Scanner (System.in);
		
		int num1, num2, num3;
		
		
		System.out.print("Digite um n�mero inteiro: ");
		num1 = leia.nextInt();
		System.out.print("Digite outro n�mero inteiro: ");
		num2 = leia.nextInt();
		System.out.print("Digite s� mais um n�mero inteiro: ");
		num3 = leia.nextInt();
		
		if(num1<=num2 && num1<=num3 && num2<=num3) {
			System.out.println("Os n�meros digitados na ordem crescente s�o: "+num1+", "+num2+", "+num3);
	    } else if (num1<=num2 && num1<=num3 && num2>=num3) {
	    	System.out.println("Os n�meros digitados na ordem crescente s�o: "+num1+", "+num3+", "+num2);
	    } else if (num2<=num1 && num2<=num3 && num1<=num3) {
	    	System.out.println("Os n�meros digitados na ordem crescente s�o: "+num2+", "+num1+", "+num3);
	    } else if (num2<=num1 && num2<=num3 && num3<=num1) {
	    	System.out.println("Os n�meros digitados na ordem crescente s�o: "+num2+", "+num3+", "+num1);
	    } else if (num3<=num1 && num3<=num2 && num2<=num1) {
	    	System.out.println("Os n�meros digitados na ordem crescente s�o: "+num3+", "+num2+", "+num1);
	    } else if (num3<=num1 && num3<=num2 && num1<=num2) {
	    	System.out.println("Os n�meros digitados em ordem crescente s�o: "+num3+", "+num1+", "+num2);
	    }
	}	
		
}
	
