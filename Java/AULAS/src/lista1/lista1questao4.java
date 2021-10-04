package lista1;
import java.util.Scanner;
import java.lang.Math;

public class lista1questao4 {
	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		double a, b, c, d, r, s;
		 
		System.out.println("Digite o valor de A: ");
		a = leia.nextDouble();		 
		System.out.println("Digite o valor de B: ");
		b = leia.nextDouble();	
		System.out.println("Digite o valor de C: ");
		c = leia.nextDouble();	
		
		r = Math.pow((a + b),2);
		s = Math.pow((b + c),2);
		d = (r + s)/2;
		
		System.out.println("O resultado é "+d+"!");
		
	}
}
