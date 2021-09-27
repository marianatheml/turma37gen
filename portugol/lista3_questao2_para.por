programa
{
	
	funcao inicio()
	{
		inteiro somaImpares = 0

		para(inteiro i = 1; i <= 500; i++){
			se((i%3)==0 e (i%2!=0)){
				somaImpares+=i
			}
		}

		escreva("A soma de todos os multiplos de 3 é: ", somaImpares)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 205; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */