package lista2;
import java.util.Scanner;


public class lista2questao2 {
	
	public static void main(String[] args) {
	
		Scanner leia = new Scanner (System.in);
		
		int num1, num2, num3;
		
		
		System.out.print("Digite um número inteiro: ");
		num1 = leia.nextInt();
		System.out.print("Digite outro número inteiro: ");
		num2 = leia.nextInt();
		System.out.print("Digite só mais um número inteiro: ");
		num3 = leia.nextInt();
		
		if(num1<=num2 && num1<=num3 && num2<=num3) {
			System.out.println("Os números digitados na ordem crescente são: "+num1+", "+num2+", "+num3);
	    } else if (num1<=num2 && num1<=num3 && num2>=num3) {
	    	System.out.println("Os números digitados na ordem crescente são: "+num1+", "+num3+", "+num2);
	    } else if (num2<=num1 && num2<=num3 && num1<=num3) {
	    	System.out.println("Os números digitados na ordem crescente são: "+num2+", "+num1+", "+num3);
	    } else if (num2<=num1 && num2<=num3 && num3<=num1) {
	    	System.out.println("Os números digitados na ordem crescente são: "+num2+", "+num3+", "+num1);
	    } else if (num3<=num1 && num3<=num2 && num2<=num1) {
	    	System.out.println("Os números digitados na ordem crescente são: "+num3+", "+num2+", "+num1);
	    } else if (num3<=num1 && num3<=num2 && num1<=num2) {
	    	System.out.println("Os números digitados em ordem crescente são: "+num3+", "+num1+", "+num2);
	    }
	}	
		
}
	
