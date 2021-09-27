programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		real nota=0.0, totalNota=0.0, maiorNota=0.0, menorNota=10.0, media=0.0
		cadeia aluno
		
		escreva ("Digite o nome do aluno: ")
		leia(aluno)

		para (real x=1;x<=4;x++){
			escreva("Digite a nota: ")
			leia(nota)
			totalNota = totalNota + nota
			se (nota > maiorNota){
				maiorNota = nota
			}
			se(nota < menorNota){
				menorNota = nota
			}
		}

		media = mat.arredondar(totalNota/4.0, 2)
		escreva("\nRESUMO DO ALUNO")
		escreva("\nALUNO: \t\t",aluno,"\nMÉDIA: \t\t",media,"\nMAIOR NOTA: \t",maiorNota,"\nMENOR NOTA: \t",menorNota)

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 501; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */