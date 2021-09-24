programa
{
	
	funcao inicio()
	{
		inteiro ano, mes, dia
		cadeia nome

		escreva("Digite o seu nome: ")
		leia(nome)
		escreva("Digite quantos dias de vida você tem: ")
		leia(dia)
		

		ano= dia/365
		mes= (dia%365)/30
		dia= (dia%365)%30

		escreva(nome,", você nasceu no dia ",dia," do mês ",mes," do ano de ",ano,".")

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 220; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */