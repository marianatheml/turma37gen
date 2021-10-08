package application;
import entities.Questao1_Cliente;
import java.util.Scanner;

public class Questao1_Program {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Questao1_Cliente cad = new Questao1_Cliente();
		
		System.out.println("CADASTRO DO CLIENTE");

        System.out.print("Digite o nome: ");
        cad.Nome = sc.nextLine().toUpperCase();
        System.out.print("Digite o e-mail: ");
        cad.Email = sc.next().toUpperCase();
        System.out.print("Digite a sua idade: ");
        cad.Idade = sc.nextInt();
        System.out.print("Digite a sigla do seu estado: ");
        cad.Estado = sc.next().toUpperCase();
        System.out.print("Digite o número referente à [1] mulher, [2] homem ou [3] neutre: ");
        char op = sc.next().charAt(0);
        if (op=='1') {
            cad.Pronome = 'A';
        } else if (op=='2') {
            cad.Pronome = 'O';
        } else {
            cad.Pronome = 'E';
        }     
        
        System.out.printf("\n\n\n\n\n\n\n\nSEJA BEM VIND%s, %s!",cad.Pronome,cad.Nome);
        System.out.printf("\n\n\tDADOS D%s CLIENTE\n--------------------------------",cad.Pronome);
		
        System.out.println("\n"+cad.toString());
	}
	
}
