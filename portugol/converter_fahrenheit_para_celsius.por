programa
{
	inclua biblioteca Matematica --> mat
	funcao inicio()
	{
		real tempc, tempf, arredondado
		cadeia nome
		
		escreva("Digite o seu nome: ")
		leia(nome)
		escreva("Digite a temperatura em Fahrenheit: ")
		leia(tempf)
		tempc= (tempf - 32) * 5 / 9
		arredondado = mat.arredondar(tempc, 2)
		escreva (nome,", a temperatura em Celsius é ",arredondado,"°C!")
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 359; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */