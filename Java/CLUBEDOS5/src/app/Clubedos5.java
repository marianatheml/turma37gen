package app;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import entities.Produto;

public class Clubedos5 {
	public static void main (String[] args) {
		Scanner sc = new Scanner (System.in);
		List <Produto> list = new ArrayList<>();

		
		String op="", codProduto= "";
		String nomeLoja = "CLUBE DOS 5";
		String slogan = "Vista seu TIME! Use sua PAIXÃO!";
		
		list.add(new Produto("G8-1","CAMISA DO SANTA-CRUZ",180.00));
		list.add(new Produto("G8-2","CAMISA DO NÁUTICO",150.00));
		list.add(new Produto("G8-3","CAMISA DO SPORT CLUB",175.00));
		list.add(new Produto("G8-4","CAMISA DO REAL MADRID",199.00));
		list.add(new Produto("G8-5","CAMISA DO BARCELONA",180.00));
		list.add(new Produto("G8-6","CAMISA DO SEVILLA",199.00));
		list.add(new Produto("G8-7","CAMISA DO JUVENTUS",199.00));
		list.add(new Produto("G8-8","CAMISA DO MANCHESTER U.",202.00));
		list.add(new Produto("G8-9","CAMISA DO BOCA JUNIORS",180.00));
		list.add(new Produto("G8-10","CAMISA DO LIVERPOOL",202.00));
		
		
		do {
			loja();
			System.out.print("Deseja realizar uma compra S/N: ");
			op = sc.next().toUpperCase();
			
			System.out.println("COD                NOME         VALOR ESTOQUE");
			
			for (Produto prod : list) {
				System.out.println(prod.toString());
			}
			
			do {
				System.out.print("\nSelecione o Código de 1 a 10 relacionado ao produto para adcionar no carrinho: ");
				codProduto = sc.next().toUpperCase();
				int cont=0;
				for (Produto prod : list) {
					if (codProduto.equals(prod.getCodigo())) {
						System.out.println("\n"+prod.toString());
						cont++;
					} 
				}
				
				if (cont == 0) {
					System.out.println("Produto não encontrado!");
					
				} else {
					System.out.print("Digite o número de produtos que deseja: ");
					int qtdeProduto = sc.nextInt();
					for (Produto prod : list) {
						if (prod.getCodigo().equals(codProduto)) {
							if(qtdeProduto>prod.getEstoque()) {
								System.out.println("Não possui quantidade em estoque.");
							} else {
								prod.setCarrinho(qtdeProduto);
							}
							
						}
					}
					
				}
				
				break;
			}while (true);
			

		} while(op.equals("S"));
		
		limpa();
		System.out.println("Obrigado pela presença, nós da "+nomeLoja+" agradecemos a preferência.");
		System.out.println(slogan+" Volte sempre!");
	
	} 
	
	public static void limpa() {
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
	}
	
	public static void loja() {
		String nomeLoja = "CLUBE DOS 5";
		String slogan = "Vista seu TIME! Use sua PAIXÃO!";
		String fundadores = "* * * * *";
		
		System.out.println(nomeLoja+"\t     "+fundadores);
		System.out.print(slogan+"\n");
	}
	
	

}
