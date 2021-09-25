programa
{
	
	funcao inicio()
	{
		cadeia nome
		inteiro numeroDigitado

		escreva("Digite o nome da pessoa : ")
		leia(nome)
		escreva("Digite um número positivo : ")
		leia(numeroDigitado)

		se(numeroDigitado<0){
			escreva(nome,", você digitou um número negativo!")
		}
		senao se(numeroDigitado==0){
			escreva(nome,", você digitou um número neutro!")
		}
		senao se(numeroDigitado%2==0){
			escreva(nome,", seu número é par!")
		}
		senao{
			escreva(nome,", seu número é impar!")
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 436; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */