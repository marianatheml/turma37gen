programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		real 2 n1, n2, n3, n4, q1, q2, q3, q4

		escreva("Digite o primeiro número: ")
		leia(n1)
		escreva("Digite o segundo número: ")
		leia(n2)
		escreva("Digite o terneiro número: ")
		leia(n3)
		escreva("Digite o quarto número: ")
		leia(n4)

		q1=mat.potencia(n1, 2)
		q2=mat.potencia(n2, 2)
		q3=mat.potencia(n3, 2)
		q4=mat.potencia(n4, 2)

		se (q3>=1000){
			escreva("O quadrado do terceiro número é ",q3,".")
		}
		senao{
			escreva("O primeiro número digitado foi ",n1, " e seu quadrado é ", q1,".\n")
			escreva("O primeiro número digitado foi ",n2, " e seu quadrado é ", q2,".\n")
			escreva("O primeiro número digitado foi ",n3, " e seu quadrado é ", q3,".\n")
			escreva("O primeiro número digitado foi ",n4, " e seu quadrado é ", q4,".\n")
		}
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 422; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */