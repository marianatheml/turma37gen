package app;
import java.util.Scanner;

import entities.Individual;

public class FormRegistPerson {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        Individual cad1 = new Individual();

        System.out.println("CADASTRO PESSOAL");

        System.out.print("Digite o nome: ");
        cad1.nome = leia.next();
        System.out.print("Digite o ano de nascimento: ");
        cad1.anoNascimento = leia.nextInt();
        System.out.print("1 - masculino\n2 - feminina\n3 - neutre\nDigite o número referente:");
        char op = leia.next().charAt(0);
        if (op=='1') {
            cad1.pronome = 'o';
        } else if (op=='2') {
            cad1.pronome = 'a';
        } else {
            cad1.pronome = 'e';
        }
        
        System.out.printf("Bom dia Sr%c. %s, sua idade aproxima é %d anos.\n",cad1.pronome,cad1.nome.toUpperCase(),cad1.calcularIdade(2021));

        System.out.println(cad1.toString());


    }

}
