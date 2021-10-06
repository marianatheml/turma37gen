package lista4;

import java.util.Random;
import java.util.Scanner;

public class lista4questao3 {
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		Random sorteia = new Random();
		
		
		int N1[][] = new int[4][6];
		int N2[][] = new int[4][6];
		int M1[][] = new int[4][6];
		int M2[][] = new int[4][6];


				for (int l=0;l<4; l++) {
					for (int c=0; c<6; c++) {
						N1[l][c] = sorteia.nextInt(11); 
						N2[l][c] = sorteia.nextInt(11);
						M1[l][c] = N1[l][c] + N2[l][c];
						M2[l][c] = N1[l][c] - N2[l][c];
						
					}
				}
				System.out.println("N1");
				for (int l=0;l<4; l++) {
					for (int c=0; c<6; c++) {
						System.out.print(N1[l][c]+" ");
						
					}
					System.out.println();
				}
				
				System.out.println("N2");
				for (int l=0;l<4; l++){
					for (int c=0; c<6; c++){
						System.out.print(N2[l][c]+" ");
						
					}
					System.out.println();
				}
				System.out.println("M1");
				for (int l=0;l<4; l++){
					for (int c=0; c<6; c++){
						System.out.print(M1[l][c]+" ");
						
					}
					System.out.println();
				}
				System.out.println("M2");
				for (int l=0;l<4; l++) {
					for (int c=0; c<6; c++) {
						System.out.print(M2[l][c]+" ");
						
					}
					System.out.println();
				}

		
	}
}
