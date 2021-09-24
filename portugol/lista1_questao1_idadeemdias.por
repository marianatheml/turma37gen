programa
{
	
	funcao inicio()
	{
		inteiro ano, mes, dia, totalDias
		cadeia nome

		escreva("Digite o seu nome: ")
		leia(nome)
		escreva("Digite o ano do seu nascimento: ")
		leia(ano)
		escreva("Digite o mes do seu nascimento: ")
		leia(mes)
		escreva("Digite o dia do seu nascimento: ")
		leia(dia)

		totalDias= (ano*365) + (mes*30) + dia

		escreva("Oi ",nome,"! Sua idade em dias é ",totalDias,".")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 403; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */