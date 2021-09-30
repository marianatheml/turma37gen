programa
{
	inclua biblioteca Util
	funcao inicio()
	{
		inteiro maiorPontuacao=0, contMaior=0, pontuacao[10] //0-9 - contabilizando 10 valores
		real mediaPontuacao=0.0, somaPontuacao=0.0

		para (inteiro x=0;x<10;x++){
			pontuacao[x]=Util.sorteia(1,6)
			somaPontuacao+=pontuacao[x]
			
			se (maiorPontuacao<=pontuacao[x]){
				se(maiorPontuacao==pontuacao[x]){
					contMaior++	
				} senao se(maiorPontuacao<pontuacao[x]){
					contMaior = 1
				}
				maiorPontuacao=pontuacao[x]
			} 
						
			escreva("Pontuação ",x+1," é: ", pontuacao[x],"\n")
		}
		
		mediaPontuacao=somaPontuacao/10
		escreva("\nA médica aritimética é ",mediaPontuacao)
		escreva("\nA maior pontuação é ",maiorPontuacao," e o número de ocorrência da maior pontuação é ",contMaior)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 465; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */