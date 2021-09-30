programa
{
	
	funcao inicio()
	{
		inteiro tamanho
		escreva("Digite o tamanho da sua linha: ")
		leia(tamanho)
		
		// Tamanho Fixo - PARA
		para (inteiro x=1;x<=10;x++){
			escreva(x," - Parabéns Fer!\n")
			linha(tamanho)
			escreva("\n")
		}
		
	}

	funcao linha(inteiro tamanho){
		para (inteiro x=1;x<=tamanho;x++){
			escreva("-")
		}
		
	}
	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 208; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */