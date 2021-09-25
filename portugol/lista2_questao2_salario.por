programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
/*Elabore um sistema que leia as variáveis C e N, respectivamente código e número de horas trabalhadas de um operário.
 * Calcule o salário sabendo-se que ele ganha R$ 10,00 por hora. 
 * Quando o número de horas exceder a 50, calcule o excesso de pagamento armazenando-o na variável E,
 * caso contrário zerar tal variável.
 * A hora excedente de trabalho vale R$ 20,00.
 * No final do processamento imprimir o salário total e o salário excedente.
*/
		real salarioNormal, N, E, salarioExcedente, salarioTotal
		cadeia nome, C

		escreva("Digite o seu nome: ")
		leia(nome)
		escreva(nome,", digite o seu código: ")
		leia(C)
		escreva(nome,", digite sua hora de trabalho: ")
		leia(N) 

		salarioNormal = mat.arredondar(50*10, 2)
		E = mat.arredondar(N-50, 2)
		salarioExcedente = mat.arredondar(E*20,2)
		salarioTotal = mat.arredondar(salarioNormal+salarioExcedente, 2)
		
		escreva("\nRelatório salarial:\n")
		
		se (N<=50){
			salarioExcedente = 0.0
			salarioTotal = mat.arredondar(N*10, 2)
		}
		senao se (N>50){
			E = mat.arredondar(N-50, 2)
			salarioExcedente = mat.arredondar(E*20,2)
			salarioTotal = mat.arredondar((50*10)+salarioExcedente, 2)	
		}
			
		se (N<=0){
			escreva("Número de horas inválido.\n")
		}
		senao{
			escreva("Funcionário: ",C,".\n")
			escreva("Salário total: R$ ",salarioTotal,"\n")
			escreva("Salário excedente: R$ ",salarioExcedente,"\n")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 395; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */