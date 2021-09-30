programa
{
	
	funcao inicio()
	{
		real salario=0.0, maiorSalario=0.0, totalSalario=0.0, totalFilhos=0.0, percentual=0.0
		inteiro quantidadeHab=0, filhos=0

		escreva("Quantas pessoas participarão da pesquisa: ")
		leia(quantidadeHab)

		para (inteiro x=1; x<=quantidadeHab; x++){
			escreva("Digite o salário do cidadão ",x,": ")
			leia(salario)
			totalSalario+=salario //totalSalario = totalSalario+salario
			
			escreva("Digite o número de filhos do cidadão ",x,": ")
			leia(filhos)
			totalFilhos+=filhos //totalFilhos = totalFilhos + filhos

			se (salario > maiorSalario){
				maiorSalario = salario
			}
			se (salario<=100){
				percentual++ //percentual = percentual + 1
			}
		}
		limpa()
		
		escreva("\nDADOS COLETADOS DOS HABITANTES\n")
		escreva("A média salarial da população: R$", (totalSalario/quantidadeHab),"\n")
		escreva("A média de filhos da população: ", (totalFilhos/quantidadeHab)," filhos\n")
		escreva("O maior salarial da população: R$", maiorSalario,"\n")
		escreva("A quantidade de pessoas que ganham até R$ 100: ", (percentual*100/quantidadeHab),"%\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 810; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */