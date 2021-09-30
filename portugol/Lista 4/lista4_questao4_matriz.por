programa
{
/*Crie um programa que receba valores do usuário para preencher uma matriz 3X3,
 * e em seguida, exiba a soma dos valores dela e a soma dos valores da primeira diagonal,
 * ou seja, diagonal principal.
*/
	inclua biblioteca Util	
	funcao inicio()
	{
		inteiro valor[3][3], soma=0, somaPrincipal=0

		para (inteiro l=0;l<3; l++){
			para (inteiro c=0; c<3; c++){
				escreva("Digite um valor para a linha ",l," e coluna ",c,": ")
				leia(valor[l][c])
				soma+=valor[l][c]
				se (l==c){
					somaPrincipal+=valor[l][c]
				}
			}	
		}
		
		limpa()
		escreva("A soma dos valores da diagonal principal é: ", somaPrincipal, "\n")
		escreva("A soma dos valores da matriz é: ", soma, "\n")


	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 549; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */