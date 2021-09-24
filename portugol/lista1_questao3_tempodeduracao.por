programa
{
	
	funcao inicio()
	{
		inteiro horas, minutos, segundos, tempoTotal

		escreva("Digite o tempo do evento em segundos: ")
		leia(tempoTotal)

		horas = tempoTotal/3600
		minutos = (tempoTotal - (horas * 3600))/60
		segundos = (tempoTotal % 60)
		
		escreva("O tempo do evento é ",horas," horas, ",minutos," minutos e ",segundos," segundos.")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 328; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */