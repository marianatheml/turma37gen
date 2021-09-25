programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		
		real base, altura, area

		escreva("Digite a base do triângulo : ")
		leia(base)
		escreva("Digite a altura do triângulo : ")
		leia(altura)

		se(base<=0 ou altura<=0){
			escreva("\nValores inválidos. Digite valores positivo.")
		}
		senao{ 
			area = mat.arredondar((base*altura)/2, 2)
			escreva("\nA área do triângulo é ",area)
		
		}
			
	}
	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 242; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */