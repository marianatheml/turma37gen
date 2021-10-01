programa
{
	funcao inicio()
	{

		cadeia cod[10] = {"G1-1", "G1-2", "G1-3", "G1-4", "G1-5", "G1-6", "G1-7", "G1-8", "G1-9", "G1-10"}  
		cadeia produto[10] = {"CAMISA DO SANTA-CRUZ", "CAMISA DO NÁUTICO", "CAMISA DO SPORT CLUB", "CAMISA DO REAL MADRID", "CAMISA DO BARCELONA", "CAMISA DO BOCA JUNIORS", "CAMISA DO JUVENTUS", "CAMISA DO MANCHESTER", "CAMISA DO BOCA JUNIORS", "CAMISA DO LIVERPOOL"}
		real valor[10] = {180.00, 150.00, 175.00, 199.00, 199.00, 180.00, 202.00, 199.00, 180.00, 202.00}
		inteiro estoque[10] = {10,10,10,10,10,10,10,10,10,10}
		caracter op
				
		loja()

		escreva("\nDESEJA FAZER COMPRAS S/N: ")
		leia(op)

		se (op == 'S' ou op == 's'){
			limpa()
			loja()

			escreva("\nCÓDIGO\t\tPRODUTO\t\t\tVALOR\t      ESTOQUE\n")
			para(inteiro x=0;x<10;x++){
					escreva(cod[x],"\t",produto[x],"\t\t",valor[x],"\t\t",estoque[x],"\n")
			}
			
		}senao se (op == 'N' ou op == 'n'){
			limpa()
			loja()
			escreva("\nMuito obrigado e volte sempre!")
		}
	

	}
	funcao loja(){
		cadeia nomeLoja = "CLUBE DOS 5", slogan = "Vista seu time! Use sua paixão!"
		escreva(nomeLoja)
		escreva("\n",slogan,"\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 733; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */