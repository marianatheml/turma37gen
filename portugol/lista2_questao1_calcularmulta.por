programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		real P, M, E

		escreva("Digite o peso do tomate em quilos: ")
		leia(P)

		E = mat.arredondar(P-50, 2)
		M = mat.arredondar(E*4,2)

		
		se (P<=0){
			escreva("O valor é inválido, digite novamente.")
		}
		senao se (P>50){
			escreva("O valor do tomate está acima do permitido!\nIndentificamos um excesso de ", E," Kg.\nSua multa é de R$",M,".")			
		}
		senao{
			escreva("O valor está dentro do permitido!\nSua multa é de R$ 0,00.")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 374; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */