package lista1;
import java.util.Scanner;

public class lista1questao5 {
	public static void main (String[] args) {
		
		Scanner leia = new Scanner (System.in);
						
		String nome;
		float n1, n2, n3, media;
		
		System.out.println("Digite o nome do aluno: ");
		nome = leia.next();
		System.out.println("Digite a primeira nota: ");
		n1 = leia.nextFloat();
		System.out.println("Digite a segunda nota: ");
		n2 = leia.nextFloat();
		System.out.println("Digite a terceira nota: ");
		n3 = leia.nextFloat();
		
		media = ((n1*2)+(n2*3)+(n3*5))/10;
		
		System.out.print("A média do (a) aluno (a) " + nome + " foi: " + media);
		
		
		
	}
}
