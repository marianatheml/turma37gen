package app;

import entities.Clt;
import entities.Terceiro;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Program {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List<Clt> list= new ArrayList<>();
		
		int n;
		
		System.out.print("Quantos funcionários: ");
		n = sc.nextInt();
		
		for (int i=1;i<=n;i++) {
			System.out.print("\nDADOS DO FUNCIONÁRIO #"+i);
			sc.nextLine();
			System.out.print("\nNome: ");
			String nome = sc.nextLine();
			System.out.print("Matricula: ");
			String matricula = sc.next();
			System.out.print("Horas trabalhadas: ");
			int horas = sc.nextInt();			
			System.out.print("Valor da hora trabalhada: ");
			double valor = sc.nextDouble();
			System.out.print("Ele é [1] - CLT ou [2] - Terceiro: ");
			int op = sc.nextInt();
			if (op == 1) {
				Clt clt = new Clt(matricula, nome, horas, valor);
				list.add(clt);
			} else {
				System.out.print("Valor adicional: ");
				double adicional = sc.nextDouble();
				Clt terceiro = new Terceiro(matricula, nome, horas, valor, adicional);
				list.add(terceiro);
			}
		}	
			
		System.out.println("\nRESUMO DE PAGAMENTO\n");
		for (Clt clt: list) {
				System.out.println(clt.toString());
				System.out.println("Valor a receber: "+clt.salario()+"\n");
				
		}
			
		sc.close();

	}

}
