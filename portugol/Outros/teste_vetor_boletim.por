programa
{
	
	funcao inicio()
	{
		cadeia nome
		real totalNota=0.0, media
		inteiro notas[4] //o vetor começa no 0 e vai até 3

		escreva("Digite o seu nome: ")
		leia(nome)
		notas[0]=10 

		para (inteiro x=0;x<4;x++){
			escreva("Digite uma nota: ")
			leia(notas[x])
			totalNota+=notas[x]
		}
		
		limpa()
		escreva("Boletim: \n")
		
		para (inteiro i=0;i<4;i++){
			escreva("Nota ",notas[i])
			se (notas[i]<=5){
				escreva(" - Estude um pouco mais.\n")
			} senao{
				escreva(" - Muito bem! Continue assim.\n")	
			}
		}

		media = totalNota/4
		escreva("\nA média de notas do(a) aluno(a) ",nome,": ",media,"\n")

		se (media<7){
			escreva("Resultado: Reprovado")
		} senao {
			escreva("Resultado: Aprova")
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 327; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */