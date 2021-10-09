package app;
import java.util.Scanner;
import entities.Car;

public class CarTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String opLigar="N";
		
		Car mycar = new Car("KLT-6811","FOX","VOLKSWAGEN");
		
		System.out.println(mycar.toString());
		
		do {
			System.out.print("\nCarro Desligado. Deseja ligar o carro (S/N): ");
			opLigar = sc.next().toUpperCase();
			if (opLigar == "S") {
				mycar.ligarCarro();
			} 
		} while (opLigar.equals("N"));	
		
		mycar.acelerar();
		mycar.acelerar();
		mycar.subirMarcha();
		mycar.acelerar();
		mycar.acelerar();
		mycar.subirMarcha();
		mycar.frear();
		mycar.frear();
		System.out.println(mycar.getVelocidade());
		mycar.desderMarcha();
		mycar.reduzir();
		mycar.frear();
		mycar.frear();
		mycar.desligarCarro();
		
		
		
		sc.close();

	}

}
