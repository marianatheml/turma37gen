programa
{
	
	funcao inicio()
	{
		inteiro pontuacao[5], maiorPontuacao=0, x

		para (x=0;x<5;x++){
			escreva("Digite um valor de pontuação: ")
			leia(pontuacao[x])
			
			se (pontuacao[x]>maiorPontuacao){
				maiorPontuacao=pontuacao[x]
			}
		}
		
		limpa()
		para (inteiro y=0;y<5;y++){
			escreva("Pontuação ",y+1," é: ", pontuacao[y],"\n")
		}
		
		escreva("A maior pontuação é: ",maiorPontuacao)
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 411; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {pontuacao, 6, 10, 9};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */