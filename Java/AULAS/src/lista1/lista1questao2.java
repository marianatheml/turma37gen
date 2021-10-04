package lista1;
import java.util.Scanner;

public class lista1questao2 {
	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		int ano, mes, dia;
		String nome;
		
		System.out.println("Digite o seu nome: ");
		nome = leia.next();
		System.out.println("Digite quantos dias de vida você tem: ");
		dia = leia.nextInt();
		
		ano = dia/365;
		mes = (dia%365)/30;
		dia = (dia%365)%30;
		
		System.out.println(nome + ", você nasceu no dia " + dia + " do mês "+mes+" do ano de "+ano+".");
		
	}
}
