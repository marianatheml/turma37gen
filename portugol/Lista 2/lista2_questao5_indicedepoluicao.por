programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
/*A Secretaria de Meio Ambiente que controla o índice de poluição mantém 3 grupos de indústrias 
 * que são altamente poluentes do meio ambiente. 
 * O índice de poluição aceitável varia de 0,05 até 0,25. 
 * Se o índice sobe para 0,3 as indústrias do 1º grupo são intimadas a suspenderem suas atividades, 
 * se o índice crescer para 0,4 as industrias do 1º e 2º grupo são intimadas a suspenderem suas atividades, 
 * se o índice atingir 0,5 todos os grupos devem ser notificados a paralisarem suas atividades. 
 * Faça um sistema que leia o índice de poluição medido 
 * e emita a notificação adequada aos diferentes grupos de empresas
*/
		real indicePoluicao
		
		escreva("Digite o índice de poluição atual: ")
		leia(indicePoluicao)

		escreva("\nÍndice de poluição atual: ",indicePoluicao,"\n")
		escreva("Notificação: ")
		
				
		senao se(indicePoluicao>=0.50){
			escreva("TODOS OS GRUPOS - SUSPENDAM AS ATIVIDADES IMEDIATAMENTE")
		}
			senao se(indicePoluicao>=0.40){
			escreva("INDÚSTRIAS DO 1º GRUPO E 2º GRUPO - SUSPENDAM AS ATIVIDADES IMEDIATAMENTE")
		}
		senao se(indicePoluicao>=0.30){
			escreva("INDÚSTRIAS DO 1º GRUPO - SUSPENDAM AS ATIVIDADES IMEDIATAMENTE")
		}
		se (indicePoluicao<=0.29){
			escreva("ÍNDICE DE POLUIÇÃO ATUAL ACEITÁVEL")
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1326; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */