programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		real CConsumidor, CFabrica, distribuidor, impostos
		escreva("Digite o custo de fábrica do automóvel: ")
		leia(CFabrica)

		distribuidor = CFabrica * 28 / 100
		impostos = CFabrica * 45 / 100

		CConsumidor = mat.arredondar(CFabrica + distribuidor + impostos, 2)

		escreva("O custo ao consumidor de um carro novo é de R$ ", CConsumidor,".")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 414; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */