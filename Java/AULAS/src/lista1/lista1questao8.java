package Lista1;
import java.util.Scanner;

public class lista1questao8 {
	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		double CConsumidor, CFabrica, distribuidor, impostos;
		
		System.out.println("Digite o custo de f�brica do autom�vel: ");
		CFabrica = leia.nextDouble();
		
		distribuidor = CFabrica * 28 / 100;
		impostos = CFabrica * 45 / 100;
		
		CConsumidor = CFabrica + distribuidor + impostos;
		
		System.out.printf("O custo ao consumidor de um carro novo � de R$ %.2f", CConsumidor);
		
		
	}

}
