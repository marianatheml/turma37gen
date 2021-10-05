package lista3;

import java.util.Locale;

public class lista3questao1 {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.CANADA);;
		
		
		for (int num=1000;num<=1999;num++) {
			if (num%11==5) {
				System.out.println(num);
			}

		}
	}
}
