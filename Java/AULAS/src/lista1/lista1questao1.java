package lista1;
import java.util.Scanner;

public class lista1questao1 {
	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		String nome;		
		int ano, mes, dia, totalDias;

		
		System.out.println("Digite o seu nome: ");
		nome = leia.next();
		System.out.println("Digite o ano do seu nascimento: ");
		ano = leia.nextInt();
		System.out.println("Digite o mes do seu nascimento: ");
		mes = leia.nextInt();
		System.out.println("Digite o dia do seu nascimento: ");
		dia = leia.nextInt();
		
		totalDias = (ano*365) + (mes*30) + dia;
		
		System.out.print("Oi "+nome+"! Sua idade em dias é "+totalDias+".");
	}
}
