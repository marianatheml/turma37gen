programa
{
	inclua biblioteca Matematica --> mat
	funcao inicio()
	{
		real totalValores=0.0, valor=0.0, soma=0.0

		enquanto (valor>=0){
			
			escreva("Digite um valor positivo ou forneça um valor negativo para parar: ")
			leia(valor)
			se (valor>0){
			totalValores++
			soma+=valor	
			}		
		}	
		
		limpa()
		escreva("A soma dos valores digitados é: ",soma,"\n")
		escreva("O total dos valores digitados é: ",totalValores,"\n")
		escreva("A média dos valores digitados é: ",mat.arredondar(soma/totalValores, 2),"\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 303; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */