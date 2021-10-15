package app;
import entities.Individual;
import entities.Product;
import java.util.Scanner;

public class FormRegistProduct {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Individual ind = new Individual();
		Product pd = new Product();
		
		System.out.println("\tÁREA DE REGISTO DE PRODUTO\n---------------------------------------------");
		
		System.out.println("PREENCHA O CADASTRO PESSOAL");
		System.out.print("Nome: ");
		ind.nome = sc.next().toUpperCase();
		System.out.print("Digite o número referente à [1] mulher, [2] homem ou [3] neutre: "); 
		char op1 = sc.next().charAt(0);
		if (op1 == '1') {
            ind.pronome = 'A';
        } else if (op1 == '2') {
            ind.pronome = 'O';
        } else {
            ind.pronome = 'E';
        }
		System.out.print("Digite o seu e-mail: ");
		ind.email = sc.next().toUpperCase();
		
		System.out.println("\nPREENCHA O CADASTRO DE PRODUTO");
		System.out.print("Código do produto: ");
		pd.codigo = sc.next();
		sc.nextLine();
		System.out.print("Nome do produto: ");
		pd.nome = sc.nextLine();
		System.out.print("Valor do produto: ");
		pd.valor = sc.nextDouble();
		System.out.print("Quantidade inicial em estoque: ");
		pd.estoque = sc.nextInt();
		
		System.out.println("\n\t\tRESUMO DO REGISTRO\n-----------------------------------------------------");
		System.out.printf("SR%c. %s OS PRODUTOS ADICIONADOS POR VOCÊ FORAM: \n",ind.pronome,ind.nome);
		System.out.println("\n"+pd.toString());
		System.out.print("\nDeseja adicionar poduto no estoque S/N:");
		char op2 = sc.next().toUpperCase().charAt(0);
		if (op2 == 'S') {
			System.out.print("Digite a quatidade a ser adicionada: ");
			int qtdeAdicionada = sc.nextInt();
            pd.addEstoque(qtdeAdicionada);    		
        } 
		System.out.print("Deseja retirar poduto do estoque S/N:");
		char op3 = sc.next().toUpperCase().charAt(0);
		if (op3 == 'S') {
			System.out.print("Digite a quatidade a ser retirada: ");
			int qtdeRetirada = sc.nextInt();
			pd.tirarEstoque(qtdeRetirada);
		}
		
		System.out.println("\n\t\tRESUMO ATUALIZADO\n-----------------------------------------------------");
		System.out.println(pd.toString());
		System.out.printf("\nTODAS INFORMAÇÕES SERÃO ENVIADAS PARA A SR%c. %s\nPELO E-MAIL IMFORMADO %s.",ind.pronome,ind.nome,ind.email);
		
	}

}
