package app;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.NotaFiscal;
import entities.Produto;
import entities.Taxas;

public class Clubedos5 {
	static List <Produto> list = new ArrayList<>();
	static NotaFiscal nota = new NotaFiscal();
	static Taxas taxa = new Taxas();
	

	public static void main (String[] args) {
		Scanner sc = new Scanner (System.in);
		
		
		String op="", codProduto= "", opCompra = "S";
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
		
		
		loja();
		
		do {
		
			System.out.print("Seja Bem-vinde!\n[S] - Sim\n[N] - Não\nDeseja realizar uma compra: ");
			op = sc.next().toUpperCase();
			
			if(op.equals("N")) {
				break;
			}
			
			//_____________________________________________COMPRA
			
			do {
				limpa();
				catalogo();
				System.out.print("\nDigite o código do produto para adiciona-lo no carrinho de compras: ");
				codProduto = sc.next().toUpperCase();
				int cont=0;
				for (Produto prod : list) {
					if (codProduto.equals(prod.getCodigo())) {
						limpa();
						System.out.println("-------------------------------------------------------");
						System.out.println("                  PRODUTO SELECIONADO                 ");
						System.out.println("-------------------------------------------------------");
						System.out.println("\nCODIGO\t\t NOME\t\t\tVALOR\tESTOQUE");
						System.out.println(prod.toString());
						cont++;
					} 
				}
				
				if (cont == 0) {
					limpa();
					System.out.println("Produto não encontrado!");
					
				} else {
					System.out.print("\nDigite a quatidade de produtos que deseja comprar: ");
					int qtdeProduto = sc.nextInt();
					
					for (Produto prod : list) {
						if (prod.getCodigo().equals(codProduto)) {
							if(qtdeProduto>prod.getEstoque() || qtdeProduto<=0) {
								limpa();
								System.out.println("Quantidade indisponível.");
							} else {
								prod.setCarrinho(qtdeProduto);
							}	
						}
					}					
				
					int contCarrinho = 0;
					for (Produto prod : list) {
						if (prod.getCarrinho() != 0) {
							contCarrinho++;
						}
					}
					if (contCarrinho != 0) {
						limpa();
						System.out.println("-----------------------------------------------------------------------");
						System.out.println("                          CARRINHO DE COMPRA                          ");
						System.out.println("-----------------------------------------------------------------------");
						System.out.println("\nCODIGO\t\t NOME\t\t\tVALOR\tESTOQUE   QTD. COMPRADA");
					} else {
						System.out.println("\n\t\t\tCARRINHO VAZIO");
					}
					
					for(Produto prod : list) {
						
						if (prod.getCarrinho() != 0) {
							System.out.println(prod.toString() +"\t\t"+prod.getCarrinho());
						}
						
					}
					System.out.print("\nDeseja continuar comprando [S/N]: ");
					opCompra = sc.next().toUpperCase();
					
					while (true) {
						if (op.equals("S") || op.equals("N")) {
							break;
						} else {
							System.out.print("Opção inválida. Digite [S/N]: ");
							opCompra = sc.next().toUpperCase();
						}
					}
					
				}
				

			}while (!opCompra.equals("N"));
			
			for (Produto prod : list) {
				if (prod.getCarrinho() != 0) {
					prod.valorDaCompra();
					prod.finalizarCompra();

				}
			}
			
			double totalDaCompra = 0;
			for (Produto prod : list) {
				if (prod.getCarrinho() != 0) {
					totalDaCompra += prod.getValorTotal();
				}
			}
			
			//_____________________________________________PAGAMENTO
			
			limpa();
			System.out.println("VALOR TOTAL DA SUA COMPRA: "+totalDaCompra);
			System.out.println("ESCOLHA UMA OPÇÃO: ");
			System.out.println("1- A VISTA (10% DE DESCONTO)");
			System.out.println("2- NO CARTÃO DE CRÉDITO (10% DE AUMENTO)");
			System.out.println("3- 2 VEZES NO CARTÃO (15% DE AUMENTO)");
			char opPagamento = sc.next().charAt(0);
			while(true) {
				if(opPagamento == '1' || opPagamento == '2' || opPagamento == '3') {
					break;
				}else {
					limpa();
					System.out.println("OPÇÃO DE PAGAMENTO INVÁLIDA \n DIGITE UMA DAS OPÇÕES: ");
					System.out.println("1- A VISTA (10% DE **DESCONTO**  (10% DE AUMENTO)");
					System.out.println("2- NO CARTÃO DE CRÉDITO");
					System.out.println("3- 2 VEZES NO CARTÃO (15% DE AUMENTO)");
					opPagamento = sc.next().charAt(0);
				}
				
			}
			
			//_____________________________________________NOTA FISCAL
			
			switch (opPagamento) {
			case '1':
				limpa();
				System.out.println(nota.notaFiscal(totalDaCompra, taxa.imposto(totalDaCompra), '1', taxa.aVista(totalDaCompra)));
				break;
			case '2':
				limpa();
				System.out.println(nota.notaFiscal(totalDaCompra, taxa.imposto(totalDaCompra), '2', taxa.cartao(totalDaCompra)));
				break;
			case '3':
				limpa();
				System.out.println(nota.notaFiscal(totalDaCompra, taxa.imposto(totalDaCompra), '3', taxa.parcelado(totalDaCompra)));
				break;
			}
			
			totalDaCompra = 0;
			opCompra = "S";
			for(Produto prod : list) {
				if(prod.getCarrinho() != 0) {
					prod.setCarrinho(0);
					prod.setValorTotal(0);
				}
			}
			

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
		String slogan = "• • • • •\t        VISTA SEU TIME! USE SUA PAIXÃO!";
		String fundadores = "\t\t\t      • • • • •";
		
		System.out.println("\n" + nomeLoja+"\t     "+fundadores);
		System.out.print(slogan+"\n\n");
	}
	
	public static void catalogo() {
		loja();
		System.out.println("-------------------------------------------------------");
		System.out.println("                 CATALOGO DE PRODUTOS                ");
		System.out.println("-------------------------------------------------------");
		System.out.println("\nCODIGO\t\t NOME\t\t\tVALOR\tESTOQUE");
		for (Produto prod : list) {
			System.out.println(prod.toString());
		}
	}
	

}
