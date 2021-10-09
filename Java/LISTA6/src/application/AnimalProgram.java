package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Animal;
import entities.Cachorro;
import entities.Cavalo;
import entities.Preguica;

public class AnimalProgram {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List<Animal> list = new ArrayList<>();
		
		System.out.print("[1] - Cachorro [2] - Cavalo [3] - preguiça\nDentro das opções apresentadas, digite um número para escolher o animal: ");
		String opAnimal = sc.next();
		if(opAnimal.equals("1")) {
			System.out.println("\nVOCÊ ESCOLHEU CACHORRO!");
			Animal ani = new Cachorro("Belinha", "14");
			list.add(ani);
		}else if(opAnimal.equals("2")) {
			System.out.println("\nVOCÊ ESCOLHEU CAVALO!");
			Animal ani = new Cavalo("Pé de Pano","6");
			list.add(ani);
		}else if(opAnimal.equals("3")) {
			System.out.println("\nVOCÊ ESCOLHEU PREGUIÇA!");
			Animal ani = new Preguica("Soninho", "28");
			list.add(ani);
		}
		
		for (Animal ani : list) {
			System.out.println("O seu nome é "+ani.getNome()+", tem "+ani.getIdade()+ " anos de idade e ama " + ani.habilidade()+".");
			
			System.out.print("\nDigite se você quer ouvir "+ani.getNome()+" dizer ''oi humano!'' [S/N]: ");
			char ouvir = sc.next().toUpperCase().charAt(0);
			if (ouvir == 'S') {
				System.out.println("\n"+ani.getNome()+": "+ani.emitirSom()+"!");
			} else if(ouvir == 'N') {
				System.out.println("\n"+ani.getNome()+" ficou triste, então foi embora.");
			}
		
		}
		
		sc.close();		
		
	}
}
