import java.util.Scanner;

public class LojaClubedos5 {
	
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		String slogan = "Vista seu TIME! Use sua PAIX�O!";
		String nomeLoja = "CLUBE DOS 5";
		String cod [] = {"G8-1", "G8-2", "G8-3", "G8-4", "G8-5", "G8-6", "G8-7", "G8-8", "G8-9", "G8-10"};
		String produto [] = {"CAMISA DO SANTA-CRUZ", "CAMISA DO N�UTICO", "CAMISA DO SPORT CLUB", "CAMISA DO REAL MADRID", "CAMISA DO BARCELONA", "CAMISA DO BOCA JUNIORS", "CAMISA DO JUVENTUS", "CAMISA DO MANCHESTER U.", "CAMISA DO BOCA JUNIORS", "CAMISA DO LIVERPOOL"};
		double valor [] = {180.00, 150.00, 175.00, 199.00, 199.00, 180.00, 202.00, 199.00, 180.00, 202.00};
		int estoque [] = {10,10,10,10,10,10,10,10,10,10};
		int carrinho [] = {0,0,0,0,0,0,0,0,0,0};
			
		String op="", cont= "S";
		int quantidade=0,codUsuario,pagamento;
		double imposto=0.09,desconto=0.10,cartao=0.10,aPrazo=0.15,parcelas=0.0;
		double valorTotal,compras = 0.0,valorFinal,valorImposto;
				
		
		do{
			pagamento = 0;
			valorImposto = 0.0;
			valorFinal = 0.0;
			valorTotal = 0.0;
			
			for(int x=0;x<10;x++) {
				carrinho[x] = 0;
			}
			limpa();
			loja();
			System.out.println("Deseja realizar uma compra S/N: ");
			op = sc.next().toUpperCase();
			
			if (op.equals("S")){
				limpa();
				loja();

				do { 
					menu();
					
					do {
						System.out.println("Selecione o C�digo de 1 a 10 relacionado ao produto para adcionar no carrinho: ");
						codUsuario = sc.nextInt();
						codUsuario--;
						
						if (codUsuario < 0) {
							System.out.println("C�digo n�o encontrado, digite novamente!");
						}
						
					}while (codUsuario<0 || codUsuario>10);
					
					do{	
						System.out.println("Digite a quantidade que voc� deseja: ");
						quantidade = sc.nextInt();
						
						if (quantidade<=0) {
							System.out.println("Quantidade inexistente, digite um valor v�lido.\n");
						} else if (quantidade>estoque[codUsuario]) {
							System.out.println("Quantidade indispon�vel no estoque, deste produto restam apenas "+estoque[codUsuario]+" unidades na loja. Tente novamente.\n");
						}
						
						compras = valor[codUsuario]*quantidade; 
						valorTotal+=compras;
						
						carrinho[codUsuario] = quantidade;
						
					}while (quantidade<=0 || quantidade>estoque[codUsuario]);
					
					System.out.println();
					loja();
					System.out.println("CARRINHO DE COMPRA");
					
					for (int x=0;x<10;x++){
						if (carrinho[x]!=0) {
							System.out.println(cod[x]+"\t"+produto[x]+"\t\t"+valor[x]+"\t\t"+estoque[x]+" -	Quantidade selecionada: "+carrinho[x]+"\n");
						}
					} 
					
					System.out.println("Voc� quer adicionar mais produtos [S/N]: ");
					op = sc.next().toUpperCase();
				
				}while(op.equals("S"));
				
				for (int x=0;x<10;x++){
					if(carrinho[x]!=0){
						estoque[x] = estoque[x] - carrinho[x];
					} 
				}
				
				valorImposto = (valorTotal * imposto);
				valorTotal = valorTotal + valorImposto;
				
				do{
					System.out.println("Qual a forma de pagamento que o(a) senhor(a) deseja realizar: ");
					System.out.println("[1] � vista (10% de desconto)");
					System.out.println("[2] no cart�o (10% de juros)");
					System.out.println("[3] dividido em 2 vezes (15% de juros)");
					System.out.println("Digite o c�digo correspondente: ");
					pagamento = sc.nextInt();
					limpa();
					switch (pagamento) {
						case 1:
							System.out.println("�tima escolha, � vista iremos lhe dar um desconto de 10%.");
							valorFinal = valorTotal - (valorTotal*desconto);
							break;
						case 2:
							System.out.println("�timo, iremos apenas acrescentar 10% de juros no valor final.");
							valorFinal = (valorTotal + (valorTotal*cartao));
							break;
						case 3:
							System.out.println("�timo, iremos apenas acrescentar 15% de juros no valor final.");
							valorFinal = (valorTotal + (valorTotal*aPrazo));
							parcelas = (valorFinal / 2);
							break;
						default:
							System.out.println("Voc� digitou um n�mero inv�lido, digite novamente.");
					}
				}while (pagamento<1 || pagamento>3);
			
				System.out.println("\n\t\t\tNOTA FISCAL\n");
				System.out.println("************************************************************\n");
				System.out.println("LOJA: "+nomeLoja);
				System.out.printf("Valor do seu pedido			-	 R$ %.2f\n",valorTotal);
				System.out.printf("Valor do imposto embutido		-	 R$ %.2f\n",valorImposto);
				if (pagamento==3) {
					System.out.printf("Valor Final (forma de pagamento)\t-	 R$ %.2f\n",valorFinal);
					System.out.printf("Valor de cada parcela (2x)	 \t-	 R$ %.2f\n",parcelas);
				}else
				{
					System.out.printf("Valor Final (forma de pagamento)\t-	 R$ %.2f\n",valorFinal);
				}
			}else if (op.equals("N")){
				limpa();
				loja();
			}
		System.out.println("Deseja continuar S/N: ");
		cont = sc.next().toUpperCase();

		}while(cont.equals("S"));
		
		limpa();
		System.out.println("Obrigado pela presen�a, n�s da "+nomeLoja+" agradecemos a prefer�ncia.");
		System.out.println(slogan+" Volte sempre!");
	}

	 
	
	public static void limpa() {
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
	}
	public static void loja() {
		String nomeLoja = "CLUBE DOS 5";
		String slogan = "Vista seu TIME! Use sua PAIX�O!";
		String fundadores = "* * * * *";
		
		System.out.println(nomeLoja+"\t     "+fundadores);
		System.out.print(slogan+"\n");
	}
	public static void menu() {
		String cod [] = {"G8-1", "G8-2", "G8-3", "G8-4", "G8-5", "G8-6", "G8-7", "G8-8", "G8-9", "G8-10"};
		String produto [] = {"CAMISA DO SANTA-CRUZ", "CAMISA DO N�UTICO", "CAMISA DO SPORT CLUB", "CAMISA DO REAL MADRID", "CAMISA DO BARCELONA", "CAMISA DO BOCA JUNIORS", "CAMISA DO JUVENTUS", "CAMISA DO MANCHESTER U.", "CAMISA DO BOCA JUNIORS", "CAMISA DO LIVERPOOL"};
		double valor [] = {180.00, 150.00, 175.00, 199.00, 199.00, 180.00, 202.00, 199.00, 180.00, 202.00};
		int estoque [] = {10,10,10,10,10,10,10,10,10,10};
		
		System.out.println("\nC�DIGO\t\tPRODUTO\t\t\tVALOR\t      ESTOQUE\n");
		for(int x=0;x<10;x++) {
				System.out.print(cod[x]+"\t"+produto[x]+"\t\t"+valor[x]+"\t\t"+estoque[x]+"\n");
		}
	}
		

}
