package application;
import java.util.Scanner;

import entities.Questao2_Aviao;

public class Questao2_Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Questao2_Aviao aviao = new Questao2_Aviao ("MARIANA THEML","BOEING 737");
		
		
		System.out.println(aviao.toString());
		
		aviao.ligar();
		aviao.acelerar();
		aviao.acelerar();
		aviao.desacelerar();
		aviao.pousar();
		aviao.desligar();

	}
}
