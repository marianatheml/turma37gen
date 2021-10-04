package Lista1;
import java.util.Scanner;

public class lista1questao3 {
	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		int hr, min, seg, tempoTotal;
		
		System.out.println("Digite o tempo do evento em segundos: ");
		tempoTotal = leia.nextInt();
				
		hr = tempoTotal/3600;
		min = (tempoTotal-(hr*3600))/60;
		seg = tempoTotal%60;
		
		System.out.println("O tempo do evento é "+hr+" horas, "+min+" minutos e "+seg+" segundos.");
		
		
	}
	
}
